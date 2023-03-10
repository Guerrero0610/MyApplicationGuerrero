package com.example.myapplicationelecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Linea3;
    Button Boton1;
    int num=17;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Boton1=(Button)findViewById(R.id.Ingresar_1);
        Linea3=findViewById(R.id.Linea3);

        Boton1.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View view) {
                String nume = Linea3.getText().toString();
                int comparar = Integer.parseInt(Linea3.getText().toString());

                if ( comparar <= num) {
                    Toast.makeText(MainActivity.this, "Usted no es mayor de edad", Toast.LENGTH_SHORT).show();

                } else if (nume.equals("")) {
                    Toast.makeText(MainActivity.this, "Debe ingresar un numero", Toast.LENGTH_SHORT).show();

                } else{
                    Intent i = new Intent(MainActivity.this, Pantalla2.class);
                    startActivity(i);
                }
            }
        });

    }

}