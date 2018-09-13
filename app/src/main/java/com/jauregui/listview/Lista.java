package com.jauregui.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Lista extends AppCompatActivity {

    ListView lv1;
    List<String> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        //
        setTitle("Lista de alumnos");
        //

        lv1 = (ListView) findViewById(R.id.lvAlumnos);

        Intent btn1 = getIntent();

        String nombre = btn1.getExtras().getString("nombre");
        String apellido = btn1.getExtras().getString("apellido");
        String edad = btn1.getExtras().getString("edad");
        String mensaje = btn1.getExtras().getString("mensaje");
        String correo = btn1.getExtras().getString("correo");

        final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);

        lista.add(nombre + " " + apellido + " " + edad + " años" + '\n' + mensaje + '\n' + "Correo: " + correo);

        lv1.setAdapter(adaptador);

    }
}
