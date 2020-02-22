package com.example.ngo;


import androidx.appcompat.app.ActionBar;
import
        androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.widget.Button;







public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar= getSupportActionBar();
        actionBar.hide();
        new Handler().postDelayed(new Runnable(){
        @Override


        public void run() {
            Intent intent = new Intent(MainActivity.this, activitytwo.class);
            startActivity(intent);
            finish();
            }
        },SPLASH_TIME_OUT);
    }
}
