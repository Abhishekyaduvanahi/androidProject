package com.example.connectodb.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.connectodb.parms.Params;

public class MyDbHandler extends SQLiteOpenHelper {




    public MyDbHandler(Context context) {
        super(context,Params.DB_NAME,null,Params.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create ="CREATE TABLE " + Params.TABLE_NAME + "("
        + Params.KEY_ID + "INTEGER PRIMARY KEY ,"
                + Params.KEY_NAME +"TEXT,"+Params.KEY_PHONE + "TEXT" +")" ;
        Log.d("dbharry"," Querry being run is :" + create);
        db.execSQL(create);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
