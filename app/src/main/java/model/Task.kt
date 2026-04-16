package model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "tasks")
data class Task (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String= "",
    val status: Status= Status.NotDone,
    val priority: Priority= Priority.Low,
    val dateTime: LocalDateTime = LocalDateTime.now()
)

enum class Status(){
    Done,
    NotDone
}

enum class Priority(){
    Low,
    Medium,
    High
}