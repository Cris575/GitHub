package com.cristian.examen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btnRegistro, btnAgregarNota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnRegistro = findViewById(R.id.button4);
        btnAgregarNota = findViewById(R.id.button3);

        btnRegistro.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), Registro.class);
        });

        btnAgregarNota.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), AgregarNota.class);
        });
    }
}