package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class Ctiming extends AppCompatActivity {
    Button btn;
    Spinner sp1;
    TextView tv_1,tv_2;
    ImageView im_1,im_2;
    int y;
    int d;
    int m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctiming);
        sp1=(Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Ctiming.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.names));
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);

        btn = (Button) findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Ctiming.this,combo.class);
                startActivity(intent1);
            }
        });
        tv_1=(TextView) findViewById(R.id.tv6);
        tv_2=(TextView) findViewById(R.id.tv7);
        im_1=(ImageView)  findViewById(R.id.im6);
        im_2=(ImageView) findViewById(R.id.im7);
        Calendar c=Calendar.getInstance();
        im_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                y=c.get(Calendar.YEAR);
                m=c.get(Calendar.MONTH);
                d=c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog g=new DatePickerDialog(Ctiming.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        tv_1.setText(i+"/"+i1+"/"+i2+"/");
                    }
                },y,m,d);
                g.show();
            }
        });
        im_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                y=c.get(Calendar.YEAR);
                m=c.get(Calendar.MONTH);
                d=c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog g=new DatePickerDialog(Ctiming.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        tv_2.setText(i+"/"+i1+"/"+i2+"/");
                    }
                },y,m,d);
                g.show();
            }
        });



    }
}