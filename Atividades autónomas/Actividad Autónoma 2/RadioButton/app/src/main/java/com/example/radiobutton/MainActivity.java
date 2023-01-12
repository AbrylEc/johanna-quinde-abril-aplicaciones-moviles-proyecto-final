package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etnValor1, etnValor2;
    private TextView tvResultado;
    private RadioButton rbSumar, rbRestar, rbMultiplicar, rbDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnValor1=findViewById(R.id.etn_valor1);
        etnValor2=findViewById(R.id.etn_valor2);
        tvResultado=findViewById(R.id.tv_resultado);
        rbSumar=findViewById(R.id.rb_sumar);
        rbRestar=findViewById(R.id.rb_restar);
        rbMultiplicar=findViewById(R.id.rb_multiplicar);
        rbDividir=findViewById(R.id.rb_dividir);
    }

    public void operaciones (View view){

        float n1=Integer.parseInt(etnValor1.getText().toString());
        float n2=Integer.parseInt(etnValor2.getText().toString());
        String resul="";

        if(rbSumar.isChecked()==true)
        {
            float suma=n1+n2;
            resul=String.valueOf(suma);
        }
        else if (rbRestar.isChecked()==true)
        {
            float resta=n1-n2;
            resul=String.valueOf(resta);
        }
        else if (rbMultiplicar.isChecked()==true)
        {
            float multiplicacion=n1*n2;
            resul=String.valueOf(multiplicacion);
        }
        else if (rbDividir.isChecked()==true)
        {
            float division=n1/n2;
            resul=String.valueOf(division);
        }

        tvResultado.setText(resul);
    }

}