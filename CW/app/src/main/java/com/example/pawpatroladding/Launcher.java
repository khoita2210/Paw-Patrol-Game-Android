package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;

public class Launcher extends AppCompatActivity { /*Launcher screen*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        final MediaPlayer startsong = MediaPlayer.create(Launcher.this, R.raw.onaroll);
        startsong.start();

    }

    public void switchToPlay(View v) { /*If clicked move to MainActivity*/

        startActivity(new Intent(Launcher.this, MainActivity.class));
        v.startAnimation(buttonClick);
    }

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F); /*Button Clicked effect*/

}