package com.example.android.notesapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import java.security.cert.LDAPCertStoreParameters

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    val allNotes  : LiveData<List<Note>>

    init {
        val dao = NoteDatabase.getDatabase(application).getNoteDao()
        val repository = NoteRepository(dao)
        allNotes = repository.allData()
    }

}