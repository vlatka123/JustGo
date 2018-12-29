package com.example.marko.justgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FogotPassword extends AppCompatActivity {

    Button send_link_to_me;
    EditText my_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fogot_password);

        // Button Initialization
        send_link_to_me = (Button) findViewById(R.id.forgot_pass_btn);

        // EditText Initialization
        my_email = (EditText)  findViewById(R.id.forgot_pass_email);

        send_link_to_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FogotPassword.this, Login.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
