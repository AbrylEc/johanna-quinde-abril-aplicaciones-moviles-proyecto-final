package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etnValor1, etnValor2;
    private TextView tvResultado;
    private CheckBox chkSumar, chkRestar, chkMultiplicar, chkDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnValor1=findViewById(R.id.etn_valor1);
        etnValor2=findViewById(R.id.etn_valor2);
        tvResultado=findViewById(R.id.tv_resultado);
        chkSumar=findViewById(R.id.chk_sumar);
        chkRestar=findViewById(R.id.chk_restar);
        chkMultiplicar=findViewById(R.id.chk_multiplicar);
        chkDividir=findViewById(R.id.chk_dividir);
    }

    public void operaciones (View view){

        //Parseamos los datos
        float n1=Integer.parseInt(etnValor1.getText().toString());
        float n2=Integer.parseInt(etnValor2.getText().toString());
        String resultado="";

        if (chkSumar.isChecked()==true)
        {
            float suma=n1+n2;
            resultado="La suma es: " + suma;
        }
        if (chkRestar.isChecked()==true)
        {
            float resta=n1-n2;
            resultado = resultado + "La resta es: " + resta;
        }
        if (chkMultiplicar.isChecked()==true)
        {
            float multiplicacion=n1*n2;
            resultado = resultado + "El producto es: " + multiplicacion;
        }
        if (chkDividir.isChecked()==true)
        {
            float division=n1/n2;
            resultado = resultado + "La división es: " + division;
        }
        tvResultado.setText(resultado);
    }

}