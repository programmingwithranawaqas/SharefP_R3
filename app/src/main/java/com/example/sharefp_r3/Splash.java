package com.example.sharefp_r3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Splash extends AppCompatActivity {

    Animation first, second, third;
    View firstview, secondview, thirdview
            , forthview, fifthview, sixthview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();

        new Handler()
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Splash.this,
                                MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }, 2500);

    }
    private void init()
    {
        first = AnimationUtils.loadAnimation(this, R.anim.first);
        second = AnimationUtils.loadAnimation(this, R.anim.second);
        third = AnimationUtils.loadAnimation(this, R.anim.third);
        firstview = findViewById(R.id.first);
        secondview = findViewById(R.id.second);
        thirdview = findViewById(R.id.third);
        forthview = findViewById(R.id.fourth);
        fifthview = findViewById(R.id.fifth);
        sixthview = findViewById(R.id.sixth);

        firstview.setAnimation(first);
        secondview.setAnimation(second);
        thirdview.setAnimation(third);
        forthview.setAnimation(first);
        fifthview.setAnimation(second);
        sixthview.setAnimation(third);

    }
}