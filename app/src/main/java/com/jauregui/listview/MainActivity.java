package com.jauregui.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3,et4;
    RadioButton rbt1;
    Button btn1;
    //ListView lv1;
    List<String> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        setTitle("Ingrese Datos");
        //
        et1 = (EditText) findViewById(R.id.etNombre);
        et2 = (EditText) findViewById(R.id.etApellido);
        et3 = (EditText) findViewById(R.id.etEdad);
        et4 = (EditText) findViewById(R.id.etCorreo);
        //lv1 = (ListView) findViewById(R.id.List1);
        rbt1 = (RadioButton) findViewById(R.id.rbtAlumno);
        btn1 = (Button) findViewById(R.id.btAgregar);

        //lista.add("Alumno :");
        //final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);

        //lv1.setAdapter(adaptador);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //lv1.setAdapter(null);

                String mensaje = " no es alumno";
                if (rbt1.isChecked()){
                    mensaje = "es alumno";
                }

                String nombre = et1.getText().toString().trim(), apellido = et2.getText()
                        .toString().trim(), edad = et3.getText().toString().trim(),
                        correo = et4.getText().toString().trim();
                lista.add(nombre);
                lista.add(apellido);
                lista.add(edad);
                lista.add(mensaje);
                lista.add(correo);

                et1.setText(" ");
                et2.setText(" ");
                et3.setText(" ");
                rbt1.isChecked();
                et4.setText(" ");

                //lv1.setAdapter(adaptador);

               Intent btn1 = new Intent(MainActivity.this, com.jauregui.listview.Lista.class);
               btn1.putExtra("nombre", nombre);
               btn1.putExtra("apellido", apellido);
               btn1.putExtra("edad", edad);
               btn1.putExtra("mensaje", mensaje);
               btn1.putExtra("correo", correo);
               startActivity(btn1);

            }
        });

    }

}
