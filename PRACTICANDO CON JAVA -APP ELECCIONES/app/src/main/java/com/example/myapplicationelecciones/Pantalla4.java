package com.example.myapplicationelecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pantalla4 extends AppCompatActivity {
    Button SALIRALMENU;
    EditText linea41;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        SALIRALMENU=(Button) findViewById(R.id.salirS);
        linea41 = (EditText) findViewById(R.id.Linea411);

        String Lineac= getIntent().getStringExtra("linea41");
        mostrarDatos(Lineac);
        SALIRALMENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pantalla4.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
    public void mostrarDatos(String Lineac){

        linea41.setText(Lineac);

    }
}