package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ViewWebsiteActivity extends AppCompatActivity {

    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_website);
        w1=(WebView)findViewById(R.id.view);
        w1.loadUrl("https://www.ajio.com/?utm_source=Admitad&utm_medium=Affiliate&utm_campaign=5f1df5454f1d4ec6b5fd89849c0643e7");

    }
}
