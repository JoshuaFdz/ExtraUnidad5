package com.example.extra;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderDatos>
{

    ArrayList<estudiantes>listdatos;
    View view;
    public Adaptador(ArrayList<estudiantes>listdatos){this.listdatos=listdatos;}

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.formato,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos datos, int i) {
        datos.cont.setText(listdatos.get(i).getNoControlAl());
        datos.nom.setText(listdatos.get(i).getNombreAl());

        datos.elim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText("yes", Toast.LENGTH_SHORT);
            }
        });

        datos.edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdatos.size();
    }


    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView nom, cont;
        Button elim, edit;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);

            nom = (TextView) itemView.findViewById(R.id.Nombre);
            cont= (TextView) itemView.findViewById(R.id.NoControl);
            elim= (Button) itemView.findViewById(R.id.Eliminar);
            edit= (Button) itemView.findViewById(R.id.Editar);
        }

    }
}
