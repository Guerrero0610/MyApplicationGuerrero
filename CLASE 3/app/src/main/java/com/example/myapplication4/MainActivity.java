package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "Depuracion";
    EditText Lado1, Lado2;
    TextView Calcular;
    Button Bottones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Estoy en OnCreate");
        //Lado1 = findViewById(R.id.Resultadolinea1);
        //Lado2= findViewById(R.id.Resultadolinea2);
        //Calcular = findViewById(R.id.Calcular);
        //Bottones = findViewById(R.id.Bottones);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entré a OnStart");
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
}