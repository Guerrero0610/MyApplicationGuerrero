package com.example.myapplicationbdnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Pantalla2 extends AppCompatActivity {
    EditText INGRESE_IDENTIDAD, INGRESE_ESTUDIANTE, NOTA11, NOTA22, NOTA33, NOTA44;

    Button BOTON_GUARDAR, BOTON_CONSULTAR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
    }
}