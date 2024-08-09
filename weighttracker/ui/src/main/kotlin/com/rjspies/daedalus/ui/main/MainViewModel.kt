package com.rjspies.daedalus.ui.main

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.rjspies.daedalus.ui.common.SavedStateHandleKeyUiState
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
internal class MainViewModel(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
    val uiState = savedStateHandle.getStateFlow(
        key = SavedStateHandleKeyUiState,
        initialValue = MainUiState(),
    )

    fun setShowDialog(showDialog: Boolean) {
        savedStateHandle[SavedStateHandleKeyUiState] = uiState.value.copy(showDialog = showDialog)
    }
}
