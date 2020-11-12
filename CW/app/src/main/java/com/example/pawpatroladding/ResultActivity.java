package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;

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
    }

    public void switchToPlay(View v) {

        startActivity(new Intent(ResultActivity.this, MainActivity.class));;
    }
}