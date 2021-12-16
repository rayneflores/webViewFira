package com.ryfsystems.myapplicationfira;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpen = findViewById(R.id.btnOpen);

        btnOpen.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), Webviewfullscreen.class);
            startActivity(i);
        });

    }
}