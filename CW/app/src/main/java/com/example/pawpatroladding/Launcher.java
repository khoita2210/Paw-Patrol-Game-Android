package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class Launcher extends AppCompatActivity { /*Launcher screen*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        final MediaPlayer startsong = MediaPlayer.create(Launcher.this, R.raw.themesong);

        Animation(); /*run the finger animation*/
        startsong.start(); /*start song when open the app*/


    }

    public void switchToPlay(View v) { /*If clicked move to MainActivity*/

        startActivity(new Intent(Launcher.this, MainActivity.class));
        v.startAnimation(buttonClick);
    }

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F); /*Button Clicked effect*/

    ImageView finger;
    AlphaAnimation alpha;
    private void Animation() {
        finger= (ImageView) findViewById(R.id.pointingFinger);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        alpha.setRepeatCount(Animation.INFINITE);
        finger.startAnimation(alpha);
    }


}