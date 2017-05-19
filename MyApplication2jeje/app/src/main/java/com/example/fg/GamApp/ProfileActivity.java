package com.example.fg.GamApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    FirebaseAuth firebaseAuth;
    Button confirmar;
    TextView usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_perfil);
        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser()==null)
        {
            finish();
            startActivity( new Intent(this,LoginActivity.class));

        }
        FirebaseUser usuarioparamostrar = firebaseAuth.getCurrentUser();
        usuario = (TextView) findViewById(R.id.textviewuseryemail);
        usuario.setText("Bienvenido " + usuarioparamostrar.getEmail());
        confirmar =  (Button) findViewById(R.id.botonsalir);



        confirmar.setOnClickListener(this);

    }
    public void suerte (View v)
    {
        Intent hola;
        hola= new Intent(this , ActividadPrincipal.class);
        startActivity(hola);

    }

    @Override
    public void onClick(View v) {
        if(v == confirmar)
        {
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this , LoginActivity.class));
        }

    }
}
