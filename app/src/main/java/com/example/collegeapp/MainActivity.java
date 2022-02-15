package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText ed1,ed2;
   AppCompatButton b1,b2;

   String getEmail, getPassword, PrefValue;

    SharedPreferences  MyPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyPreferences=getSharedPreferences("loginpref",MODE_PRIVATE);
        ed1=(EditText)findViewById(R.id.email);
        ed2=(EditText)findViewById(R.id.pswd);
        b1=(AppCompatButton)findViewById(R.id.login);
        b2=(AppCompatButton)findViewById(R.id.gotoreg);

       PrefValue=MyPreferences.getString("email",null);
       if (PrefValue!=null)
       {
           Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
           startActivity(i);
       }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmail=ed1.getText().toString();
                getPassword=ed2.getText().toString();

                if(getEmail.equals("admin@gmail.com")&&getPassword.equals("12345"))
                {
                    SharedPreferences.Editor MyEdit=MyPreferences.edit();
                    MyEdit.putString("email",getEmail);

                    MyEdit.commit();

                    Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }




            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });

    }
}