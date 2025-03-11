package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //private TextView textSample;
    //private Button secondButton;

    private TextView textSampleDz;
    private TextView textSampleDz2;
    private TextView textSampleDz3;
    private Button thirdButtonDz;
    private Button fourthButtonDz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.first_layout);
        //setContentView(R.layout.second_layout);
        //setContentView(R.layout.image_layout);
        //setContentView(R.layout.linear_layout2);
        //setContentView(R.layout.table_layout);
        //setContentView(R.layout.frame_layout);
        //setContentView(R.layout.scroll_view);
        //setContentView(R.layout.third_layout);
        setContentView(R.layout.third_layout_dz);

        textSampleDz = findViewById(R.id.textSampleDz);



        textSampleDz2 = findViewById(R.id.textSampleDz2);
        textSampleDz3 = findViewById(R.id.textSampleDz3);
        thirdButtonDz = findViewById(R.id.thirdButtonDz);

        thirdButtonDz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSampleDz2.setText("Дай денег !!!");
                textSampleDz3.setText("Нажми Кнопку номер 4");
            }
        });

        fourthButtonDz = findViewById(R.id.fourthButtonDz);

        fourthButtonDz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSampleDz2.setText("А денег нет ((((");
                textSampleDz3.setText("Нажми Кнопку номер 3");
            }
        });



//        textSample = findViewById(R.id.textSample);
//        secondButton = findViewById(R.id.secondButton);
//
//        secondButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textSample.setText("Новое приветствие");
//                textSample.setTextSize(40);
//            }
//        });
    }

    public void sayhelloDz(View view){
        textSampleDz.setText("Привет Мир");
    }
    public void sayhelloDz2(View view){
        textSampleDz.setText("Hello World");
    }
//    public void sayHello(View view){
//        textSample.setText("Привет");
//        textSample.setTextSize(20);
//    }

}