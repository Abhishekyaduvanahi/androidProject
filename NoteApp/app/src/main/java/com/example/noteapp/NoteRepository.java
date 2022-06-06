package com.example.noteapp;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.nio.channels.AsynchronousChannelGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NoteRepository {


    private NoteDao noteDao;
    private LiveData<List<Note>> notes;

    ExecutorService executors = Executors.newSingleThreadExecutor();


    public NoteRepository(Application application ){

        NoteDatabase database = NoteDatabase.getInstance(application);
        noteDao = database.noteDao();
        notes = noteDao.getAllowNotes();
    }
    public  void insert(Note note ){

        // new InsertNoteAsyncTask(noteDao).execute(note);

        executors.execute(new Runnable() {
            @Override
            public void run() {
                noteDao.insert(note);
            }
        });

    }

    public void update(Note note){
        // new InsertNoteAsyncTask(noteDao).execute(note);
        executors.execute(new Runnable() {
            @Override
            public void run() {
                noteDao.update(note);
            }
        });

    }


    public  void delete(Note note){
        // new InsertNoteAsyncTask(noteDao).execute(note);
        executors.execute(new Runnable() {
            @Override
            public void run() {
                noteDao.delete(note);
            }
        });

    }

    public LiveData<List<Note>> getAllNotes() {

        return notes;
    }
    // 1 parameter for do in background method

    // 2. parameter for onProgressUpdate  method

    // 3. parameter return type of doInBackground

   // private static class InsertNoteAsyncTask extends AsyncTask<Note,Void,Void>{
    /*
        private NoteDao noteDao;

        private InsertNoteAsyncTask(NoteDao noteDao){


            this.noteDao=noteDao;
        }
        @Override
        protected Void doInBackground(Note... notes) {
            noteDao.insert(notes[0]);
            return null;
        }


    }
    private static class UpdateNoteAsyncTask extends AsyncTask<Note,Void,Void>{

        private NoteDao noteDao;

        private UpdateNoteAsyncTask(NoteDao noteDao){


            this.noteDao=noteDao;
        }
        @Override
        protected Void doInBackground(Note... notes) {
            noteDao.update(notes[0]);
            return null;
        }


    }
    private static class DeleteNoteAsyncTask extends AsyncTask<Note,Void,Void>{

        private NoteDao noteDao;

        private DeleteNoteAsyncTask(NoteDao noteDao){


            this.noteDao=noteDao;
        }
        @Override
        protected Void doInBackground(Note... notes) {
            noteDao.delete(notes[0]);
            return null;
        }


    }

     */
}
