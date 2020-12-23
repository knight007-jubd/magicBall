package com.limitlesssolution.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton;
        askButton = (Button) findViewById(R.id.magic_ask);

        final ImageView magicBallle;
        magicBallle = (ImageView) findViewById(R.id.image_magicBall);

        final int[] magicBallArray = {  R.drawable.magic_ball_1, R.drawable.magic_ball_2, R.drawable.magic_ball_defult};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Magic Ball", "This button has been pressed!");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(3);
                Log.d("Dicee", "The random generator number is:" + number);

                magicBallle.setImageResource(magicBallArray[number]);
            }
        });
    }
}