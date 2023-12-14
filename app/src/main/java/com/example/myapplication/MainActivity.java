package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private Intent i1 = new Intent(this, MainActivity.class);
    private Intent i2 = new Intent(this, MainActivity2.class);
    private Intent i3 = new Intent(this, MainActivity3.class);

    private final Button button1 = findViewById(R.id.button1);
    private final Button button2 = findViewById(R.id.button2);
    private final Button button3 = findViewById(R.id.button3);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}