package com.example.sheinnovates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson1Intro extends AppCompatActivity {
    private Button Start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_intro_);

        Start = (Button) findViewById(R.id.start);

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Lesson1Page1.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }


}
