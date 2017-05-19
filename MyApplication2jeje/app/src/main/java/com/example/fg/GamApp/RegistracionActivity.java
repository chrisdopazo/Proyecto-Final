package com.example.fg.GamApp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistracionActivity extends AppCompatActivity implements View.OnClickListener{
    Button botonregistrar;
    EditText email;
    EditText contraseña;
    TextView yaregistrado;

    ProgressDialog progressDialog;

    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracion);
        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() != null){

            finish();
            startActivity( new Intent(getApplicationContext(),ProfileActivity.class));

        }
         progressDialog = new ProgressDialog(this);
         botonregistrar =(Button)findViewById(R.id.btnlogin);
         email = (EditText) findViewById(R.id.emailconf);
         contraseña = (EditText) findViewById(R.id.passwordconf);
         yaregistrado = (TextView)findViewById(R.id.yaregistrado);

        botonregistrar.setOnClickListener(this);
        yaregistrado.setOnClickListener(this);

    }
    private  void registrarusuario(){

        String email2 = email.getText().toString().trim();
        String passoword2 = contraseña.getText().toString().trim();
        if(TextUtils.isEmpty(email2)){
            //email esta vacio
            Toast.makeText(this , "Ingrese un email" ,Toast.LENGTH_SHORT).show();
            //deja de seguir procesando la app
            return;
        }
        if(TextUtils.isEmpty(passoword2)){
            //contraseña esta vacia
            Toast.makeText(this , "Ingrese una contraseña" ,Toast.LENGTH_SHORT).show();
            //deja de seguir procesando la app
            return;
        }
        //si pada aca es que estan bien puestas y muestro un cargador
        progressDialog.setMessage("Registrando Usuario...");
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(email2 , passoword2)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                           if(task.isSuccessful()){
                                   finish();
                                   Toast.makeText(RegistracionActivity.this , "Registracion Completa",Toast.LENGTH_SHORT).show();
                                   startActivity( new Intent(getApplicationContext(),ProfileActivity.class));
                           }else{
                               Toast.makeText(RegistracionActivity.this , "Error en la Resgitracion. Por favor pruebe de nuevo",Toast.LENGTH_SHORT).show();

                           }
                    }
                });

    }

    @Override
    public void onClick(View view) {
        if(view == botonregistrar){
            registrarusuario();
        }
        if(view == yaregistrado){
            Intent hola;
            hola =  new Intent(this , LoginActivity.class);
            startActivity(hola);

        }

    }
}
