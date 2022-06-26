package com.example.dinase_semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class menu extends AppCompatActivity {
    ImageButton eclipseSolar;
    ImageButton eclipseLunar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //animaciones
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_derecha);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_izquierda);

        eclipseSolar= (ImageButton) findViewById(R.id.btneclipsolar);
        eclipseLunar= (ImageButton) findViewById(R.id.btneclipselunar);

        eclipseSolar.setAnimation(animation1);
        eclipseLunar.setAnimation(animation2);
    }
}