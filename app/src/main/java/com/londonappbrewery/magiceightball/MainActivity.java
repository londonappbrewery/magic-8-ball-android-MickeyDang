package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView balldisplay = (ImageView) findViewById(R.id.eight_ball);
        final Button askbutton = (Button) findViewById(R.id.askbutton);

        final int[] ballarray = {
            R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5
        };

        askbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick (View v) {

                Random RNG = new Random();
                int number = RNG.nextInt(5);

                balldisplay.setImageResource(ballarray[number]);
            }

        });

    }
}
