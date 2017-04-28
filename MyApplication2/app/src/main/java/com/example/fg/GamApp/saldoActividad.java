package com.example.fg.GamApp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class saldoActividad extends AppCompatActivity {
    boolean click= false;



    public void pagar(View v){

        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        int i = Integer.parseInt(cantidad.getText().toString());




if(i==0){
    Toast Mosrar2 = Toast.makeText(saldoActividad.this," Seleccione algun valor valido ",Toast.LENGTH_SHORT);
        Mosrar2.show();

    }




        if(i==5){
            Uri uri =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=UV3N6927C5ZR6");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);

        }
        else if(i==10){
            Uri uri2 =Uri.parse("https://www.paypal.com/webapps/hermes?token=3VJ62403E0408982U&useraction=commit&mfid=1491789324231_4d8dc11dd49b6#/checkout/login");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri2);
            startActivity(intent);

        }
        else if(i==15){
            Uri uri3 =Uri.parse("https://www.paypal.com/webapps/hermes?token=5JC83199PR303372D&useraction=commit&mfid=1491789409867_76a3d75d6edc1");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri3);
            startActivity(intent);

        }
        else if(i==20){
            Uri uri4 =Uri.parse("https://www.paypal.com/webapps/hermes?token=49Y49288UE626221S&useraction=commit&mfid=1491789525209_996f4f2449a09#/checkout/login");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri4);
            startActivity(intent);

        }
        else if(i==50){
            Uri uri5 =Uri.parse("https://www.paypal.com/webapps/hermes?token=12173570U1678241K&useraction=commit&mfid=1491789676891_9fb5207b1e0a#/checkout/login");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri5);
            startActivity(intent);

        }
        else if(i==100){
            Uri uri6 =Uri.parse("https://www.paypal.com/webapps/hermes?token=32659141EU914772W&useraction=commit&mfid=1491789774623_27f855afb4fd5#/checkout/login");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri6);
            startActivity(intent);

        }
        if (i != 5 && i != 10 && i != 20 && i != 50 && i != 100 ){
            Toast Mosrar2 = Toast.makeText(saldoActividad.this," Seleccione algun valor valido ",Toast.LENGTH_SHORT);
            Mosrar2.show();
        }

    }
    public void pagar5(View vista1){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton5;
        boton5=(Button) findViewById(R.id.boton5);

        click=true;

        if(click == true){

            cantidad.setText("5");

        }
    }

    public void pagar10(View vista2){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton10;
        boton10=(Button) findViewById(R.id.boton10);

        click=true;

        if(click == true){

            cantidad.setText("10");

        }
    }
    public void pagar20(View vista3){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton20;
        boton20=(Button) findViewById(R.id.boton20);

        click=true;

        if(click == true){

            cantidad.setText("20");

        }
    }
    public void pagar50(View vista3){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton50;
        boton50=(Button) findViewById(R.id.boton50);

        click=true;

        if(click == true){

            cantidad.setText("50");

        }
    }

    public void pagar100(View vista3){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton100;
        boton100=(Button) findViewById(R.id.boton100);

        click=true;

        if(click == true){

            cantidad.setText("100");

        }



    }
    public void borrar(View vista4){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton100;
        boton100=(Button) findViewById(R.id.boton100);

        click=true;

        if(click == true){

            cantidad.setText("0");

        }



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saldo_actividad);
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        cantidad.setText("0");

    }
}
