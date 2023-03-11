package com.example.myapplicationelecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText Linea3, Linea2;
    Button Boton1, Boton2;
    int num=17;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Linea2=(EditText)findViewById (R.id.Linea2);
        Boton1=(Button)findViewById(R.id.Ingresar_1);
        Boton2=(Button)findViewById(R.id.Ingresar_Admi);
        Linea3=findViewById(R.id.Linea3);

        Boton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String nume = Linea3.getText().toString();
                int comparar = Integer.parseInt(Linea3.getText().toString());

                if ( comparar <= num) {
                    Toast.makeText(MainActivity.this, "Usted no tiene la edad suficiente para votar", Toast.LENGTH_SHORT).show();

                } else if (Linea3.equals("")) {
                    Toast.makeText(MainActivity.this, "Debe ingresar un numero", Toast.LENGTH_SHORT).show();

                } else{
                    Intent i = new Intent(MainActivity.this, Pantalla2.class);
                    i.putExtra("Linea22", Linea2.getText().toString());
                    startActivity(i);
                }
            }
        });
        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Pantalla3.class);
                startActivity(i);
            }
        });

    }


}