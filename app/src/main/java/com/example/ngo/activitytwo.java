package com.example.ngo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class activitytwo extends AppCompatActivity implements View.OnClickListener {
     Button button2;
     Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        ActionBar actionBar= getSupportActionBar();
        actionBar.hide();
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this );
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);




         }


    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.button2:
                intent = new Intent(activitytwo.this, signup.class);
                startActivity(intent);

            case R.id.button3:
                intent = new Intent(activitytwo.this, activitythre.class);
                startActivity(intent);


        }

    }
}