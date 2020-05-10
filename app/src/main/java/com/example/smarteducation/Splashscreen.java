package com.example.smarteducation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splashscreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);




        new Handler().postDelayed(new Runnable() {
                                      @Override
        public void run() {
        Intent intent = new Intent(Splashscreen.this,Register.class);
        startActivity(intent);
        finish();
            }
            },SPLASH_TIME_OUT
        );
    }
}
