package com.example.travel;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;


public class home extends AppCompatActivity {
    TextView name;
    ImageView CAR, HOTEL, GUIDE, COMBO,LOGOUT,HOME,HISTORY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        name = (TextView) findViewById(R.id.username);

        String username= getIntent().getStringExtra("keyname");
        name.setText(username);
       // String username1 = getIntent().getStringExtra("acctname");
       // name.setText(username1);


        CAR = (ImageView) findViewById(R.id.car);
        CAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(home.this,extimings.class);
                startActivity(intent1);
            }
        });
        HOTEL = (ImageView) findViewById(R.id.hotel);
        HOTEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(home.this, Timings.class);
                startActivity(intent2);
            }
        });
        GUIDE = (ImageView) findViewById(R.id.guide);
        GUIDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(home.this, Gtiming.class);
                startActivity(intent3);
            }
        });
        COMBO = (ImageView) findViewById(R.id.combo);
        COMBO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(home.this, Ctiming.class);
                startActivity(intent4);
            }
        });
        LOGOUT = (ImageView) findViewById(R.id.lg);
        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(home.this, MainActivity.class);
                startActivity(intent5);
            }
        });
        HISTORY = (ImageView) findViewById(R.id.hist);
        HISTORY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(home.this, History.class);
                startActivity(intent5);
            }
        });

    }
}

