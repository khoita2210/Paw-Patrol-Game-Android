package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layer);
        AlphaAnimation();

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

//Extracting the stored data from the bundle

        int leftValue = extras.getInt("LEFT_VALUE");
        int rightValue = extras.getInt("RIGHT_VALUE");
        int clickedValue = extras.getInt("CLICKED_VALUE");
        TextView LeftView = (TextView) findViewById(R.id.leftOpenandResults);
        LeftView.setText(leftValue+"");
        TextView RightView = (TextView) findViewById(R.id.rightOpenandResults);
        RightView.setText(rightValue+"");
        TextView AnswerView = (TextView) findViewById(R.id.clickedResult);
        AnswerView.setText(clickedValue+"");




    }

    public void switchToPlay(View v) {

        startActivity(new Intent(ResultActivity.this, MainActivity.class));;
    }


    ImageView congrat1;
    ImageView congrat2;
    ImageView congrat3;
    ImageView congrat4;


    AlphaAnimation alpha;



    private void AlphaAnimation(){
        congrat1 = (ImageView) findViewById(R.id.hooray1);
        congrat2 = (ImageView) findViewById(R.id.hooray2);
        congrat3 = (ImageView) findViewById(R.id.ryderJump);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        congrat1.startAnimation(alpha);
        congrat2.startAnimation(alpha);
        congrat3.startAnimation(alpha);

    }




}




