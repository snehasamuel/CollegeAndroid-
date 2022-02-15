package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFacultyActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;

    String getName,getDepartment,getQualification,getMobile,getEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);

        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.dept);
        ed3=(EditText) findViewById(R.id.qual);
        ed4=(EditText) findViewById(R.id.number);
        ed5=(EditText) findViewById(R.id.email);
        b1=(AppCompatButton) findViewById(R.id.submit);
        b2=(AppCompatButton) findViewById(R.id.back);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = ed1.getText().toString();
                getDepartment = ed2.getText().toString();
                getQualification = ed3.getText().toString();
                getMobile = ed4.getText().toString();
                getEmail = ed5.getText().toString();


                Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getDepartment, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getQualification, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getMobile, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getEmail, Toast.LENGTH_SHORT).show();
            } });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}