package com.example.ksamnang.pts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    protected WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web= (WebView) findViewById(R.id.web);
        WebSettings wsetting=web.getSettings();
        wsetting.setJavaScriptEnabled(true);
        web.loadUrl("http://pts-computer.net78.net/");
    }
}
