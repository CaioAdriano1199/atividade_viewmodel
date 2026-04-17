package com.senac.ex01_layout.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import model.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
@TypeConverters(DatabaseConverters::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun taskDao(): TaskDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?:synchronized(this) {
                val _db =
                    Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "TaskDB"
                    ).build()
                INSTANCE = _db
                return _db
            }

            }


        }

}