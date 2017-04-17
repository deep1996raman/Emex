package com.example.android.emex;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.handle;

public class MainActivity extends AppCompatActivity {
    final int timeLapse = 2500;
    Handler handler;
    Button btnlogin;
    Button btnsignup;
    int resultCode = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnlogin.setVisibility(View.VISIBLE);
                btnsignup.setVisibility(View.VISIBLE);
            }
        },timeLapse);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

       btnlogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,LoginActivity.class);
               startActivity(intent);
           }
       });
    }
    private void init()
    {
        handler = new Handler();
        btnlogin = (Button)findViewById(R.id.login);
        btnsignup = (Button)findViewById(R.id.signup);
    }
}
