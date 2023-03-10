package com.example.myapplicationelecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

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

}