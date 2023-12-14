package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class ansbut {
    private final  Button button1;
    private final Button button2;
    private final Button button3;

    public ansbut(Button button1, Button button2, Button button3){
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
    }

    public static void changeActivity(Button button1, Button button2, Button button3){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(this, MainActivity.class);

            }
        });
    }
}
