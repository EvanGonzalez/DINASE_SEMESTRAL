package com.example.dinase_semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webDinace extends AppCompatActivity {

    WebView webView;
    String url="https://dinace.utp.ac.pa/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_dinace);


        webView = (WebView) findViewById(R.id.vistaWeb);

       // cargar una página web en un web view
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);


    }
}