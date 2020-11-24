package com.example.pawpatroladding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; //for starting another activity

import android.media.MediaPlayer;//for linking WAV.file
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation; //for Alpha animation
import android.widget.ImageButton; //for linking ImageButton object
import android.widget.ImageView; // for linking the ImageView object
import android.view.MotionEvent; //for touch and drag event
import android.widget.TextView; // for linking the TextView object

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ImageButton button0,button1,button2,button3, button4, button5, button6, button7, button8,button9;
    ImageView chaseWrong, oops;
    AlphaAnimation alpha;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.play_activity);

        final MediaPlayer song = MediaPlayer.create(MainActivity.this, R.raw.untitled); /*Back ground song */
        song.start(); /*background song will start when open the activity */

        ImageView paw, ryder, chase, sky, marshall, rocky, rubble,zuma, everest;

        /*finds the view from the layout resource*/
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


        hidePopUpWarning(); /*Hide the image*/
        /*Create a new array and store the value of the random number created
        in the number() function
        Assign its 2 index to 2 new local variable */
        int[] array = number();
        final int rightNumber = array[0];
        final int leftNumber = array[1];
        final int sum2 = rightNumber +leftNumber; /*Add to find sum*/

        TextView rightOpenand, leftOpenand;

        rightOpenand = (TextView) findViewById(R.id.rightOpenAnd); /*finds the view from the layout resource*/
        rightOpenand.setText(rightNumber + ""); /*Set the text in layout*/
        leftOpenand = (TextView) findViewById(R.id.leftOpenAnd); /*finds the view from the layout resource*/
        leftOpenand.setText(leftNumber + ""); /*Set the text in layout*/





        button0 = (ImageButton) findViewById(R.id.buttonNumber0); /*finds the view from the layout resource*/
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {/*When clicked set the value of numberClick to 0 and compare
                it with the sum of Left and Right open and*/
                int numberClick = 0;
                v.startAnimation(buttonClick);/*Button Clicked effect*/
                if (numberClick == sum2){/*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });



        button1 = (ImageButton) findViewById(R.id.buttonNumber1); /*finds the view from the layout resource*/
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /*When clicked set the value of numberClick to 1 and compare
                it with the sum of Left and Right open and*/
                int numberClick = 1;
                v.startAnimation(buttonClick);/*Button Clicked effect*/
                if (numberClick == sum2){/*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });



        button2 = (ImageButton) findViewById(R.id.buttonNumber2); /*finds the view from the layout resource*/
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /*When clicked set the value of numberClick to 2 and compare
                it with the sum of Left and Right open and*/
                int numberClick = 2;
                v.startAnimation(buttonClick);/*Button Clicked effect*/
                if (numberClick == sum2){/*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });



        button3 = (ImageButton) findViewById(R.id.buttonNumber3); /*finds the view from the layout resource*/
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /*When clicked set the value of numberClick to 3 and compare
                it with the sum of Left and Right open and*/
                int numberClick = 3;
                v.startAnimation(buttonClick);/*Button Clicked effect*/
                if (numberClick == sum2){/*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });



        button4 = (ImageButton) findViewById(R.id.buttonNumber4); /*finds the view from the layout resource*/
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /*When clicked set the value of numberClick to 4 and compare
                it with the sum of Left and Right open and*/
                int numberClick = 4;
                v.startAnimation(buttonClick); /*Button Clicked effect*/
                if (numberClick == sum2){/*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });



        button5 = (ImageButton) findViewById(R.id.buttonNumber5); /*finds the view from the layout resource*/
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /*When clicked set the value of numberClick to 5 and compare
                it with the sum of Left and Right open and*/
                int numberClick = 5;
                v.startAnimation(buttonClick);/*Button Clicked effect*/
                if (numberClick == sum2){/*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });




        button6 = (ImageButton) findViewById(R.id.buttonNumber6); /*finds the view from the layout resource*/
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /*When clicked set the value of numberClick to 6 and compare
                it with the sum of Left and Right open and*/
                int numberClick = 6;
                v.startAnimation(buttonClick);/*Button Clicked effect*/
                if (numberClick == sum2){/*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });



        button7 = (ImageButton) findViewById(R.id.buttonNumber7); /*finds the view from the layout resource*/
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /*When clicked set the value of numberClick to 7 and compare
                it with the sum of Left and Right open and*/
                int numberClick = 7;
                v.startAnimation(buttonClick);/*Button Clicked effect*/
                if (numberClick == sum2){/*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });



        button8 = (ImageButton) findViewById(R.id.buttonNumber8); /*finds the view from the layout resource*/
        button8.setOnClickListener(new View.OnClickListener() {/* link a listener when user press
        the button number 8*/
            @Override
            public void onClick(View v) {/*When clicked set the value of numberClick to 8 and compare
                it with the sum of Left and Right open and*/
                int numberClick = 8;
                v.startAnimation(buttonClick); /*Button Clicked effect*/
                if (numberClick == sum2){ /*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });



        button9 = (ImageButton) findViewById(R.id.buttonNumber9); /*finds the view from the layout resource*/
        button9.setOnClickListener(new View.OnClickListener() {/* link a listener when user press
        the button number 9*/
            @Override
            public void onClick(View v) {/*When clicked set the value of numberClick to 9 and compare
            it with the sum of Left and Right open and*/
                int numberClick = 9;
                v.startAnimation(buttonClick); /*Button Clicked effect*/
                if (numberClick == sum2){   /*if equal then switch to result*/
                    song.pause();
                    switchToResult(leftNumber,rightNumber,numberClick);
                }
                else{ /*if not equal pop up the warning*/
                    popUpWarning();
                }
            }
        });


    }




    private View.OnTouchListener handleTouch = new View.OnTouchListener() {
        /* Taken from LAB 7 Dragging an Image handleTouch which tells a view how to react to a touch event,
        its location should move as the touch changes the location*/
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

    private void popUpWarning(){ /*Pop up the images and start a sound fx
     to warning that the answer is wrong */
        WrongAnswer();
        ShowChase();
        ShowOops();
        Alpha();
    }
    private void hidePopUpWarning(){/*Pop up the images to warning that the answer is wrong */
        HideChase();
        HideOops();
    }

    private static int[] number(){ /*Create 2 random number between 0 and 10(exclude) and
    pass it to array*/
        Random r = new Random();
        int number1;
        int number2;
        do
        {
            number1= r.nextInt(10);
            number2 = r.nextInt(10);


        }
        while(number1 + number2 >=10); /*If the sum is > 9 then do it again*/
        return new int[] {number1, number2};

    }

    private void switchToResult(int leftOpenandtoPass, int rightOpenandtoPass,int valueClicked) {/*
    To switch from Play activity(MainActivity) to Finishing view (ResultActivity) */
           Intent intent = new Intent(MainActivity.this, ResultActivity.class);
           Bundle extras = new Bundle();  //create a bundle store the data of MainActivity to pass it to ResultActivity
           //include
           extras.putInt("LEFT_VALUE",leftOpenandtoPass);
           extras.putInt("RIGHT_VALUE",rightOpenandtoPass);
           extras.putInt("CLICKED_VALUE",valueClicked);


           //attach the bundle to the next activity (ResultActivity)
           intent.putExtras(extras);
           startActivity(intent);
    }



    private void HideChase() {/*Hide the view when user choose the right answer*/
        View wrongAnswerView;
        wrongAnswerView = (View) findViewById(R.id.wrongAnswer);
        wrongAnswerView.setVisibility(View.INVISIBLE);
    }

    private void ShowChase() {/*Show the image tell that user choose wrong*/
        View wrongAnswerView;
        wrongAnswerView = (View) findViewById(R.id.wrongAnswer);
        wrongAnswerView.setVisibility(View.VISIBLE);
    }

    private void HideOops() {/*Hide the view when user choose the right answer*/
        View wrongAnswerView;
        wrongAnswerView = (View) findViewById(R.id.wrongAnswer2);
        wrongAnswerView.setVisibility(View.INVISIBLE);
    }

    private void ShowOops() {/*Show the image tell that user choose wrong*/
        View wrongAnswerView;
        wrongAnswerView = (View) findViewById(R.id.wrongAnswer2);
        wrongAnswerView.setVisibility(View.VISIBLE);
    }

    private void Alpha() {/*Taken from Lab 10. Animations to create alpha animation*/
        chaseWrong = (ImageView) findViewById(R.id.wrongAnswer);
        oops= (ImageView) findViewById(R.id.wrongAnswer2);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(10);
        chaseWrong.startAnimation(alpha);
        oops.startAnimation(alpha);
    }



    private void WrongAnswer(){ /*Start a sound fx when click the wrong answer*/
        MediaPlayer song = MediaPlayer.create(MainActivity.this, R.raw.ohno);
        song.start();
    }

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.1F); /*Set the effect when click button*/






}