package com.example.fg.GamApp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Juego2Actividad extends AppCompatActivity {
    Button papel;
    Button tijera;
    Button piedra;
    ImageView jugador1;
    ImageView jugador2;
    String ejugador1;
    String ejugador2;
    String resultado;
    Random i = new Random();

    public void piedra (View v){
        ejugador1 = "piedra";
        jugador1.setImageResource(R.drawable.piedra2);
        calcular();
    }

    public void papel (View v){

        ejugador1 = "papel";
        jugador1.setImageResource(R.drawable.papel);
        calcular();
    }

    public void tijera (View v){
        ejugador1 = "tijera";
        jugador1.setImageResource(R.drawable.tijera);
        calcular();

    }
    public void calcular(){
        int jugador2e = i.nextInt(3);
        if ( jugador2e ==0){
            ejugador2= "piedra";
            jugador2.setImageResource(R.drawable.piedra2);
        }
        else if ( jugador2e ==1){
            ejugador2= "papel";
            jugador2.setImageResource(R.drawable.papel);
        }
        else if ( jugador2e ==2){
            ejugador1= "tijera";
            jugador2.setImageResource(R.drawable.tijera);
        }

        if (ejugador1.equals("piedra") && ejugador2.equals("papel")){
            resultado = "Perdiste";
        }
        if (ejugador1.equals("piedra") && ejugador2.equals("tijera")){
            resultado = "Ganaste";
        }
        if (ejugador1.equals("papel") && ejugador2.equals("piedra")){
            resultado = "Ganaste";
        }
        if (ejugador1.equals("papel") && ejugador2.equals("tijera")){
            resultado = "Perdiste";
        }
        if (ejugador1.equals("tijera") && ejugador2.equals("piedra")){
            resultado = "Perdiste";
        }
        if (ejugador1.equals("tijera") && ejugador2.equals("papel")){
            resultado = "Ganaste";
        }
        if (ejugador1.equals("tijera") && ejugador2.equals("tijera")){
            resultado = "Empate , tire otra vez";
        }
        if (ejugador1.equals("piedra") && ejugador2.equals("piedra")){
            resultado = "Empate, tire otra vez";
        }
        if (ejugador1.equals("papel") && ejugador2.equals("papel")){
            resultado = "Empate, tire otra vez";
        }
        Toast Mosrar2 = Toast.makeText(Juego2Actividad.this,resultado,Toast.LENGTH_SHORT);
        Mosrar2.show();


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego2_actividad);
        jugador1 = (ImageView) findViewById(R.id.jugador1);
        jugador2 = (ImageView) findViewById(R.id.jugador2);

        tijera = (Button) findViewById(R.id.tijera);
        piedra = (Button) findViewById(R.id.piedra);
        papel = (Button) findViewById(R.id.papel);





    }
}
