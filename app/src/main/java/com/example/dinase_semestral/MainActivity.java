package com.example.dinase_semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView logoImagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //animaciones
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);

        logoImagen= (ImageView) findViewById(R.id.imglogo);

        logoImagen.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, menu.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}