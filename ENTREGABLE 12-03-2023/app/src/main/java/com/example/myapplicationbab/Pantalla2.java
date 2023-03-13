package com.example.myapplicationbab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pantalla2 extends AppCompatActivity {
    EditText RecibeNombre, RecibeDias, RecibeGenero;
    Button CALCULAR;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        RecibeNombre = (EditText) findViewById(R.id.reciben);
        RecibeDias = (EditText) findViewById(R.id.recibed);
        RecibeGenero = (EditText) findViewById(R.id.recibeg);
        CALCULAR =(Button)findViewById(R.id.calculaPro);

        String Daton= getIntent().getStringExtra("RecibeNombre");
        String Datod= getIntent().getStringExtra("RecibeDias");
        String Datog= getIntent().getStringExtra("RecibeGenero");

        RecibeDatos(Daton, Datod, Datog);

        CALCULAR.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



            }
        });

    }
    public void RecibeDatos(String Daton, String Datod, String Datog){

        RecibeNombre.setText(Daton);
        RecibeDias.setText(Datod);
        RecibeGenero.setText(Datog);

    }

}