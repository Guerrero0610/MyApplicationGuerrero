package com.example.myapplicationelecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;
public class Pantalla2 extends AppCompatActivity {
    EditText Linea22;

    int Candi1 =0;
    int Candi2=0;
    int Candi3=0;
    int Candi4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Linea22 = (EditText) findViewById(R.id.Linea2);

        String Lineac= getIntent().getStringExtra("Linea22");
        publicarDatos(Lineac);

    }
    public void publicarDatos(String Lineac){

        Linea22.setText(Lineac);
        
    }

    public void Candidato1(View v){

        Toast.makeText(this,"Has votado por Daniela Navardo, gracias por votar :)",Toast.LENGTH_SHORT).show();
        Candi1 = Candi1 + 1;
        Handler handler = new Handler();
        int delayMillis = 2000;
        Runnable runnable = new Runnable() {
            public void run() {
                Intent intent = new Intent(Pantalla2.this, MainActivity.class);
                Intent i = new Intent(Pantalla2.this, Pantalla4.class);
                i.putExtra("linea41", Candi1);
                startActivity(intent);
            }
        };;handler.postDelayed(runnable, delayMillis);
    }
    public void Candidato2(View v){
        Toast.makeText(this,"Has votado por Laura Bozzo, gracias por votar :)",Toast.LENGTH_SHORT).show();
        Candi2 = Candi2 +1;
        Handler handler = new Handler();
        int delayMillis = 2000;
        Runnable runnable = new Runnable() {
            public void run() {
                Intent intent = new Intent(Pantalla2.this, MainActivity.class);
                startActivity(intent);
            }
        };;handler.postDelayed(runnable, delayMillis);
    }
    public void Candidato3(View v){
        Toast.makeText(this,"Has votado por Nacho Casano, gracias por votar :)",Toast.LENGTH_SHORT).show();
        Candi3 = Candi3 + 1;
        Handler handler = new Handler();
        int delayMillis = 2000;
        Runnable runnable = new Runnable() {
            public void run() {
                Intent intent = new Intent(Pantalla2.this, MainActivity.class);
                startActivity(intent);
            }
        };;handler.postDelayed(runnable, delayMillis);
    }
    public void Candidato4(View v){
        Toast.makeText(this,"Has votado en Blanco, gracias por votar :)",Toast.LENGTH_SHORT).show();
        Candi4 = Candi4 +1;
        Handler handler = new Handler();
        int delayMillis = 2000;
        Runnable runnable = new Runnable() {
            public void run() {
                Intent intent = new Intent(Pantalla2.this, MainActivity.class);
                startActivity(intent);
            }
        };;handler.postDelayed(runnable, delayMillis);
    }



}