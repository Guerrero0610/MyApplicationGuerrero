package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String TAG = "Depuracion";

EditText IngresaPrimero, IngresaSegundo;

TextView Calcular;

Button Bottones, BuscarG, Llamar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy en OnCreate");
        IngresaPrimero = findViewById(R.id.IngreseOne);
        IngresaSegundo = findViewById(R.id.Ingresetwo);
        Calcular = findViewById(R.id.Calculemos);
        Bottones = findViewById(R.id.Darle);
        BuscarG = findViewById(R.id.Busca);
        Llamar = findViewById(R.id.Llamamos);

        Bottones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float result = Float.parseFloat(IngresaSegundo.getText().toString()) * Float.parseFloat(IngresaPrimero.getText().toString());
                String resultlado1 = IngresaPrimero.getText().toString();
                String resultlado2 = IngresaSegundo.getText().toString();
                Intent pasarDato = new Intent(MainActivity.this, Pantalla_2.class);
                pasarDato.putExtra("elResultado", String.valueOf(result));
                pasarDato.putExtra("elResultado1", resultlado1);
                pasarDato.putExtra("elResultado2", resultlado2);
                startActivity(pasarDato);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entré a OnStart");

        BuscarG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VamosaGoogle(view);
            }
        });
        Llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"eSTOY EN LLAMAR");
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "6045109000"));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entré a OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entré a OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entré a OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entré a OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entré a OnDestroy");
    }

    public void VamosaGoogle(View view) {
        Intent abrirGoogle = new Intent(Intent.ACTION_VIEW);
        abrirGoogle.setData(Uri.parse("http://www.google.com"));
        startActivity(abrirGoogle);

    }

}