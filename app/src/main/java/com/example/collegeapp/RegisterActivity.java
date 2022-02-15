package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;

    String getName,getNumber,getEmail,getPassword,getConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.number);
        ed3=(EditText) findViewById(R.id.email);
        ed4=(EditText) findViewById(R.id.pswd);
        ed5=(EditText)findViewById(R.id.cnpswd);
        b1=(AppCompatButton)findViewById(R.id.register);
        b2=(AppCompatButton)findViewById(R.id.back);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = ed1.getText().toString();
                getNumber = ed2.getText().toString();
                getEmail = ed3.getText().toString();
                getPassword = ed4.getText().toString();
                getConfirm = ed5.getText().toString();

                if (getPassword.equals(getConfirm)) {
                    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getNumber, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getEmail, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getPassword, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getConfirm, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Password doesn't match the Confirm Password", Toast.LENGTH_SHORT).show();
                }
            }
            });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

}

}