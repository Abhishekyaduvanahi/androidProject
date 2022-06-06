
package com.example.toolcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WorkNeeder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_needer);
    }
    public void openActivity2(View view) {

        Toast.makeText(this, "YOUR RECORD  IS SUBMITTED THANK YOU FOR SUBMITTING  ", Toast.LENGTH_SHORT).show();
    }
    }
