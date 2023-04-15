package com.example.myapplicationbdnotas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BaseNotas extends SQLiteOpenHelper {
    public BaseNotas(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDatos) {
        BaseDatos.execSQL("create table usuario (Cedula int primary key, Nombre text, Nota1 int, Nota2 int, Nota3 int, Nota4 int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
