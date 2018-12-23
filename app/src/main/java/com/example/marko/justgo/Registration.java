package com.example.marko.justgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration extends AppCompatActivity {

    private Button already_have_an_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        already_have_an_account = (Button) findViewById(R.id.already_have_a_account);

        already_have_an_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);

            }
        });

    }
}
