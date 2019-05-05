package com.example.extra;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class agregar_actualizar1 extends AppCompatActivity {

    EditText nc,nombre,apaterno,amaterno,grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_actualizar1);

        nc = (EditText) findViewById(R.id.nc);
        nombre = (EditText) findViewById(R.id.Nombre);
        apaterno = (EditText) findViewById(R.id.APaterno);
        amaterno = (EditText) findViewById(R.id.AMaterno);
        grupo = (EditText) findViewById(R.id.Grupo);

    }

    public void registrar(View view) {
        if(nc.getText().toString().equals("")||nombre.getText().toString().equals("")||apaterno.getText().toString().equals("")||amaterno.getText().toString().equals("")||grupo.getText().toString().equals(""))
        {
            Toast.makeText(this, "Favor de llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
        else
        {
            registrarEstudiante();
            Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show();
        }
    }

    private void registrarEstudiante() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(getApplicationContext(),"bd_usuarios",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();


        ContentValues values= new ContentValues();
        values.put(Utilidades.CAMPO_NOCONTROL,nc.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE,nombre.getText().toString());
        values.put(Utilidades.CAMPO_APATERNO,apaterno.getText().toString());
        values.put(Utilidades.CAMPO_AMATERNO,amaterno.getText().toString());
        values.put(Utilidades.CAMPO_GRUPO,grupo.getText().toString());

        Long idResultante=db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_NOCONTROL,values);
        Toast.makeText(getApplicationContext(),"Registro exitoso, ID Registro: "+idResultante,Toast.LENGTH_LONG);
        db.close();
        Intent intent= new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void regresar(View view) {
        Intent intent= new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
