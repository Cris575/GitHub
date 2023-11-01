package com.cristian.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLoginActivuty);

        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), Menu.class);
            startActivity(intent);
        });

    }
}