package com.example.sheinnovates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void createAccount(View view) {
        // Code here executes on main thread after user presses button
        Intent create = new Intent(this,story1Demo.class);
        setContentView(R.layout.activity_create_account);
        startActivity(create);
    }

}
