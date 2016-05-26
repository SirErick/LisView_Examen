package com.android.lisview_examen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static String Posicion = "pos";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarEventos();
    }



    private void registrarEventos(){

        /// selecciona la lista en pantalla segun su ID
        ListView lista1 = (ListView) findViewById(R.id.miLista);

        // registra una accion para el evento click
        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                /// Obtiene el valor de la casilla elegida
                String itemSeleccionado = adapterView.getItemAtPosition(i).toString();

                /*
                Distancia media al Sol: 57.870.000 Km.
Diámetro: 4.850 Km.
Duración de la traslación: 57 Km./seg. en el afelio
Distancia máxima a la Tierra: 220 millones de Km.
Volumen: 0,6 el de la Tierra
Período de rotación (día): 88 días*/


                    Intent p = new Intent(MainActivity.this, InfoActivity.class);
                    p.putExtra (Posicion, String.valueOf(i));
                    startActivity(p);

                // muestra un mensaje
                Toast.makeText( getApplicationContext(), "Haz hecho click en " +itemSeleccionado, Toast.LENGTH_SHORT).show();

            }
        });

    }



}