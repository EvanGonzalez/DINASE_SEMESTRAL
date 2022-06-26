package com.example.dinase_semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class menu extends AppCompatActivity {
    ImageButton eclipseSolar;
    ImageButton eclipseLunar;
    ImageButton efimerides;
    ImageButton DINACE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //animaciones
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_derecha);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_izquierda);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);

        eclipseSolar= (ImageButton) findViewById(R.id.btneclipsolar);
        eclipseLunar= (ImageButton) findViewById(R.id.btneclipselunar);
        efimerides= (ImageButton) findViewById(R.id.btnEfemerides);
        DINACE=(ImageButton) findViewById(R.id.btnDince);

        eclipseSolar.setAnimation(animation1);
        eclipseLunar.setAnimation(animation2);
        efimerides.setAnimation(animation2);
        DINACE.setAnimation(animation3);




    }

    public void eclipseSolar (View view){
        Intent intent =new Intent(menu.this,eclipseSolar.class);
        finish();
        startActivity(intent);
    }
}