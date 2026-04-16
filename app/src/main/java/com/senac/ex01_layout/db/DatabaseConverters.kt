package com.senac.ex01_layout.db

import androidx.room.TypeConverter
import model.Priority
import model.Status
import java.time.LocalDateTime
import java.time.ZoneOffset

class DatabaseConverters {

    @TypeConverter
    fun toStatus(ordinal: Int): Status {
        return Status.values()[ordinal]
    }

    @TypeConverter
    fun fromStatus(status: Status): Int {
        return status.ordinal
    }

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name

    }

    @TypeConverter
    fun toPriority(priorityName: String): Priority {
        return Priority.valueOf(priorityName)
    }

    @TypeConverter
    fun fromLocalDateTime(dateTime: LocalDateTime): Long {
        return dateTime.toEpochSecond(ZoneOffset.UTC)

    }

    @TypeConverter
    fun toLocalDateTime(epochSecond: Long): LocalDateTime {
        return LocalDateTime.ofEpochSecond(epochSecond, 0, ZoneOffset.UTC)
    }
}



