package viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.senac.ex01_layout.db.TaskDao

class TaskViewModelFactory(private val taskDao: TaskDao): ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TaskViewModel(taskDao) as T
    }
}