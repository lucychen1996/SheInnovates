package com.example.sheinnovates;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PickPage extends AppCompatActivity{

    private Button mentrepreneur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);

        mentrepreneur = (Button) findViewById(R.id.entrepreneur);

        mentrepreneur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Entrepreneur.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
