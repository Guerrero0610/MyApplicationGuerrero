package com.example.myapplicationbab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class Pantalla3 extends AppCompatActivity {
    ImageView primero, segundo, tercero, primero1, segundo1, tercero1, primero2, segundo2, tercero2;
    EditText ENDIAS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        primero = (ImageView)findViewById(R.id.primero1);
        primero1 = (ImageView)findViewById(R.id.primero11);
        primero2 = (ImageView)findViewById(R.id.primero111);
        segundo = (ImageView)findViewById(R.id.segundo1);
        segundo1 = (ImageView)findViewById(R.id.segundo11);
        segundo2 = (ImageView)findViewById(R.id.segundo111);
        tercero = (ImageView)findViewById(R.id.tercero1);
        tercero1 = (ImageView)findViewById(R.id.tercero11);
        tercero2 = (ImageView)findViewById(R.id.tercero111);
        ENDIAS = (EditText) findViewById(R.id.Diasl);

        String Recibe = getIntent().getStringExtra("ENDIAS");

        Recibimos(Recibe);
    }
    public void Recibimos(String Recibe){

        ENDIAS.setText(Recibe);


    }
}