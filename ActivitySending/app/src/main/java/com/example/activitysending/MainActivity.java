package com.example.activitysending;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText name ,email,phone;
    Button signUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        email =findViewById(R.id.editTextEmail);
        phone = findViewById(R.id.editTextEmail);


        signUp=findViewById(R.id.buttonSignUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = name.getText().toString();
                String userEmail = email.toString();
                //String userNumber = phone.getText().toString();

                 int userNumber = Integer.valueOf(phone.getText().toString());

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("name",userName);
                i.putExtra("email",userEmail);
                i.putExtra("phone",userNumber);
                startActivity(i);



            }
        });




    }
}