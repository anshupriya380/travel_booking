package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class combo extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView HISTORY,HOME,LOGOUT;
    Details7 o1=new Details7(R.drawable.ch,"Combo 1","Hotel and Rides","Upto 10% off","Super savings Combo","RS:2999/day");
    Details7 o2=new Details7(R.drawable.mh,"Combo 2","Hotel and Guide","Upto 10% off","Super savings Combo","RS:2999/day");
    Details7 o3=new Details7(R.drawable.cm,"Combo 3","Rides and Guide","Upto 15% off","Super savings Combo","RS:2999/day");
    Details7 o4=new Details7(R.drawable.cmh,"Combo 4","Hotel|Rides|Guide","Upto 20% off","Super savings Combo","RS:3999/day");
    Details7 o5=new Details7(R.drawable.cmhs,"Combo 5","Hotel|Rides|Guide|Snacks","Upto 22% off","Super savings Combo","RS:4095/day");

    Details7[] details7={o1,o2,o3,o4,o5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter3 c=new CustomAdapter3(details7,getApplicationContext());
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        LOGOUT = (ImageView) findViewById(R.id.man1);
        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(combo.this, MainActivity.class);
                startActivity(intent5);
            }
        });
        HISTORY = (ImageView) findViewById(R.id.hist1);
        HISTORY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(combo.this, History.class);
                startActivity(intent5);
            }
        });
        HOME= (ImageView) findViewById(R.id.hm1);
        HOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(combo.this, home.class);
                startActivity(intent5);
            }
        });
    }
}