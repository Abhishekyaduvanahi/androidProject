package com.example.retrofit;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView texta,textb,textc,textd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        texta = findViewById(R.id.texta);
        textb = findViewById(R.id.textb);
        textc = findViewById(R.id.textc);
        textd = findViewById(R.id.textd);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitApi retrofitApi = retrofit.create(RetrofitApi.class);

        Call<List<ModelClass>> call = retrofitApi.getModelClass();

        call.enqueue(new Callback<List<ModelClass>>() {
            @Override
            public void onResponse(Call<List<ModelClass>> call, Response<List<ModelClass>> response) {


                if(!response.isSuccessful())
                {
                    texta.setText("error");
                    textb.setText("error");
                    textc.setText("error");
                    textd.setText("error");
                }
                List<ModelClass> data = response.body();

                texta.setText(""+data.get(0).getUserId());
                textb.setText(  ""+data.get(0).getId());
                textc.setText(""+data.get(0).getTitle());
                textd.setText(""+ data.get(0).getBody());
            }

            @Override
            public void onFailure(Call<List<ModelClass>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "There is an error", Toast.LENGTH_SHORT).show();

            }
        });

    }
}