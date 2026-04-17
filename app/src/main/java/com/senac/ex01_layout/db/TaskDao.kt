package com.senac.ex01_layout.db;

import androidx.room.Dao;
import androidx.room.Delete
import androidx.room.Insert;
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import model.Task

@Dao
interface TaskDao {

    @Insert
    suspend fun insert(task: Task);

    @Upsert
    suspend fun upsert(task: Task): Long

    @Update
    suspend fun update(task: Task)

    @Delete
    suspend fun delete(task: Task)

    @Query("SELECT * FROM tasks order by title")
    suspend fun findAll(): List<Task>
}
