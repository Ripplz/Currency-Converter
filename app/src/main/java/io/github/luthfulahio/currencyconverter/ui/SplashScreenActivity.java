package io.github.luthfulahio.currencyconverter.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import io.github.luthfulahio.currencyconverter.R;
import io.github.luthfulahio.currencyconverter.ui.main.MainActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() ->  {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }, 3000);
    }
}
