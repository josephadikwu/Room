package com.example.room.db.dao

import androidx.room.*
import com.example.room.db.entities.NoteEntity

@Dao
interface NoteDao {
    @Query("SELECT * FROM NOTE")
    fun selectAllNotes(): List<NoteEntity>

    @Insert
    fun insertNotes(noteEntity: NoteEntity)

    @Delete
    fun deleteNotes(noteEntity: NoteEntity)

    @Update
    fun updateNotes(noteEntity: NoteEntity)
}