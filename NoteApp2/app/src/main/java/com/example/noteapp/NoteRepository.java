package com.example.noteapp;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class NoteRepository {

    private NoteDao noteDao;
    private LiveData<List<Note>>notes;

    public NoteRepository(Application application){

        NoteDatabase database = NoteDatabase.getInstance(application);
        noteDao = database.noteDao();
        notes = noteDao.getAllNotes();
    }

    public void insert(Note note){


    }
    public void delete(Note note ){


    }
    public void Update(Note note ){


    }
    public LiveData<List<Note>>getAllNotes(){

       return notes;
    }


    //1. parameter background method

    //2. parameter for onProgress method

    // 3. parameter return type of doInBackground


    private static class InsertNoteAsyncTask extends AsyncTask<Note,Void,Void> {

        private NoteDao noteDao;

        private insertNoteAsyncTask()

        @Override
        protected Void doInBackground(Note... notes) {
            return null;
        }


    }
}
