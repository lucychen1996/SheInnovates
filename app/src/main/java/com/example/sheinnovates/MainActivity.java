package com.example.sheinnovates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mlogin;
    private Button mcreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        mlogin = (Button) findViewById(R.id.login);
        mlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(v.getContext(), Login.class);
                startActivityForResult(myIntent, 0);
            }
        });

        mcreateAccount = (Button) findViewById(R.id.createAccount);
        mcreateAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(v.getContext(), CreateAccount.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void loadScreen(View view){
        Intent create = new Intent(this, LoadScreen.class);
        setContentView(R.layout.activity_loadscreen);
        startActivity(create);
    }

    public void createAccount(View view) {
        // Code here executes on main thread after user presses button
        Intent create = new Intent(this, CreateAccount.class);
        setContentView(R.layout.activity_create_account);
        startActivity(create);
    }

    public void Login(View view){
        Intent create = new Intent(this, Login.class);
        setContentView(R.layout.activity_login);
        startActivity(create);
    }

    public void PickPage(View view) {

        Intent create = new Intent(this, PickPage.class);
        setContentView(R.layout.activity_pick);
        startActivity(create);
    }

    public void StoryBackground(View view){
        Intent create = new Intent(this, StoryBackground.class);
        setContentView(R.layout.activity_story_background);
        startActivity(create);
    }

    public void Entrepreneur(View view){
        Intent create = new Intent(this, Entrepreneur.class);
        setContentView(R.layout.activity_entrepreneur);
        startActivity(create);
    }

}
