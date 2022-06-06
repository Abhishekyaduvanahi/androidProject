package com.example.recyclerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CountryViewHolder> {

    private ArrayList<String> countryNameList ;
    private ArrayList<String>detailsList ;
    private ArrayList<Integer>imageList ;
    private Context context;

    public RecyclerAdapter(ArrayList<String> countryNameList, ArrayList<String> detailsList, ArrayList<Integer> imageList, Context context) {
        this.countryNameList = countryNameList;
        this.detailsList = detailsList;
        this.imageList = imageList;
        this.context = context;

    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewCountryName,textViewDetails;
        private ImageView imageView;

          public CountryViewHolder(@NonNull View itemView) {
              super(itemView);
              textViewCountryName = itemView.findViewById(R.id.textViewCountryName);
              textViewDetails =itemView.findViewById(R.id.textViewDetail);
              imageView = itemView.findViewById(R.id.imageView);

          }
      }
}
