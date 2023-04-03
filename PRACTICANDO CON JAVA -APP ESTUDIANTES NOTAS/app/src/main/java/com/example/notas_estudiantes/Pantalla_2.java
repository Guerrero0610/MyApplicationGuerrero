package com.example.notas_estudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class Pantalla_2 extends AppCompatActivity {

    EditText NOTA11, NOTA22, NOTA33, NOTA44, INGRESE_ESTUDIANTE;
    TextView TRAER_PROFE;
    Button BOTON_GUARDAR, BOTON_MOSTRAR, BOTON_CONSULTAR, BOTON_CERRAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        INGRESE_ESTUDIANTE = (EditText)findViewById(R.id.IngresaEstudiante);
        NOTA11 = (EditText)findViewById(R.id.nota1);
        NOTA22 = (EditText)findViewById(R.id.nota2);
        NOTA33 = (EditText)findViewById(R.id.nota3);
        NOTA44 = (EditText)findViewById(R.id.nota4);
        TRAER_PROFE = (TextView) findViewById(R.id.Trae_profe);
        BOTON_GUARDAR =(Button)findViewById(R.id.BotonG);
        BOTON_MOSTRAR =(Button)findViewById(R.id.BotonM);
        BOTON_CONSULTAR =(Button)findViewById(R.id.BotonCo);
        BOTON_CERRAR =(Button)findViewById(R.id.BotonC);

        String DatoP= getIntent().getStringExtra("TRAER_PROFE");

        RecibeProfe(DatoP);

        BOTON_GUARDAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resgistrar(view);
            }
        });
        BOTON_CONSULTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Consultar(view);
            }
        });
        BOTON_CERRAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Pantalla_2.this, MainActivity.class);
                startActivity(n);
            }
        });
        BOTON_MOSTRAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Pantalla_3.class);
                startActivity(intent);
            }
        });
    }
    public void Resgistrar(View view){

        BD_Estudiantes Listar = new BD_Estudiantes(this,"BaseDatos", null, 1);
        SQLiteDatabase BaseDatos = Listar.getWritableDatabase();
        String Nombre = INGRESE_ESTUDIANTE.getText().toString();
        String Nota1 = NOTA11.getText().toString();
        String Nota2 = NOTA22.getText().toString();
        String Nota3 = NOTA33.getText().toString();
        String Nota4 = NOTA44.getText().toString();

        if (!Nombre.isEmpty() && !Nota1.isEmpty() && !Nota2.isEmpty() && !Nota3.isEmpty() && !Nota4.isEmpty()){
            ContentValues registro = new ContentValues();
            registro.put("Nombre", Nombre);
            registro.put("Nota1", Nota1);
            registro.put("Nota2", Nota2);
            registro.put("Nota3", Nota3);
            registro.put("Nota4", Nota4);
            BaseDatos.insert("estudiante", null, registro);
            BaseDatos.close();
            INGRESE_ESTUDIANTE.setText("");
            NOTA11.setText("");
            NOTA22.setText("");
            NOTA33.setText("");
            NOTA44.setText("");
            Toast.makeText(this,"Resgistro Almacenado Exitosamente", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Ingrese Correctamente Todos los Datos", Toast.LENGTH_LONG).show();
        }

    }
    public void Consultar(View view){
        Toast.makeText(this,"Estoy En Consultar", Toast.LENGTH_LONG).show();
        BD_Estudiantes Listar = new BD_Estudiantes(this,"BaseDatos", null,1);
        SQLiteDatabase BaseDatos = Listar.getWritableDatabase();
        String NombreE = INGRESE_ESTUDIANTE.getText().toString();
        if (!NombreE.isEmpty()){
            Cursor fila = BaseDatos.rawQuery("select Nota1,Nota2,Nota3,Nota4 from estudiante where Nombre='$NombreE'", null);
            if (fila.moveToFirst()==true){
                NOTA11.setText(fila.getString(0));
                NOTA22.setText(fila.getString(1));
                NOTA33.setText(fila.getString(2));
                NOTA44.setText(fila.getString(3));
                BaseDatos.close();
            }
            else{
                Toast.makeText(this,"No Se Encontro el Usuario, Por Favor Vuelva a Intentarlo", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void RecibeProfe(String DatoP){

        TRAER_PROFE.setText(DatoP);
    }

}