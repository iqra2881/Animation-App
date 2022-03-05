package com.example.animation;

import static com.example.animation.R.anim.interpolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        btn1 = (Button) findViewById(R.id.button2);
        btn2 = (Button) findViewById(R.id.button6);
        btn3 = (Button) findViewById(R.id.button4);
        btn4 = (Button) findViewById(R.id.button3);
        btn5 = (Button) findViewById(R.id.button7);
        btn6 = (Button) findViewById(R.id.button8);
        btn7 = (Button) findViewById(R.id.button9);
        btn8 = (Button) findViewById(R.id.button12);

        img = (ImageView) findViewById(R.id.imageView4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink);
                img.startAnimation(anim);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                img.startAnimation(rotation);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Fade = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);
                img.startAnimation(Fade);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Zoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
                img.startAnimation(Zoom);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Slide = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide);
                img.startAnimation(Slide);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Bounce = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                img.startAnimation(Bounce);

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Move = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
                img.startAnimation(Move);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Interpolar = AnimationUtils.loadAnimation(MainActivity.this, interpolar);
                img.startAnimation(Interpolar);

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img.clearAnimation();
            }
        });


    }




}
