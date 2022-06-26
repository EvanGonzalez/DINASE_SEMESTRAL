package com.example.dinase_semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.sql.Array;

public class eclipseSolar extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclipse_solar);

        spinner = (Spinner) findViewById(R.id.spin_desde);

        String[] listado = getResources().getStringArray(R.array.prueba);

       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,listado);
       spinner.setAdapter(adapter);

 /*
       spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
               Toast.makeText(eclipseSolar.this,"Selecciono: "+listado[i],Toast.LENGTH_LONG).show();

                Intent intent = new Intent(eclipseSolar.this,listaeclipse_Solar.class);
                intent.putExtra("Fecha",listado[i]);
                startActivity(intent);



           }
       });
*/
    }

}
