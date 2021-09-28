package com.example.android.notesapp

import androidx.lifecycle.LiveData

class NoteRepository (private val noteDao: NoteDao){

    fun allData() : LiveData<List<Note>> = noteDao.getAll()


    suspend fun insert(note : Note){
        noteDao.insert(note)
    }

    suspend fun delete (note : Note){
        noteDao.delete(note)
    }
}