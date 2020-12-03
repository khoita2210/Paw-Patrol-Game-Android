package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent; //for starting another activity
import android.content.pm.ActivityInfo;//for setting screen portrait
import android.media.MediaPlayer;//for linking WAV.file
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Launcher extends AppCompatActivity { /*Launcher screen*/

    ImageButton playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);/*Make the app portrait*/
        setContentView(R.layout.activity_launcher);
        final MediaPlayer Song = MediaPlayer.create(Launcher.this, R.raw.pawpatrolpuppupboogie); /*Back ground song */
        Song.start(); /*start song when open the app*/
        Animation(); /*run the finger animation*/
        playButton = (ImageButton) findViewById(R.id.playButton); /*finds the view from the layout resource*/
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {/*When clicked set the value of numberClick to 0 and compare
                it with the sum of Left and Right open and*/
                switchToPlay();
                playButton.startAnimation(buttonClick);
                Song.stop();
            }
        });
    }

    private void switchToPlay() { /*If clicked move to MainActivity*/

        startActivity(new Intent(Launcher.this, MainActivity.class));
    }

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F); /*Button Clicked effect*/

    ImageView finger;
    AlphaAnimation alpha;
    private void Animation() { /*Set animation */
        finger= (ImageView) findViewById(R.id.pointingFinger);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        alpha.setRepeatCount(Animation.INFINITE);
        finger.startAnimation(alpha);
    }

}