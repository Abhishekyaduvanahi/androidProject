package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity3 extends AppCompatActivity {
    TextView score;
    TextView life;
    TextView time;


    TextView question;
    EditText answer;

    Button ok;
    Button next;
    Random random = new Random();
    int number3;
    int number4;
    int userAnswer;
    int realAnswer;
    int userScore = 0;
    int userLife = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        score = findViewById(R.id.textViewScore1);
        life = findViewById(R.id.textViewLife1);
        question = findViewById(R.id.textViewQuestion1);
        answer = findViewById(R.id.editTextTextAnswer1);
        ok =findViewById(R.id.buttonOk1);
        next=findViewById(R.id.buttonNext1);
        gameContinue1();
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userAnswer = Integer.valueOf(answer.getText().toString());

                if(userAnswer==realAnswer){
                    userScore = userScore +10;
                    score.setText("" +userScore);
                    question.setText("Congratulations , your answer is true");
                }
                else{
                    userLife = userLife-1;
                    life.setText("" +userLife);
                    question.setText("Sorry, your answer is wrong");
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameContinue1();

            }
        });
    }
    public void gameContinue1()
    {
        number3= random.nextInt(10);
        number4 = random.nextInt(20);

        realAnswer = number3 * number4;
        question.setText(number3 + " * " +number4);

    }


}