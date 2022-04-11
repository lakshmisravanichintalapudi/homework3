package com.sravani4554.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class music extends AppCompatActivity {
    Button btn1,btn2;
    MediaPlayer mp1, mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        final MediaPlayer mp1 = MediaPlayer.create(music.this,R.raw.mariome);
        final MediaPlayer mp2 = MediaPlayer.create(music.this,R.raw.mariome);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp1.isPlaying() && mp2 == null){
                    if(mp1 != null)
                        mp1.pause();
                }else{
                    if(mp1 !=null){
                        mp1.start();
                    }
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying() && mp1 == null){
                    if(mp2 != null)
                        mp2.pause();
                }else{
                    if(mp2 !=null){
                        mp2.start();
                    }
                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        mp1.stop();
        mp2.stop();
    }
}