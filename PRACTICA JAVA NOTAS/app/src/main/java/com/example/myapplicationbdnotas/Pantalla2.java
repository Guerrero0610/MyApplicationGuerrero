package com.example.myapplicationbdnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pantalla2 extends AppCompatActivity {
    EditText INGRESE_IDENTIDAD;
    EditText INGRESE_ESTUDIANTE;
    EditText NOTA11;
    EditText NOTA22;
    EditText NOTA33;
    EditText NOTA44,INGRESA_NOTA_F, INGRESE_ESTADO;


    TextView TRAER_PROFE;

    Button BOTON_GUARDAR, BOTON_CONSULTAR;
    String mensaje1, mensaje2;

    double total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        INGRESE_IDENTIDAD = findViewById(R.id.IngreseIdentidad);
        INGRESE_ESTUDIANTE = findViewById(R.id.IngresaEstudiante);
        NOTA11 = findViewById(R.id.nota1);
        NOTA22 = findViewById(R.id.nota2);
        NOTA33 = findViewById(R.id.nota3);
        NOTA44 = findViewById(R.id.nota4);
        BOTON_GUARDAR = findViewById(R.id.BotonG);
        BOTON_CONSULTAR = findViewById(R.id.BotonCo);
        TRAER_PROFE = findViewById(R.id.Traer_profe);
        INGRESA_NOTA_F = findViewById(R.id.NotaF);
        INGRESE_ESTADO = findViewById(R.id.Estado);

        String DatoP= getIntent().getStringExtra("TRAER_PROFE");

        RecibeProfe(DatoP);


        BOTON_GUARDAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular(view);
                Resgistrar(view);

            }
        });
        BOTON_CONSULTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Consultar(view);

            }
        });
    }
    public void RecibeProfe(String DatoP){

        TRAER_PROFE.setText(DatoP);
    }
    public void Calcular(View view){

        int nota1 = Integer.parseInt(NOTA11.getText().toString());
        int nota2 = Integer.parseInt(NOTA22.getText().toString());
        int nota3 = Integer.parseInt(NOTA33.getText().toString());
        int nota4 = Integer.parseInt(NOTA44.getText().toString());
        double Total;
        Total=(nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.15) + (nota4 * 0.35);
        INGRESA_NOTA_F.setText(String.valueOf(Total));
        if ( Total >= 0.0 && Total <= 2.9) {
            mensaje1 = "Perdio";
            INGRESE_ESTADO.setText(String.valueOf(mensaje1));
        } else {
            mensaje2 = "Gano";
            INGRESE_ESTADO.setText(String.valueOf(mensaje2));
        }
    }
    public void Resgistrar(View view){
        Toast.makeText(this,"Estoy En Registrar", Toast.LENGTH_LONG).show();
        BaseNotas Listar = new BaseNotas(this,"BaseDatos", null, 1);
        SQLiteDatabase BaseDatos = Listar.getWritableDatabase();
        String Cedula = INGRESE_IDENTIDAD.getText().toString();
        String Nombre = INGRESE_ESTUDIANTE.getText().toString();
        String Nota1 = NOTA11.getText().toString();
        String Nota2 = NOTA22.getText().toString();
        String Nota3 = NOTA33.getText().toString();
        String Nota4 = NOTA44.getText().toString();


        if (!Cedula.isEmpty() && !Nombre.isEmpty() && !Nota1.isEmpty() && !Nota2.isEmpty() && !Nota3.isEmpty() && !Nota4.isEmpty()){
            ContentValues registro = new ContentValues();
            registro.put("Cedula", Cedula);
            registro.put("Nombre", Nombre);
            registro.put("Nota1", Nota1);
            registro.put("Nota2", Nota2);
            registro.put("Nota3", Nota3);
            registro.put("Nota4", Nota4);

            BaseDatos.insert("usuario", null, registro);
            BaseDatos.close();
            INGRESE_IDENTIDAD.setText(" ");
            INGRESE_ESTUDIANTE.setText(" ");
            NOTA11.setText(" ");
            NOTA22.setText(" ");
            NOTA33.setText(" ");
            NOTA44.setText(" ");

            Toast.makeText(this,"Resgistro Almacenado Exitosamente", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Ingrese Correctamente Todos los Datos", Toast.LENGTH_LONG).show();
        }

    }
    public void Consultar(View view){
        Toast.makeText(this,"Estoy En Consultar", Toast.LENGTH_LONG).show();
        BaseNotas Listar = new BaseNotas(this,"BaseDatos", null,1);
        SQLiteDatabase BaseDatos = Listar.getWritableDatabase();
        String Cedula = INGRESE_IDENTIDAD.getText().toString();

        if (!Cedula.isEmpty()){
            Cursor fila = BaseDatos.rawQuery("select Nombre,Nota1,Nota2,Nota3,Nota4 from usuario where Cedula="+Cedula, null);
            if (fila.moveToFirst()==true){
                INGRESE_ESTUDIANTE.setText(fila.getString(0));
                NOTA11.setText(fila.getString(1));
                NOTA22.setText(fila.getString(2));
                NOTA33.setText(fila.getString(3));
                NOTA44.setText(fila.getString(4));

                BaseDatos.close();
            }
            else{
                Toast.makeText(this,"No Se Encontro el Usuario, Por Favor Vuelva a Intentarlo", Toast.LENGTH_LONG).show();
            }
        }
    }
}