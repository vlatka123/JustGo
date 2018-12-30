package com.example.marko.justgo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);

        // Prikazi pocetni zaslon 1,5 sekundi i automatski prijedi na log in screen
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartingScreen.this, Login.class);
                startActivity(intent);
                finish();
            }
        }, 1500);

    }
}
