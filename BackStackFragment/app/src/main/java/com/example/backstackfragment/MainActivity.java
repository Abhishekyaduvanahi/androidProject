package com.example.backstackfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button replace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FirstFragment firstFragment = new FirstFragment();

        fragmentTransaction.add(R.id.frame,firstFragment);
      //  SecondFragment secondFragment = new SecondFragment();

        fragmentTransaction.commit();

        replace = findViewById(R.id.buttonReplace);


        replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager1 =getSupportFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();

                SecondFragment secondFragment = new SecondFragment();

                fragmentTransaction1.replace(R.id.frame,secondFragment);
                
                // for going back to first fragment

                fragmentTransaction1.addToBackStack(null);

                fragmentTransaction1.commit();






            }
        });



    }
}