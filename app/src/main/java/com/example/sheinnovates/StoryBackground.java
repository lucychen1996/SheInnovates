package com.example.sheinnovates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StoryBackground extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_background);
        Button readybutton = findViewById(R.id.readybtn);
        readybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StoryBackground.this, Entrepreneur.class));
            }
        });
    }
    public void nextText(View view) {
        TextView backgroundInfo = findViewById(R.id.storysummary);
        backgroundInfo.setText(R.string.background2);
        Button readyButton = findViewById(R.id.readybtn);
        readyButton.setVisibility(View.VISIBLE);
    }

//    public void readyClick(View view) {
//        // Code here executes on main thread after user presses button
//            Intent create = new Intent(this,activity_entrepreneur.class);
//            SetContentView(R.layout.activity_entrepreneur);
//            startActivity(create);
//    }

}
