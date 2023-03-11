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

        Toast.makeText(this,"Has votado por Daniela Navardo",Toast.LENGTH_SHORT).show();
        Handler handler = new Handler();
        int delayMillis = 2000;
        Runnable runnable = new Runnable() {
            public void run() {
                Intent intent = new Intent(Pantalla2.this, MainActivity.class);
                startActivity(intent);
            }
        };;handler.postDelayed(runnable, delayMillis);
    }
    public void Candidato2(View v){
        Toast.makeText(this,"Has votado por Laura Bozzo",Toast.LENGTH_SHORT).show();
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
        Toast.makeText(this,"Has votado por Nacho Casano",Toast.LENGTH_SHORT).show();
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
        Toast.makeText(this,"Has votado en Blanco",Toast.LENGTH_SHORT).show();
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