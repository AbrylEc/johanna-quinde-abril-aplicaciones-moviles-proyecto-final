package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etnValor1;
    private EditText etnValor2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnValor1=findViewById(R.id.etn_valor1);
        etnValor2=findViewById(R.id.etn_valor2);
        tvResultado=findViewById(R.id.tv_resultado);
    }

    public void sumar (View view){
        String valor1=etnValor1.getText().toString();
        String valor2=etnValor2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int suma=n1+n2;

        String resul=String.valueOf(suma);
        tvResultado.setText(resul);
    }

    public void restar (View view){
        String valor1=etnValor1.getText().toString();
        String valor2=etnValor2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int resta=n1-n2;

        String resul=String.valueOf(resta);
        tvResultado.setText(resul);
    }

    public void multiplicar (View view){
        String valor1=etnValor1.getText().toString();
        String valor2=etnValor2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int multiplicacion=n1*n2;

        String resul=String.valueOf(multiplicacion);
        tvResultado.setText(resul);
    }

    public void dividir (View view){
        String valor1=etnValor1.getText().toString();
        String valor2=etnValor2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int division=n1/n2;

        String resul=String.valueOf(division);
        tvResultado.setText(resul);
    }

}