package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla_2 extends AppCompatActivity {
    String TAG = "Depuración";
    EditText IngresaPrimero, IngresaSegundo;
    TextView Total;

    Button REGRESAR;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        IngresaPrimero = (EditText) findViewById(R.id.IngreseOne);
        IngresaSegundo = (EditText) findViewById(R.id.Ingresetwo);
        Total = (TextView) findViewById(R.id.Total);
        REGRESAR = (Button)findViewById(R.id.Regresa);

        String result = getIntent().getStringExtra("elResultado");
        String result2 = getIntent().getStringExtra("elResultado1");
        String result3 = getIntent().getStringExtra("elResultado2");

        publicarDatos(result, result2,result3);

        REGRESAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(Pantalla_2.this, MainActivity.class);
                startActivity(p);
            }
        });

    }

    public void publicarDatos(String result, String result2, String result3){

        Total.setText(result);
        IngresaPrimero.setText(result2);
        IngresaSegundo.setText(result3);
    }
}