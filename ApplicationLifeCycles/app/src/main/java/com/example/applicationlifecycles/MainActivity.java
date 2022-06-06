package com.example.applicationlifecycles;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button1;
    Button button2;
    int counter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView2);
        button1 =findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter =counter +1;
                textView.setText("" + counter);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i = new Intent(getApplicationContext(),ScondActivity.class);
              startActivity(i);
            }
        });
        Log.d("MESSAGE","FirstActivity onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MESSAGE","FirstActivity onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MESSAGE","FirstActivity onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MESSAGE","FirstActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MESSAGE","FirstActivity onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MESSAGE","FirstActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MESSAGE","FirstActivity onRestart");
    }
}