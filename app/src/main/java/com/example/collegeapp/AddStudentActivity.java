package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;

    String getName,getRollNo,getAdmission,getCollege;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.rollno);
        ed3=(EditText)findViewById(R.id.admsn);
        ed4=(EditText)findViewById(R.id.college);
        b1=(AppCompatButton)findViewById(R.id.submit);
        b2=(AppCompatButton)findViewById(R.id.backtod);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            getName=ed1.getText().toString();
            getRollNo=ed2.getText().toString();
            getAdmission=ed3.getText().toString();
            getCollege=ed4.getText().toString();

                Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getRollNo, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getAdmission, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getCollege, Toast.LENGTH_SHORT).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });

    }
}