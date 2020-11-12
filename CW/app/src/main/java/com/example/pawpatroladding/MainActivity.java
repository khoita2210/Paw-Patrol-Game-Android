package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageButton;
import android.widget.ImageView; // for linking the ImageView object
import android.view.MotionEvent; //for touch and drag event
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ImageButton button0,button1, button2,button3, button4, button5, button6, button7, button8,button9;
    ImageView chaseWrong, oops;
    AlphaAnimation alpha;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);
        ImageView paw, ryder, chase, sky, marshall, rocky, rubble, zuma, everest, rex;
        paw = (ImageView) findViewById(R.id.logoPaw);
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
        final int sum2 = rightNumber +leftNumber;
        TextView rightOpenand, leftOpenand;
        rightOpenand = (TextView) findViewById(R.id.rightOpenAnd);
        rightOpenand.setText(rightNumber + "");
        leftOpenand = (TextView) findViewById(R.id.leftOpenAnd);
        leftOpenand.setText(leftNumber + "");



        HideChase();
        HideOops();

        button0 = (ImageButton) findViewById(R.id.buttonNumber0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 0;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });

        button1 = (ImageButton) findViewById(R.id.buttonNumber1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 1;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });

        button2 = (ImageButton) findViewById(R.id.buttonNumber2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 2;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });

        button3 = (ImageButton) findViewById(R.id.buttonNumber3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 3;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });

        button4 = (ImageButton) findViewById(R.id.buttonNumber4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 4;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });

        button5 = (ImageButton) findViewById(R.id.buttonNumber5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 5;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });


        button6 = (ImageButton) findViewById(R.id.buttonNumber6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 6;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });

        button7 = (ImageButton) findViewById(R.id.buttonNumber7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 7;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });

        button8 = (ImageButton) findViewById(R.id.buttonNumber8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 8;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });

        button9 = (ImageButton) findViewById(R.id.buttonNumber9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberClick = 9;
                if (numberClick == sum2){
                    switchToResult();
                }
                else{
                    ShowChase();
                    ShowOops();
                    Alpha();
                }
            }
        });
















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

    private static int[] number(){
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

    /*public int numberClicked;
    public void button0Click(View v) {
        numberClicked = 0;
        Log.i("Button", numberClicked + "");

    }
    public void button1Click(View v) {
        numberClicked = 1;
        Log.i("Button", numberClicked + "");
    }

    public void button2Click(View v) {
        numberClicked = 2;
        Log.i("Button", numberClicked + "");
    }
    public void button3Click(View v) {
        numberClicked = 3;
        Log.i("Button", numberClicked + "");

    }
    public void button4Click(View v) {
        numberClicked = 4;
        Log.i("Button", numberClicked + "");

    }
    public void button5Click(View v) {
        numberClicked = 5;
        Log.i("Button", numberClicked + "");

    }
    public void button6Click(View v) {
        numberClicked = 6;

    }
    public void button7Click(View v) {
        numberClicked = 7;

    }
    public void button8Click(View v) {
        numberClicked = 8;

    }
    public void button9Click(View v) {
        numberClicked = 9;

    }*/

    private void switchToResult() {
           startActivity(new Intent(MainActivity.this, ResultActivity.class));
    }



    private void HideChase() {
        View wrongAnswerView;
        wrongAnswerView = (View) findViewById(R.id.wrongAnswer);
        wrongAnswerView.setVisibility(View.INVISIBLE);
    }

    private void ShowChase() {
        View wrongAnswerView;
        wrongAnswerView = (View) findViewById(R.id.wrongAnswer);
        wrongAnswerView.setVisibility(View.VISIBLE);
    }

    private void HideOops() {
        View wrongAnswerView;
        wrongAnswerView = (View) findViewById(R.id.wrongAnswer2);
        wrongAnswerView.setVisibility(View.INVISIBLE);
    }

    private void ShowOops() {
        View wrongAnswerView;
        wrongAnswerView = (View) findViewById(R.id.wrongAnswer2);
        wrongAnswerView.setVisibility(View.VISIBLE);
    }

    private void Alpha() {
        chaseWrong = (ImageView) findViewById(R.id.wrongAnswer);
        oops= (ImageView) findViewById(R.id.wrongAnswer2);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(10);
        chaseWrong.startAnimation(alpha);
        oops.startAnimation(alpha);
    }







}