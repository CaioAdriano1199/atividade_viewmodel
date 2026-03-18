package viewmodel

import android.app.DatePickerDialog
import android.widget.Toast
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import model.Priority
import model.Status
import model.Task
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Locale

class TaskViewModel: ViewModel() {

    private val _state = MutableStateFlow(Task())

    val uiState = _state.asStateFlow()




    fun updateTitle(title: String){
        _state.value = _state.value.copy(title = title)
    }

    fun updateStatus(status: Status){
        _state.value = _state.value.copy(status = status)
    }

    fun updatePriority(priority: Priority){
        _state.value = _state.value.copy(priority = priority)
    }

    //update date time

    fun cancel(){

    }
    fun reset(){

    }
    fun submit(){

    }
}