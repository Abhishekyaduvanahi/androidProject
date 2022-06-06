package com.example.newzo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import javax.security.auth.callback.Callback;

public class Homefragments extends Fragment {
    String api ="0b4f197859cc49c3b87c17a34fe304a7";
    ArrayList<Modalclass>modalclassArrayList;
    Adapter adapter;
    String country="in";
    private RecyclerView recyclerViewOfHome;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.homefragments,null);


        recyclerViewOfHome=v.findViewById(R.id.recyclerViewOfHome);
        modalclassArrayList = new ArrayList<>();
        recyclerViewOfHome.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(),modalclassArrayList);
        recyclerViewOfHome.setAdapter(adapter);

        findNews();
        return v;
    }

    private void findNews() {


         ApiUtilities.getApiInterface().getNews(country,100,api).enqueue(new Callback<mainNews>(){





                                                                         }
         );

    }
}
