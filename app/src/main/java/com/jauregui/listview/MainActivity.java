package com.jauregui.listview;

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
    ListView lv1;
    Button btn1;
    List<String> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.etNombre);
        et2 = (EditText) findViewById(R.id.etApellido);
        et3 = (EditText) findViewById(R.id.etEdad);
        et4 = (EditText) findViewById(R.id.etCorreo);
        rbt1 = (RadioButton) findViewById(R.id.rbtAlumno);
        btn1 = (Button) findViewById(R.id.rbtAlumno);
        lv1 = (ListView) findViewById(R.id.lvLista);

        lista.add("Vidal Jauregui Guman");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);

        lv1.setAdapter(adapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mensaje = " no es alumno";
                lv1.setAdapter(null);
                String nom = et1.getText().toString().trim();
                lista.add(nom);
                et1.setText("");
                lv1.setAdapter(adapter);
            }
        });

    }
}
