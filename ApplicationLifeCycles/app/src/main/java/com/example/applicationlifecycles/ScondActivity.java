package com.example.applicationlifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ScondActivity extends AppCompatActivity {
  Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);

        button =findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        Log.d("MESSAGE","Second Activity onCreate");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MESSAGE","SecondActivity onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MESSAGE","SecondActivity onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MESSAGE","SecondActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MESSAGE","SecondActivity onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MESSAGE","SecondActivity onResume");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MESSAGE","Second Activity onRestart");
    }
}