package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Bookingcnfrm extends AppCompatActivity {
ImageView HOME,HISTORY,LOGOUT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingcnfrm);
        LOGOUT = (ImageView) findViewById(R.id.man1);
        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Bookingcnfrm.this, MainActivity.class);
                startActivity(intent5);
            }
        });
        HISTORY = (ImageView) findViewById(R.id.hist1);
        HISTORY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Bookingcnfrm.this, History.class);
                startActivity(intent5);
            }
        });
        HOME= (ImageView) findViewById(R.id.hm1);
        HOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Bookingcnfrm.this, home.class);
                startActivity(intent5);
            }
        });
    }
}