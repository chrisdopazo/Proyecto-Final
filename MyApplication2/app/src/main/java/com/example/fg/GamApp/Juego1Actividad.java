package com.example.fg.GamApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Juego1Actividad extends AppCompatActivity {
    Button flip;
    ImageView moneda;
    Random numero = new Random();
    int Lado;
public void girar(View v){

    flip = (Button)findViewById(R.id.flip);

    moneda= (ImageView) findViewById(R.id.moneda);

    Lado=numero.nextInt(2);

    if (Lado==0){
        moneda.setImageResource(R.drawable.cara);
        Toast Mosrar= Toast.makeText(Juego1Actividad.this,"Salio Cara",Toast.LENGTH_SHORT);
        Mosrar.show();
    }else if(Lado==1){
        moneda.setImageResource(R.drawable.cruz);
        Toast Mosrar2 = Toast.makeText(Juego1Actividad.this,"Salio Cruz",Toast.LENGTH_SHORT);
        Mosrar2.show();
    }

    RotateAnimation gira = new RotateAnimation(0,720 , RotateAnimation.RELATIVE_TO_SELF, 1f , RotateAnimation.RELATIVE_TO_SELF,1f);
    gira.setDuration(350);
    moneda.startAnimation(gira);


}





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego1_actividad);

    }
}
