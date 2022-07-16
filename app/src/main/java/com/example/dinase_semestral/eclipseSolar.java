package com.example.dinase_semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class eclipseSolar extends AppCompatActivity {

    Spinner spinnerDesde;
    Spinner spinnerHasta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclipse_solar);

        spinnerDesde = (Spinner) findViewById(R.id.spin_desde);


        String[] listadoDesde = getResources().getStringArray(R.array.Desde);
        String[] listadoHasta = getResources().getStringArray(R.array.Hasta);

       ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,listadoDesde);
       spinnerDesde.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,listadoHasta);
        spinnerHasta.setAdapter(adapter2);







    }
}