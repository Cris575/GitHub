package com.cristian.examen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btnRegistro, btnAgregarNota,listarNotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnRegistro = findViewById(R.id.button4);
        btnAgregarNota = findViewById(R.id.button3);
        listarNotas = findViewById(R.id.button5);

        btnRegistro.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), Registro.class);
            startActivity(intent);
        });

        btnAgregarNota.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), AgregarNota.class);
            startActivity(intent);

        });

        listarNotas.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), Registro.class);
            startActivity(intent);

        });
    }
}