package com.rjspies.daedalus.ui.insertweight

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rjspies.daedalus.common.AddWeightError
import com.rjspies.daedalus.domain.InsertWeightUseCase
import com.rjspies.daedalus.ui.common.SavedStateHandleKeyUiState
import org.koin.android.annotation.KoinViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

@KoinViewModel
internal class InsertWeightViewModel(
    private val savedStateHandle: SavedStateHandle,
    private val insertWeightUseCase: InsertWeightUseCase,
) : ViewModel() {
    val uiState: StateFlow<InsertWeightUiState> = savedStateHandle.getStateFlow(
        key = SavedStateHandleKeyUiState,
        initialValue = InsertWeightUiState(),
    )

    fun setDismissDialog(dismissDialog: () -> Unit) {
        savedStateHandle[SavedStateHandleKeyUiState] = uiState.value.copy(dismissDialog = dismissDialog)
    }

    fun setError(error: AddWeightError?) {
        savedStateHandle[SavedStateHandleKeyUiState] = uiState.value.copy(error = error)
    }

    private fun setIsLoading(isLoading: Boolean) {
        savedStateHandle[SavedStateHandleKeyUiState] = uiState.value.copy(isLoading = isLoading)
    }

    fun insertWeight(weightValue: String) {
        val job = viewModelScope.launch(Dispatchers.IO) {
            setError(null)
            setIsLoading(true)
            val parsedWeightValue = weightValue.parseToFloat()
            if (parsedWeightValue != null) {
                val weight = com.rjspies.daedalus.domain
                    .Weight(value = parsedWeightValue)
                insertWeightUseCase(weight)
                uiState.value.dismissDialog()
            } else {
                setError(AddWeightError.ParseFloatError)
            }
        }

        job.invokeOnCompletion {
            setIsLoading(false)
        }
    }
}

private fun String.parseToFloat(): Float? = replace(",", ".").toFloatOrNull()
