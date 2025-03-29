package com.example.second;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HandActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand);



        ImageView hand = findViewById(R.id.hand_image);
        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ( (AnimationDrawable)hand.getDrawable()).start();

            }
        });


        Animation scale_hand = AnimationUtils.loadAnimation( this, R.anim.shrink_hand);
        hand.startAnimation(scale_hand);


    }
}