package com.example.extra;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<estudiantes> listdatos;
    RecyclerView recyclerView;
    FloatingActionButton agregar;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agregar=(FloatingActionButton) findViewById(R.id.Agregar);

        conn=new ConexionSQLiteHelper(getApplicationContext(),"bd_usuarios",null,1);

        listdatos=new ArrayList<>();

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));


        llenarDatos();

        Adaptador adapter= new Adaptador(listdatos);
        recyclerView.setAdapter(adapter);



        agregar.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), agregar_actualizar1.class);
                startActivity(intent);
            }
        }));
    }

    private void llenarDatos(){
        SQLiteDatabase db=conn.getReadableDatabase();

        estudiantes estudiante=null;

        Cursor cursor=db.rawQuery("SELECT * FROM "+Utilidades.TABLA_USUARIO,null);
        while (cursor.moveToNext())
        {
            estudiante=new estudiantes();
            estudiante.setNoControlAl(cursor.getString(0));
            estudiante.setNombreAl(cursor.getString(1));
            estudiante.setApePaterno(cursor.getString(2));
            estudiante.setApeMaterno(cursor.getString(3));
            estudiante.setGrupo(cursor.getString(4));

            listdatos.add(estudiante);
        }
        //listdatos.add(new estudiantes("134425","Joshua"));
    }
}
