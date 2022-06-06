package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String>countryNameList = new ArrayList<>();
    private ArrayList<String>detailsList = new ArrayList<>();
    private ArrayList<Integer>imageList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryNameList.add("INDIA ");
        countryNameList.add("UNITED KINGDOM");

        detailsList.add("This is INDIA ");
        detailsList.add("united kingdom flag is this ");

        imageList.add(R.drawable.india);
        imageList.add(R.drawable.england);

    }
}