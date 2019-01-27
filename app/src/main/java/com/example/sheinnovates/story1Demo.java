package com.example.sheinnovates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class story1Demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story1_demo);
        Button readybutton = findViewById(R.id.readybtn);
        readybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(story1Demo.this, story1customization.class));
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
//            Intent create = new Intent(this,activity_story1customization.class);
//            SetContentView(R.layout.activity_story1customization);
//            startActivity(create);
//    }

}
