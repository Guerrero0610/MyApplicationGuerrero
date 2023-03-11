package com.example.myapplicationelecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pantalla3 extends AppCompatActivity {

    String usu = "admi1";
    String Contra= "12345";
    Button IniciarS;
    EditText LINEA1, LINEA2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        IniciarS = (Button)findViewById(R.id.IniciaSesion);
        LINEA1 = (EditText)findViewById(R.id.LineaOne);
        LINEA2 = (EditText)findViewById(R.id.LineaTwo);

        IniciarS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuarioo = LINEA1.getText().toString();
                String contraaa = LINEA2.getText().toString();

                if ( usu == usuarioo && Contra == contraaa) {
                    Intent i = new Intent(Pantalla3.this, Pantalla4.class);
                    startActivity(i);

                } else if (LINEA1.equals("")) {
                    Toast.makeText(Pantalla3.this, "Debe ingresar el usuario", Toast.LENGTH_SHORT).show();

                }  else if (LINEA2.equals("")) {
                Toast.makeText(Pantalla3.this, "Debe ingresar la contraseña", Toast.LENGTH_SHORT).show();

                 }else{
                    Toast.makeText(Pantalla3.this, "Usuario y/o contraseña incorrectos :(", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}