package com.example.myapplicationbab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText NombreLinea, DiasLinea, GeneroLinea;
    Button Ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NombreLinea = (EditText) findViewById(R.id.LineaNombre);
        DiasLinea = (EditText) findViewById(R.id.LineaDias);
        GeneroLinea = (EditText) findViewById(R.id.LineaGenero);
        Ingresar = (Button)findViewById(R.id.IngresarApp);

        Ingresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String uno = NombreLinea.getText().toString();
                String dos = DiasLinea.getText().toString();
                String tres = GeneroLinea.getText().toString();

                if ( !uno.isEmpty() && !dos.isEmpty() && !tres.isEmpty()) {
                    Intent i = new Intent(MainActivity.this, Pantalla2.class);
                    i.putExtra("RecibeNombre", NombreLinea.getText().toString());
                    i.putExtra("RecibeDias", DiasLinea.getText().toString());
                    i.putExtra("RecibeGenero", GeneroLinea.getText().toString());
                    startActivity(i);


                } else {
                    Toast.makeText(MainActivity.this, "Por Favor Llenar Todos Los Campos", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }


}