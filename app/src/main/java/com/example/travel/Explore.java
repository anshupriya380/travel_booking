package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Explore extends AppCompatActivity {
RecyclerView recyclerView;
ImageView HISTORY,LOGOUT,HOME;
Details o1=new Details(R.drawable.swift,"Suzuki,Swift","Mini|4Seater|AC","Spacious eco-friendly car","12Km included","Rs 15.0/Km after 12Km","Electric Car","Free Cancellation:Till 1hr untill departure","RS:299/day");
Details o2=new Details(R.drawable.brezza,"Maruthi,Brezza","Sedan|4Seater|AC","Spacious eco-friendly car","12Km included","Rs 15.0/Km after 12Km","Disel Car","Free Cancellation:Till 1hr untill departure","RS:299/day");
Details o3=new Details(R.drawable.inova,"Toyota,Innova","SUV|7Seater|AC","Spacious eco-friendly car","12Km included","Rs 17.0/Km after 12Km","Disel Car","Free Cancellation:Till 1hr untill departure","RS:350/day");
Details o4=new Details(R.drawable.fortuner,"Mahindra,Fortuner","SUV|7Seater|AC","Spacious eco-friendly car","12Km included","Rs 17.0/Km after 12Km","Disel Car","Free Cancellation:Till 1hr untill departure","RS:350/day");
Details o5=new Details(R.drawable.scorpio,"Mahindra,Scorpio","SUV|8Seater|AC","Spacious eco-friendly car","12Km included","Rs 18.0/Km after 12Km","Disel Car","Free Cancellation:Till 1hr untill departure","RS:399/day");
Details o6=new Details(R.drawable.xuv,"Mahindra,XUV500","SUV|6Seater|AC","Spacious eco-friendly car","12Km included","Rs 16.0/Km after 12Km","Disel Car","Free Cancellation:Till 1hr untill departure","RS:350/day");
Details o7=new Details(R.drawable.bolero,"Mahindra,Bolero","SUV|8Seater|AC","Spacious eco-friendly car","12Km included","Rs 18.0/Km after 12Km","Disel Car","Free Cancellation:Till 1hr untill departure","RS:499/day");
Details o8=new Details(R.drawable.traveller,"Traveller","BUS|17Seater|AC","Spacious eco-friendly car","12Km included","Rs 20.0/Km after 12Km","Petrol Car","Free Cancellation:Till 1hr untill departure","RS:799/day");

    Details[] details={o1,o2,o3,o4,o5,o6,o7,o8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c=new CustomAdapter(details,getApplicationContext());
        recyclerView.setAdapter(c);
       recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        LOGOUT = (ImageView) findViewById(R.id.man1);
        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Explore.this, MainActivity.class);
                startActivity(intent5);
            }
        });
        HISTORY = (ImageView) findViewById(R.id.hist1);
        HISTORY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Explore.this, History.class);
                startActivity(intent5);
            }
        });
        HOME= (ImageView) findViewById(R.id.hm1);
        HOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Explore.this, home.class);
                startActivity(intent5);
            }
        });

    }
}