package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Details2 extends AppCompatActivity {
    ImageView img;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
    Button btnconfrm,btncancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);
        img=(ImageView) findViewById(R.id.imageView7);
        txt1=(TextView) findViewById(R.id.textView29);
        txt2=(TextView) findViewById(R.id.textView51);
        txt3=(TextView) findViewById(R.id.textView64);
        txt4=(TextView) findViewById(R.id.textView67);
        txt5=(TextView) findViewById(R.id.textView68);
        txt6=(TextView) findViewById(R.id.textView69);
        txt7=(TextView) findViewById(R.id.textView70);
        txt8=(TextView) findViewById(R.id.textView71);
        btnconfrm=(Button) findViewById(R.id.button);
        btncancel=(Button) findViewById(R.id.button2);


        img.setImageResource(getIntent().getIntExtra("imagename",0));
        txt1.setText(getIntent().getStringExtra("S1"));
        txt2.setText(getIntent().getStringExtra("S2"));
        txt3.setText(getIntent().getStringExtra("S3"));
        txt4.setText(getIntent().getStringExtra("S4"));
        txt5.setText(getIntent().getStringExtra("S5"));
        txt6.setText(getIntent().getStringExtra("S6"));
        txt7.setText(getIntent().getStringExtra("S7"));
        txt8.setText(getIntent().getStringExtra("S8"));

        btnconfrm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "YOUR BOOKING HAS BEEN CONFIRMED!", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Details2.this,Bookingcnfrm.class);
                startActivity(intent);
            }
        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "CANCELLED", Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(Details2.this,Explore.class);
                startActivity(intent1);
            }
        });

    }
}