package com.example.fg.GamApp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class ActividadPrincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    MediaPlayer dsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //dsa = MediaPlayer.create(ActividadPrincipal.this , R.raw.cancion);
        //dsa.start();



    }
    //@Override
    //protected void onPause() {
      //  super.onPause();
       // dsa.release();
    //}


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actividad_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_juego1) {
            Intent hola;
            hola= new Intent(ActividadPrincipal.this , Juego1Actividad.class);
            startActivity(hola);
        } else if (id == R.id.login) {
            Intent hola6;
            hola6= new Intent(ActividadPrincipal.this , LoginActivity.class);
            startActivity(hola6);

        } else if (id == R.id.nav_juego2) {
            Intent hola;
            hola= new Intent(ActividadPrincipal.this , Juego2Actividad.class);
            startActivity(hola);

        } else if (id == R.id.nav_regalo) {
            Intent hola4;
            hola4= new Intent(ActividadPrincipal.this , RecompesasActividad.class);
            startActivity(hola4);

        } else if (id == R.id.nav_login) {
            Intent hola5;
            hola5= new Intent(ActividadPrincipal.this , LoginActivity.class);
            startActivity(hola5);

        } else if (id == R.id.nav_saldo) {
            Intent hola8;
            hola8= new Intent(ActividadPrincipal.this , saldoActividad.class);
            startActivity(hola8);


        } else if (id == R.id.nav_contacto) {
            Intent hola9;
            hola9= new Intent(ActividadPrincipal.this , ContactoActividad.class);
            startActivity(hola9);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
