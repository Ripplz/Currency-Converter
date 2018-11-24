package io.github.luthfulahio.currencyconverter.ui.main;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import io.github.luthfulahio.currencyconverter.R;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://babatunde75.github.io");
        WebSettings webSettings =  webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
