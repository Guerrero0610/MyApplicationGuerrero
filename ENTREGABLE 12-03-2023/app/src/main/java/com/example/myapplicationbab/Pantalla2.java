package com.example.myapplicationbab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pantalla2 extends AppCompatActivity {
    EditText RecibeNombre, RecibeDias, RecibeGenero, LineaTiempo, LineaPeso, LineaTamaño;
    Button CALCULAR;
    int FALTANTES_DIAS = 280, Total;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        RecibeNombre = (EditText) findViewById(R.id.reciben);
        RecibeDias = (EditText) findViewById(R.id.recibed);
        RecibeGenero = (EditText) findViewById(R.id.recibeg);
        LineaTiempo = (EditText) findViewById(R.id.lineaTiem);
        LineaPeso = (EditText) findViewById(R.id.lineaP);
        LineaTamaño = (EditText) findViewById(R.id.lineaTam);
        CALCULAR =(Button)findViewById(R.id.calculaPro);


        String Daton= getIntent().getStringExtra("RecibeNombre");
        String Datod= getIntent().getStringExtra("RecibeDias");
        String Datog= getIntent().getStringExtra("RecibeGenero");

        RecibeDatos(Daton, Datod, Datog);

        CALCULAR.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nume = getIntent().getStringExtra("RecibeDias");
                int comparar = Integer.parseInt(RecibeDias.getText().toString());

                if ( comparar > 0 && comparar<31) {
                    Total = FALTANTES_DIAS - comparar;
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "Entramos a condicion", Toast.LENGTH_SHORT).show();

                } else if (comparar > 31 && comparar<62){
                    Total = FALTANTES_DIAS - comparar;
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "No se entro a condicion", Toast.LENGTH_SHORT).show();

                }else if (comparar > 62 && comparar<93){
                    Total = FALTANTES_DIAS - comparar;
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "No se entro a condicion", Toast.LENGTH_SHORT).show();

                }else if (comparar > 93 && comparar<124){
                    Total = FALTANTES_DIAS - comparar;
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "No se entro a condicion", Toast.LENGTH_SHORT).show();

                }else if (comparar > 124 && comparar<155){
                    Total = FALTANTES_DIAS - comparar;
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "No se entro a condicion", Toast.LENGTH_SHORT).show();

                }else if (comparar > 155 && comparar<186){
                    Total = FALTANTES_DIAS - comparar;
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "No se entro a condicion", Toast.LENGTH_SHORT).show();

                }else if (comparar > 186 && comparar<217){
                    Total = FALTANTES_DIAS - comparar;
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "No se entro a condicion", Toast.LENGTH_SHORT).show();

                }else if (comparar > 217 && comparar<248){
                    Total = FALTANTES_DIAS - comparar;
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "No se entro a condicion", Toast.LENGTH_SHORT).show();

                }else if (comparar > 248 && comparar<280){
                    Total = FALTANTES_DIAS - comparar;
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "No se entro a condicion", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
    public void RecibeDatos(String Daton, String Datod, String Datog){

        RecibeNombre.setText(Daton);
        RecibeDias.setText(Datod);
        RecibeGenero.setText(Datog);

    }

}