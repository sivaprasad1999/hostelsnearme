package com.rockstar.hostelsnearme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterPage extends AppCompatActivity {
    EditText usr,passww,conf,mail,phno;
    static SharedPreferences spp;
    SharedPreferences.Editor se;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        usr=findViewById(R.id.editusername);
        passww=findViewById(R.id.editTextPass);
        conf=findViewById(R.id.editconfirmPass);
        mail=findViewById(R.id.editTextmail);
        phno=findViewById(R.id.phone);
        spp=getSharedPreferences("username",MODE_PRIVATE);
    }

    public void submit(View view) {
        String usernam=mail.getText().toString();
        String mypass=passww.getText().toString();
        String confpaas=passww.getText().toString();
        String emaill=mail.getText().toString();

//        Toast.makeText(this, ""+usernam, Toast.LENGTH_SHORT).show();
        se=spp.edit();
        if (mypass.equals(confpaas))
        {
            se.putString("Username",usernam);
            se.putString("Passwoard",mypass);
            se.putString("Confirmpasswoard",confpaas);
            se.putString("Emaill",emaill);
            se.apply();
            Toast.makeText(this, "Register Sucess", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,   "your password is not match to your confirmed password", Toast.LENGTH_SHORT).show();
        }

    }

    public void signin(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
