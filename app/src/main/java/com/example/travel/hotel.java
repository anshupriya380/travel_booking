package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hotel extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView HISTORY,HOME,LOGOUT;
    Details3 o1=new Details3(R.drawable.im3,"Crowne Plaza","AC|Free Wifi","Near Beach","Free Cancellation:Till 1hr before checkin","RS:999/day");
    Details3 o2=new Details3(R.drawable.im1,"Emerald Bay Inn","AC|Free Wifi","In Market Area","Free Cancellation:Till 1hr  before checkin","RS:1099/day");
    Details3 o3=new Details3(R.drawable.im2,"Hotel Bliss","AC|Free Wifi","Near Shiva Temmple","Free Cancellation:Till 1hr  before checkin","RS:1199/day");
    Details3 o4=new Details3(R.drawable.im6,"University Inn","SAC|Free Wifi","Near Lake","Free Cancellation:Till 1hr  before checkin","RS:1050/day");
    Details3 o5=new Details3(R.drawable.im4,"The New View","AC|Free Wifi","In Main Market","Free Cancellation:Till 1hr  before checkin","RS:1299/day");
    Details3 o6=new Details3(R.drawable.im5,"Ramada Limited & Suites","AC|Free Wifi","Near Bangalore Central","Free Cancellation:Till 1hr  before checkin","RS:1599/day");
    Details3 o7=new Details3(R.drawable.im7,"Sunset Lodge","AC|Free Wifi","Near Beach","Free Cancellation:Till 1hr  before checkin","RS:1499/day");
    Details3 o8=new Details3(R.drawable.im8,"THotel Elite","AC|Free Wifi","Near BGS Hospital","Free Cancellation:Till 1hr  before checkin","RS:999/day");

    Details3[] details3={o1,o2,o3,o4,o5,o6,o7,o8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter1 c=new CustomAdapter1(details3,getApplicationContext());
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        LOGOUT = (ImageView) findViewById(R.id.man1);
        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(hotel.this, MainActivity.class);
                startActivity(intent5);
            }
        });
        HISTORY = (ImageView) findViewById(R.id.hist1);
        HISTORY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(hotel.this, History.class);
                startActivity(intent5);
            }
        });
        HOME= (ImageView) findViewById(R.id.hm1);
        HOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(hotel.this, home.class);
                startActivity(intent5);
            }
        });

    }
}