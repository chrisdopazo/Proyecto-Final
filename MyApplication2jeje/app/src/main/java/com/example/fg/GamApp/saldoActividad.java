package com.example.fg.GamApp;

import android.content.Intent;
import android.graphics.Typeface;
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
            Uri uri =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=LBABY3V5XA7AS");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);

        }
        else if(i==10){
            Uri uri2 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=XTVW8LWPW6VVE");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri2);
            startActivity(intent);

        }
        else if(i==15){
            Uri uri3 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GFGKZCGPDLU56");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri3);
            startActivity(intent);

        }
        else if(i==20){
            Uri uri4 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=F8PDGMGHCPK4A");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri4);
            startActivity(intent);

        }
        else if(i==25){
            Uri uri5 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=BCJF5W39QD5CG");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri5);
            startActivity(intent);

        }
        else if(i==30){
            Uri uri6 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=FKAM6N55LHUSJ");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri6);
            startActivity(intent);

        }
        else if(i==35){
            Uri uri7 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=ZCSM4BFXHGZU2");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri7);
            startActivity(intent);

        }
        else if(i==40){
            Uri uri8 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=UQHXKYAC79SVS");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri8);
            startActivity(intent);

        }
        else if(i==45){
            Uri uri9 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=ZQUHJRG3Z85BE");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri9);
            startActivity(intent);

        }
        else if(i==55){
            Uri uri10 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GUUGTXLRV38GE");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri10);
            startActivity(intent);

        }
        else if(i==60){
            Uri uri11 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=A8BL9KR3KCP3U");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri11);
            startActivity(intent);

        }
        else if(i==65){
            Uri uri12 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=CS2B2QH4ZVAYS");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri12);
            startActivity(intent);

        }
        else if(i==70){
            Uri uri13 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=RLB2XRU85P63W");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri13);
            startActivity(intent);

        }
        else if(i==75){
            Uri uri14=Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=SHRDZE37CJHN4");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri14);
            startActivity(intent);

        }
        else if(i==80){
            Uri uri15 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=47URFPXB53JUE");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri15);
            startActivity(intent);

        }
        else if(i==85){
            Uri uri16=Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=3WCGUBCXX7KR8");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri16);
            startActivity(intent);

        }

        else if(i==90){
            Uri uri17 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=PBUG6NGAS8JJC");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri17);
            startActivity(intent);

        }
        else if(i==95){
            Uri uri18 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=BXYFA3SA5W9YN");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri18);
            startActivity(intent);

        }
        else if(i==100){
            Uri uri19 =Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=LG8KM5SHFJX3L");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri19);
            startActivity(intent);

        }
        if (i != 5 && i != 10 && i != 15 &&  i != 20 && i != 25 && i != 30 && i != 35 && i != 40 && i != 45 && i != 50 && i != 55 && i != 60 && i != 70 && i != 75 && i != 80 && i != 85 && i != 90 && i != 95 && i != 100 ){
            Toast Mosrar2 = Toast.makeText(saldoActividad.this," Seleccione algun valor valido ",Toast.LENGTH_SHORT);
            Mosrar2.show();
        }

    }
    public void pagar5(View vista1){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton5;
        boton5=(Button) findViewById(R.id.boton5);
        int  saldo;
        saldo = Integer.parseInt(cantidad.getText().toString());
        int total= saldo + 5;
        click=true;

        if(click = true){

            cantidad.setText(String.valueOf(total));

        }
    }

    public void pagar10(View vista2){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton10;
        boton10=(Button) findViewById(R.id.boton10);
        int  saldo;
        saldo = Integer.parseInt(cantidad.getText().toString());
        int total= saldo + 10;

        click=true;

        if(click = true){

            cantidad.setText(String.valueOf(total));

        }
    }
    public void pagar20(View vista3){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton20;
        boton20=(Button) findViewById(R.id.boton20);
        int  saldo;
        saldo = Integer.parseInt(cantidad.getText().toString());
        int total= saldo + 20;
        click=true;

        if(click == true){

            cantidad.setText(String.valueOf(total));

        }
    }
    public void pagar50(View vista3){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton50;
        boton50=(Button) findViewById(R.id.boton50);
        int  saldo;
        saldo = Integer.parseInt(cantidad.getText().toString());
        int total= saldo + 50;
        click=true;

        if(click == true){

           cantidad.setText(String.valueOf(total));

        }
    }

    public void pagar100(View vista3){
        EditText cantidad;
        cantidad=(EditText) findViewById(R.id.cantidad);
        Button boton100;
        boton100=(Button) findViewById(R.id.boton100);
        int  saldo;
        saldo = Integer.parseInt(cantidad.getText().toString());
        int total= saldo + 100;
        click=true;

        if(click == true){

            cantidad.setText(String.valueOf(total));

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
