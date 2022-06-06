package com.example.slomo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv =findViewById(R.id.videoView);
        vv.setVideoPath("android.resource://" +getPackageName() + "/" +R.raw.clip);
        MediaController mediaController = new MediaController(this);
        vv.setMediaController(mediaController);
        mediaController.setAnchorView(vv);
        vv.start();
    }
}