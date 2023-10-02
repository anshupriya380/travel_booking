package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class login extends AppCompatActivity implements View.OnClickListener {
    EditText userlogin,pwdlogin;
    String user1,passs1;
    Button btnlogin;
    ImageButton googlelogin;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userlogin=(EditText) findViewById(R.id.loginuser);
        pwdlogin=(EditText) findViewById(R.id.loginpwd);
        btnlogin=(Button) findViewById(R.id.loginbtn);
        btnlogin.setOnClickListener(this);
       /* googlelogin=(ImageButton) findViewById(R.id.logingoogle);
        googlelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "SUCCESS LOGIN", Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(login.this,home.class);
                startActivity(intent1);
            }
        });*/

        Bundle bundle=getIntent().getBundleExtra("data");
        user1=bundle.getString("user");
        passs1=bundle.getString("pass");
    }

    @Override
    public void onClick(View view) {
        String user2=userlogin.getText().toString();
        String pass2=pwdlogin.getText().toString();
        if(user1.equals(user2)&&passs1.equals(pass2)){
            Toast.makeText(getBaseContext(), "SUCCESS LOGIN", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this,home.class);
            intent.putExtra("keyname",user2);

            startActivity(intent);
        }else{
            count++;
            if(count==3){
                btnlogin.setEnabled(false);
                Toast.makeText(getBaseContext(), "FAILED LOGIN"+count, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(getBaseContext(), "FAILED LOGIN", Toast.LENGTH_SHORT).show();
            }

        }

    }

}