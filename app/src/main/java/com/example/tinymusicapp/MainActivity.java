package com.example.tinymusicapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {


    private Button b1, b2;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b1 = (Button) findViewById(R.id.play);
        b2 = (Button) findViewById(R.id.pause);


        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.random_song);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                mediaPlayer.pause();
                
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();


            }


        });
    }
}
