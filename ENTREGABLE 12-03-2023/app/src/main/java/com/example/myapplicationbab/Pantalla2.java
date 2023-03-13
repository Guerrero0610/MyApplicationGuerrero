package com.example.myapplicationbab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Pantalla2 extends AppCompatActivity {
    EditText RecibeNombre, RecibeDias, RecibeGenero, LineaTiempo, LineaPeso, LineaTamaño;
    Button CALCULAR, VERBEBE;

    int FALTANTES_DIAS = 280, Total;
    String TamañoB, PesoB;
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

        VERBEBE = (Button)findViewById(R.id.VerBebe);


        String Daton= getIntent().getStringExtra("RecibeNombre");
        String Datod= getIntent().getStringExtra("RecibeDias");
        String Datog= getIntent().getStringExtra("RecibeGenero");

        RecibeDatos(Daton, Datod, Datog);

        CALCULAR.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nume = getIntent().getStringExtra("RecibeDias");
                int comparar = Integer.parseInt(RecibeDias.getText().toString());

                if ( comparar >= 0 && comparar <= 31) {
                    Total = FALTANTES_DIAS - comparar;
                    PesoB = "Grano de arena a 1 g";
                    TamañoB = "Grano de arena a guisante";
                    LineaPeso.setText(String.valueOf(PesoB));
                    LineaTamaño.setText(String.valueOf(TamañoB));
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "PRIMER TRIMESTRE", Toast.LENGTH_SHORT).show();

                } else if (comparar >= 32 && comparar<=62){
                    Total = FALTANTES_DIAS - comparar;
                    PesoB = "Entre 1.5 g a 7 g";
                    TamañoB = " De Frijol a 2,5 cm";
                    LineaPeso.setText(String.valueOf(PesoB));
                    LineaTamaño.setText(String.valueOf(TamañoB));
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "PRIMER TRIMESTRE", Toast.LENGTH_SHORT).show();

                }else if (comparar >= 63 && comparar<=93){
                    Total = FALTANTES_DIAS - comparar;
                    PesoB = "Entre 14 g a 60 g";
                    TamañoB = "3,5 cm a 6 cm";
                    LineaPeso.setText(String.valueOf(PesoB));
                    LineaTamaño.setText(String.valueOf(TamañoB));
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "PRIMER TRIMESTRE", Toast.LENGTH_SHORT).show();

                }else if (comparar >= 94 && comparar<=124){
                    Total = FALTANTES_DIAS - comparar;
                    PesoB = "Entre 90 g a 230 g";
                    TamañoB = "7,5 cm a 11,5 cm";
                    LineaPeso.setText(String.valueOf(PesoB));
                    LineaTamaño.setText(String.valueOf(TamañoB));
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "SEGUNDO TRIMESTRE", Toast.LENGTH_SHORT).show();

                }else if (comparar >= 125 && comparar<=155){
                    Total = FALTANTES_DIAS - comparar;
                    PesoB = "Entre 280 g a 510 g";
                    TamañoB = "13 cm a 16,5 cm";
                    LineaPeso.setText(String.valueOf(PesoB));
                    LineaTamaño.setText(String.valueOf(TamañoB));
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "SEGUNDO TRIMESTRE", Toast.LENGTH_SHORT).show();

                }else if (comparar >= 156 && comparar<=186){
                    Total = FALTANTES_DIAS - comparar;
                    PesoB = "Entre 660 g a 1,2 kg";
                    TamañoB = "26 cm a 30 cm";
                    LineaPeso.setText(String.valueOf(PesoB));
                    LineaTamaño.setText(String.valueOf(TamañoB));
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "SEGUNDO TRIMESTRE", Toast.LENGTH_SHORT).show();

                }else if (comparar >= 187 && comparar<=217){
                    Total = FALTANTES_DIAS - comparar;
                    PesoB = "Entre 1.4 kg a 2,2 kg";
                    TamañoB = "33 cm a 37 cm";
                    LineaPeso.setText(String.valueOf(PesoB));
                    LineaTamaño.setText(String.valueOf(TamañoB));
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "TERCER TRIMESTRE", Toast.LENGTH_SHORT).show();

                }else if (comparar >= 218 && comparar<=248){
                    Total = FALTANTES_DIAS - comparar;
                    PesoB = "Entre 2.2 kg a 2,7 kg";
                    TamañoB = "41 cm a 46 cm";
                    LineaPeso.setText(String.valueOf(PesoB));
                    LineaTamaño.setText(String.valueOf(TamañoB));
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "TERCER TRIMESTRE", Toast.LENGTH_SHORT).show();

                }else if (comparar >= 249 && comparar<=280){
                    Total = FALTANTES_DIAS - comparar;
                    PesoB = "Entre 2.5 kg a 3,8 kg";
                    TamañoB = "47 cm a 51 cm";
                    LineaPeso.setText(String.valueOf(PesoB));
                    LineaTamaño.setText(String.valueOf(TamañoB));
                    LineaTiempo.setText(String.valueOf(Total));
                    Toast.makeText(Pantalla2.this, "TERCER TRIMESTRE", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(Pantalla2.this, "El bebe ya debió nacer, sino es así acuda al Médico URGENTEMENTE", Toast.LENGTH_SHORT).show();
                }

            }
        });

        VERBEBE.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String nume = getIntent().getStringExtra("RecibeDias");
                int comparar = Integer.parseInt(RecibeDias.getText().toString());

                if ( comparar >= 0 && comparar<=280) {
                    SiguientePag(view);

                }else {
                    Toast.makeText(Pantalla2.this, "Ya tu bebe ha nacido", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
    public void RecibeDatos(String Daton, String Datod, String Datog){

        RecibeNombre.setText(Daton);
        RecibeDias.setText(Datod);
        RecibeGenero.setText(Datog);

    }
    public void SiguientePag(View view){
        Intent t = new Intent(Pantalla2.this, Pantalla3.class);
        t.putExtra("ENDIAS", RecibeDias.getText().toString());
        startActivity(t);
    }

}