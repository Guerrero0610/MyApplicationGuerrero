package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import  android.widget.TextView;
public class Pantalla_2 extends AppCompatActivity {
    String TAG = "Depuración";
    EditText IngresaPrimero, IngresaSegundo;
    TextView Calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IngresaPrimero = findViewById(R.id.IngreseOne);
        IngresaSegundo = findViewById(R.id.Ingresetwo);
        Calcular = findViewById(R.id.Calculemos);
        String result = getIntent().getStringExtra("elResultado");
        String result2 = getIntent().getStringExtra("elResultado1");
        String result3 = getIntent().getStringExtra("elResultado2");
        publicarDatos(result, result2,result3);

    }

    public void publicarDatos(String result, String elResultado1, String elResultado2){

        Calcular.setText(result);
        IngresaPrimero.setText(elResultado1);
        IngresaSegundo.setText(elResultado2);
    }

}
