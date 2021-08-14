package com.example.mlab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView im,im2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im=findViewById(R.id.im);
        im2=findViewById(R.id.im2);
        im.setImageResource(R.drawable.first);
        im2.setImageResource(R.drawable.last);

        Animation an= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scimg);
        im.startAnimation(an);

        Animation amn= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scimg2);
        im2.startAnimation(amn);

    }
}