package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail4 extends AppCompatActivity {
    ImageView img;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
    Button btnconfrm,btncancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);
        img=(ImageView) findViewById(R.id.imageView7);
        txt1=(TextView) findViewById(R.id.textView28);
        txt2=(TextView) findViewById(R.id.textView30);
        txt3=(TextView) findViewById(R.id.textView52);
        txt7=(TextView) findViewById(R.id.textView53);
        txt8=(TextView) findViewById(R.id.textView54);
        btnconfrm=(Button) findViewById(R.id.button8);
        btncancel=(Button) findViewById(R.id.button7);


        img.setImageResource(getIntent().getIntExtra("imagename",0));
        txt1.setText(getIntent().getStringExtra("S1"));
        txt2.setText(getIntent().getStringExtra("S2"));
        txt3.setText(getIntent().getStringExtra("S3"));

        txt7.setText(getIntent().getStringExtra("S7"));
        txt8.setText(getIntent().getStringExtra("S8"));

        btnconfrm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "YOUR BOOKING HAS BEEN CONFIRMED!", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Detail4.this,Bookingcnfrm.class);
                startActivity(intent);
            }
        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "CANCELLED", Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(Detail4.this,hotel.class);
                startActivity(intent1);
            }
        });

    }
}