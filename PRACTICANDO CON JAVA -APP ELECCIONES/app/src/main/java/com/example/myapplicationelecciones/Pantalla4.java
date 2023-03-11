package com.example.myapplicationelecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla4 extends AppCompatActivity {
    Button SALIRALMENU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        SALIRALMENU=(Button) findViewById(R.id.salirS);
        SALIRALMENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pantalla4.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}