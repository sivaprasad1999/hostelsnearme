package com.rockstar.hostelsnearme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    EditText email,pass;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.editTextmail);
        pass=findViewById(R.id.editTextPass);
    }
    public void Login(View view) {
        String emaill=email.getText().toString();
        String mypass=pass.getText().toString();
        String nn=RegisterPage.spp.getString("Emaill","");
        String pp=RegisterPage.spp.getString("Passwoard","");
        if (nn.equals(emaill) && pp.equals(mypass)){
//            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Login failed ", Toast.LENGTH_SHORT).show();
        }

    }
    public void signup(View view) {
        Intent intent=new Intent(this,RegisterPage.class);
        startActivity(intent);

    }

}
