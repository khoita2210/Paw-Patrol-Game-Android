package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView; // for linking the ImageView object
import android.view.MotionEvent; //for touch and drag event
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);
        ImageView paw,ryder,chase,sky,marshall,rocky,rubble,zuma,everest,rex;
        paw= (ImageView) findViewById(R.id.logoPaw);
        paw.setOnTouchListener(handleTouch);
        ryder = (ImageView) findViewById(R.id.logoRyder);
        ryder.setOnTouchListener(handleTouch);
        chase = (ImageView) findViewById(R.id.logoChase);
        chase.setOnTouchListener(handleTouch);
        marshall = (ImageView) findViewById(R.id.logoMashall);
        marshall.setOnTouchListener(handleTouch);
        sky = (ImageView) findViewById(R.id.logoSky);
        sky.setOnTouchListener(handleTouch);
        rocky = (ImageView) findViewById(R.id.logoRocky);
        rocky.setOnTouchListener(handleTouch);
        rubble = (ImageView) findViewById(R.id.logoRubble);
        rubble.setOnTouchListener(handleTouch);
        zuma = (ImageView) findViewById(R.id.logoZuma);
        zuma.setOnTouchListener(handleTouch);
        everest = (ImageView) findViewById(R.id.logoEverest);
        everest.setOnTouchListener(handleTouch);
        rex = (ImageView) findViewById(R.id.logoRex);
        rex.setOnTouchListener(handleTouch);


        int[] array = number();
        int rightNumber = array[0];
        int leftNumber = array[1];
        TextView rightOpenand, leftOpenand;
        rightOpenand = (TextView) findViewById(R.id.rightOpenand);
        rightOpenand.setText(rightNumber + "");
        leftOpenand = (TextView) findViewById(R.id.leftOpenand);
        leftOpenand.setText(leftNumber + "");





    }


    private View.OnTouchListener handleTouch = new View.OnTouchListener() {
        float dX, dY;
        @Override
        public boolean onTouch(View view, MotionEvent event) {

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    dX = view.getX() - event.getRawX();
                    dY = view.getY() - event.getRawY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    view.animate()
                            .x(event.getRawX() + dX)
                            .y(event.getRawY() + dY)
                            .setDuration(0)
                            .start();
                    break;
                default:
                    return false;
            }
            return true;
        }
    };

    private static int[] number(){/*new function to create 2 random number have sum less than 9 using do{} while loop and
     pass the value to a int array*/
        Random r = new Random();
        int number1;
        int number2;
        do
        {
            number1= r.nextInt(10);
            number2 = r.nextInt(10);


        }
        while(number1 + number2 >=10);
        return new int[] {number1, number2};

    }




}