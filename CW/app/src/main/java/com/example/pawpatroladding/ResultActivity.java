package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.view.animation.AlphaAnimation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView; // for linking the ImageView object
import android.view.MotionEvent; //for touch and drag event
import android.widget.TextView;
import android.view.animation.ScaleAnimation;
import android.util.Log;  //Used for Log

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layer);

        AlphaAnimation();/*pop up the image*/

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




    }

    public void switchToPlay(View v) {/*Repeat button*/

        startActivity(new Intent(ResultActivity.this, MainActivity.class));;
        v.startAnimation(buttonClick);
    }


    ImageView congrat1;
    ImageView congrat2;
    ImageView congrat3;


    AlphaAnimation alpha;



    private void AlphaAnimation(){ /*Start the alpha animation*/
        congrat1 = (ImageView) findViewById(R.id.hooray1);
        congrat2 = (ImageView) findViewById(R.id.hooray2);
        congrat3 = (ImageView) findViewById(R.id.ryderJump);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(1700);
        congrat1.startAnimation(alpha);
        congrat2.startAnimation(alpha);
        congrat3.startAnimation(alpha);

    }

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.1F); /*Button clicked effect */




}




