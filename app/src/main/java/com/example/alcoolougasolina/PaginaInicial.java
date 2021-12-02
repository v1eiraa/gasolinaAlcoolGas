package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaginaInicial extends AppCompatActivity {

    Button botaoGasolina;
    Button botaoGas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicial);

        botaoGasolina= findViewById(R.id.btnGasolina);
        botaoGas=findViewById(R.id.btnGas);

        botaoGasolina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gasolina= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(gasolina);
            }
        });

        botaoGas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gas= new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(gas);
            }
        });
    }
}