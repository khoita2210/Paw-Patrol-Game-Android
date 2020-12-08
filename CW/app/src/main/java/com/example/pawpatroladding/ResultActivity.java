package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent; //for starting another activity
import android.content.pm.ActivityInfo;//for setting screen portrait
import android.media.MediaPlayer;//for linking WAV.file
import android.os.Bundle;//linking to pass variable between activities
import android.view.animation.Animation;//for animation
import android.view.animation.AlphaAnimation;//for AlphaAnimation
import android.view.View;
import android.widget.ImageButton;//for linking ImageButton object
import android.widget.ImageView; // for linking the ImageView object
import android.widget.TextView;//for linking TextView object
import android.view.animation.TranslateAnimation; //for linking TranslateAnimation

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);/*Make the app portrait*/
        setContentView(R.layout.result_layer);

        /*pop up the image*/
        AlphaAnimation();
        TranslateAnimation();

        final MediaPlayer welldonesong = MediaPlayer.create(ResultActivity.this, R.raw.complete);


        /*Extracting the stored data from the bundle from MainActivity*/
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();



        int leftValue = extras.getInt("LEFT_VALUE");
        int rightValue = extras.getInt("RIGHT_VALUE");
        int clickedValue = extras.getInt("CLICKED_VALUE");
        TextView LeftView = (TextView) findViewById(R.id.leftOpenandResults);
        LeftView.setText(leftValue+"");
        TextView RightView = (TextView) findViewById(R.id.rightOpenandResults);
        RightView.setText(rightValue+"");
        TextView AnswerView = (TextView) findViewById(R.id.clickedResult);
        AnswerView.setText(clickedValue+"");
        welldonesong.start();
        HelpAnimation();

        rePlay = (ImageButton) findViewById(R.id.replayButton); /*finds the view from the layout resource*/
        rePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {/*When clicked set the value of numberClick to 0 and compare
                it with the sum of Left and Right open and*/
                switchToPlay();
                rePlay.startAnimation(buttonClick);
                welldonesong.stop();
            }
        });





    }

    ImageButton rePlay;
    public void switchToPlay() {/*Repeat button*/

        startActivity(new Intent(ResultActivity.this, MainActivity.class));;

    }


    ImageView congrat1;
    ImageView congrat2;
    ImageView congrat3;
    ImageView congrat4;





    TranslateAnimation trans,trans2;

    private void TranslateAnimation(){ /*Translate Animation*/
        congrat4 = (ImageView) findViewById(R.id.rubble);
        trans = new TranslateAnimation(0, 80, 0,0);
        trans.setDuration(7000);
        congrat4.startAnimation(trans);
        congrat3 = (ImageView) findViewById(R.id.ryderJump);
        trans2 = new TranslateAnimation(150,50, 0,0);
        trans2.setDuration(7000);
        congrat3.startAnimation(trans2);
    }
    AlphaAnimation alpha;
    private void AlphaAnimation(){ /*Start the alpha animation*/
        congrat1 = (ImageView) findViewById(R.id.hooray1);
        congrat2 = (ImageView) findViewById(R.id.hooray2);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(1700);
        congrat1.startAnimation(alpha);
        congrat2.startAnimation(alpha);

    }

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.1F); /*Button clicked effect */



    ImageView finger;
    AlphaAnimation alpha1;
    private void HelpAnimation() {   /*Create a new animation*/
        finger= (ImageView) findViewById(R.id.pointfinger2);
        alpha1 = new AlphaAnimation(0, 1);
        alpha1.setDuration(2000);
        alpha1.setRepeatCount(Animation.INFINITE);
        finger.startAnimation(alpha1);
    }






}




