package com.example.dinase_semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class eclipseSolar extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclipse_solar);


        String[] listado = getResources().getStringArray(R.array.prueba);
        spinner = (Spinner) findViewById(R.id.spin_desde);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        ArrayAdapter lista = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listado);
        lista.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(lista);




    }
}