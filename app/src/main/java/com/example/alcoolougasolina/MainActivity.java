package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;



     //gasolina e alcool
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.textResultado);

    }





        public void calcularPreco(View view) {
        //Recuperar valores

        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoAlcool.getText().toString();

        //validar

        Boolean camposValidos = this.validarCampos(precoAlcool, precoGasolina);
        if (camposValidos) {
            this.calcularMelhorPreco(precoAlcool, precoGasolina);
        } else {
            textResultado.setText("Preencha  os preços primeiro");
        }

    }

    public Boolean validarCampos(String pAlcool, String pGasolina ){
        Boolean camposValidos=true;
        if(pAlcool==null || pAlcool.equals("")){
            camposValidos=false;
        } else if (pGasolina==null || pGasolina.equals("")){
         camposValidos=false
        }
        return camposValidos
    }

    public void calcularMelhorPreco (String pAlcool,String pGasolina){
        //String virar numero
        Double precoAlcool=Double.parseDouble(p.Alcool);
        Double precoGasolina=Double.parseDouble(p.Gasolina);

        Double resultado= precoAlcool/precoGasolina;
        if(resultado>=0.7){
            textResultado.setText("Melhor utilizar Gasolina!!");
        } else {
            textResultado.setText("Melhor utilizar Álcool!!");
        }
    }
}