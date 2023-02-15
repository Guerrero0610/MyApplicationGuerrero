package com.example.myapplicationag2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String TAG = "Actividaduno";
    Button crearAlarma, llamar;
    String phoneNumber = "3126373569";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "--Perrito--");
    }
}