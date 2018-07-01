package com.example.user.quizappjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.user.quizappjava.R.id.submit;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use activity_main .xml layout file
        setContentView(R.layout.activity_main);

    }
    public void startQuiz (View view) {
        Intent i = new Intent(MainActivity.this, Level1.class);
        startActivity(i);
    }

    public void level (View view) {
        Intent i = new Intent(MainActivity.this, level.class);
        startActivity(i);
    }

    /**
     * Resets all options back to initial state.
     * @param v
     */
    public void reset(View v) {
        setContentView(R.layout.level_1);
    }


    /**
     * Submit all options.
     * @param v
     */
    public void submit(View v) {
        setContentView(R.layout.level_1);
       // return TextView.class findViewById(R.id.result);

    }
    }


