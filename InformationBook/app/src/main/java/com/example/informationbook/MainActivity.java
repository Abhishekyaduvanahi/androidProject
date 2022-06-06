package com.example.informationbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private ArrayList<ModelClass> arrayList;
    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        arrayList = new ArrayList<>();

        ModelClass modelClass1 = new ModelClass("countries ","The Countries");
        ModelClass modelClass2 = new ModelClass("leaders ","The Leaders ");
        ModelClass modelClass3 = new ModelClass(" museuem ","The Museum");
        ModelClass modelClass4 = new ModelClass("wondersw ","Seven Wonders of the World ");

        // transfered all the objects into an arraylist
        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adapter = new AdapterClass (arrayList,this);
        recyclerView.setAdapter(adapter);


    }
}