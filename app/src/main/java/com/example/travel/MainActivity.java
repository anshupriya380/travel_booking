package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static int RC_SIGN_IN=100;
    GoogleSignInClient mGoogleSignInClient;
    EditText usersignup,pwdsignup;
    Button btnsignup;
    String Rexp="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!])[A-Za-z\\d@#$!]{8,}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usersignup = (EditText) findViewById(R.id.signupuser);
        pwdsignup = (EditText) findViewById(R.id.signuppwd);
        btnsignup = (Button) findViewById(R.id.loginbtn);
        btnsignup.setOnClickListener(this);

        // Configure sign-in to request the user's ID, email address, and basic
// profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleSignInClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        // Check for existing Google Sign In account, if the user is already signed in
// the GoogleSignInAccount will be non-null.
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);

        // Set the dimensions of the sign-in button.
        SignInButton signInButton = findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_STANDARD);

        findViewById(R.id.sign_in_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                signIn();
            }
        });
    }
    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }
    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
            if (acct != null) {
                String personName = acct.getDisplayName();
                String personGivenName = acct.getGivenName();
                String personFamilyName = acct.getFamilyName();
                String personEmail = acct.getEmail();
                String personId = acct.getId();
                Uri personPhoto = acct.getPhotoUrl();
                Intent i=new Intent(MainActivity.this,home.class);
                i.putExtra("acctname",personName);
                startActivity(i);
               
            }


            // Signed in successfully, show authenticated UI.
          //  Intent i=new Intent(MainActivity.this,home.class);
           // i.putExtra("acctname",pm);
            //startActivity(i);


        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.d("message",e.toString());
        }
    }

    @Override
    public void onClick(View view) {
        String Username=usersignup.getText().toString();
        String Password=pwdsignup.getText().toString();
        if(validatepassword(Password)){
            Toast.makeText(getBaseContext(),"VALID PASSWORD",Toast.LENGTH_LONG).show();
            Bundle bundle=new Bundle();
            bundle.putString("user",Username);
            bundle.putString("pass",Password);
            Intent intent =new Intent(this,login.class);
            intent.putExtra(("data"),bundle);
            startActivity(intent);
        }else
        {
            Toast.makeText(getBaseContext(),"INVALID PASSWORD",Toast.LENGTH_LONG).show();
        }
    }

    private boolean validatepassword(String password) {
        Pattern pattern =Pattern.compile(Rexp);
        Matcher matcher=pattern.matcher(password);
        return matcher.matches();
    }
}