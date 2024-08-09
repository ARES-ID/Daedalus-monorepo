package com.rjspies.daedalus.data

import android.database.sqlite.SQLiteConstraintException
import androidx.room.Room
import com.rjspies.daedalus.data.data.Weight
import com.rjspies.daedalus.data.data.WeightDao
import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.property.checkAll
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import java.io.IOException
import java.time.ZonedDateTime
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

@RunWith(RobolectricTestRunner::class)
class WeightDatabaseTest {
    private lateinit var weightDao: WeightDao
    private lateinit var database: WeightDatabase

    @Before
    fun createDatabase() {
        val context = RuntimeEnvironment.getApplication().applicationContext
        database = Room.inMemoryDatabaseBuilder(context, WeightDatabase::class.java).build()
        weightDao = database.weightDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDatabase() {
        database.close()
    }

    @Test
    @Throws(Exception::class)
    fun readWriteWeight() {
        runBlocking {
            checkAll<Float, String> { weight, note ->
                val optionalNote = if (note.length % 2 == 0) null else note

                if (weight.isNaN()) {
                    shouldThrowExactly<SQLiteConstraintException> {
                        weightDao.insert(Weight(value = weight, note = optionalNote, dateTime = ZonedDateTime.now()))
                    }
                } else {
                    weightDao.insert(Weight(value = weight, note = optionalNote, dateTime = ZonedDateTime.now()))
                }

                weightDao.weightsDescending().onEach { weights ->
                    weights.forEach {
                        assert(it.value == weight)
                        assert(it.note == optionalNote)
                        weightDao.deleteWeight(it.id)
                    }
                }
            }
        }
    }
}
