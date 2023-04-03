package com.example.notas_estudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pantalla_2 extends AppCompatActivity {
    TextView TRAER_PROFE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        TRAER_PROFE = (TextView) findViewById(R.id.Trae_profe);
        String DatoP= getIntent().getStringExtra("TRAER_PROFE");

        RecibeProfe(DatoP);
    }
    public void RecibeProfe(String DatoP){

        TRAER_PROFE.setText(DatoP);


    }
}