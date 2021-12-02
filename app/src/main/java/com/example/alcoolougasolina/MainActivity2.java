package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText txtn1;
    private EditText txtn2;
    private TextView tvResultado;
//gas
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.textResultado);


        //gas
        txtn1 = findViewById(R.id.txtn1);
        txtn2 = findViewById(R.id.txtn2);
        tvResultado = findViewById(R.id.tvResultado);
    }


    //gas
    public void somar(View view) {
        //Recuperar valores
        int valor1 = integer.parseInt(txtn1.getText().toString())
        int valor2 = integer.parseInt(txtn2.getText().toString())
        tvResultado.setText(String.valueOf(valor1*valor2))

    }
}