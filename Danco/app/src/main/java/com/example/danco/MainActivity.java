package com.example.danco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
   VideoView dance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         dance =findViewById(R.id.slowmo);
        dance.setVideoPath("android.resource://" +getPackageName() + "/" +R.raw.ab);
       MediaController mediaController = new MediaController (this);
        dance.setMediaController(mediaController);
        mediaController.setAnchorView(dance);
        dance.start();
    }
}
