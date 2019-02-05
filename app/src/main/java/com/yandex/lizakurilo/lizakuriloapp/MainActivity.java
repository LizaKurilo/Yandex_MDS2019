package com.yandex.lizakurilo.lizakuriloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        final TextView version = findViewById(R.id.version);
        version.setText(BuildConfig.VERSION_NAME);
    }
}