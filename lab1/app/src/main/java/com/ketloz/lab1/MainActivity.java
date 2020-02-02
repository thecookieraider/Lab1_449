package com.ketloz.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int strikes = 0;
    int balls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseBalls(View view) {
        balls++;

        EditText text = findViewById(R.id.balls);
        text.setText(Integer.toString(balls));
    }

    public void increaseStrikes(View view) {
        strikes++;

        EditText text = findViewById(R.id.strikes);
        text.setText(Integer.toString(strikes));
    }

    public void reset(View view) {
        balls = 0;
        strikes = 0;

        EditText ballsText = findViewById(R.id.balls);
        EditText strikesText = findViewById(R.id.strikes);

        ballsText.setText("0");
        strikesText.setText("0");
    }

    public void exit(View view) {
        System.exit(1);
    }
}
