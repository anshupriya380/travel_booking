package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class guide extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView HISTORY,HOME,LOGOUT;
    Details5 o1=new Details5(R.drawable.g1,"Oliver","Age:30","Language:Hindi|English|Kannada","Contact:6578456789","Email:Oliver21@gmail.com","RS:599/day");
    Details5 o2=new Details5(R.drawable.g2,"Jack","Age:34","Language:Hindi|English|Telgu","Contact:8978456789","Email:Jack21@gmail.com","RS:599/day");
    Details5 o3=new Details5(R.drawable.g3,"Harry","Age:35","Language:Hindi|English|Punjabi","Contact:6721456789","Email:Harry21@gmail.com","RS:599/day");
    Details5 o4=new Details5(R.drawable.g4,"Jacob","Age:30","Language:Hindi|English|Bengali","Contact:9023645709","Email:Jacob21@gmail.com","RS:599/day");
    Details5 o5=new Details5(R.drawable.g5,"George","Age:32","Language:Hindi|English","Contact:8912456789","Email:George21@gmail.com","RS:499/day");
    Details5 o6=new Details5(R.drawable.g6,"Thomas","Age:40","Language:Hindi|English|Kannada","Contact:7678456789","Email:Thomas21@gmail.com","RS:499/day");
    Details5 o7=new Details5(R.drawable.g7,"James","Age:37","Language:Hindi|English|French","Contact:6678456789","Email:James21@gmail.com","RS:699/day");
    Details5 o8=new Details5(R.drawable.g8,"Damian","Age:45","Language:Hindi|English|German","Contact:6578451239","Email:Domian21@gmail.com","RS:699/day");

    Details5[] details5={o1,o2,o3,o4,o5,o6,o7,o8};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter2 c=new CustomAdapter2(details5,getApplicationContext());
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        LOGOUT = (ImageView) findViewById(R.id.man1);
        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(guide.this, MainActivity.class);
                startActivity(intent5);
            }
        });
        HISTORY = (ImageView) findViewById(R.id.hist1);
        HISTORY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(guide.this, History.class);
                startActivity(intent5);
            }
        });
        HOME= (ImageView) findViewById(R.id.hm1);
        HOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(guide.this, home.class);
                startActivity(intent5);
            }
        });
    }
}