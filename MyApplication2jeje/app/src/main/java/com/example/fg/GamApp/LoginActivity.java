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

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    Button botonlogin;
    EditText email;
    EditText contraseña;
    TextView sincuenta;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_login);
        firebaseAuth= FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() != null){

            finish();
            startActivity( new Intent(getApplicationContext(),ProfileActivity.class));

        }
        botonlogin =(Button)findViewById(R.id.botonlogin);
        email = (EditText) findViewById(R.id.emailconf);
        contraseña = (EditText) findViewById(R.id.passwordconf);
        sincuenta = (TextView)findViewById(R.id.sinlogin);
        progressDialog = new ProgressDialog(this);


        botonlogin.setOnClickListener(this);
        sincuenta.setOnClickListener(this);
    }
    private void UserLogin(){
        String email2 = email.getText().toString().trim();
        String password2 = contraseña.getText().toString().trim();

        if(TextUtils.isEmpty(email2)){
            Toast.makeText(this , "Ingrese un email" ,Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password2)){
            //contraseña esta vacia
            Toast.makeText(this , "Ingrese una contraseña" ,Toast.LENGTH_SHORT).show();
            //deja de seguir procesando la app
            return;
        }
        progressDialog.setMessage("Iniciando Sesion...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email2 , password2)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            finish();
                            startActivity( new Intent(getApplicationContext(),ProfileActivity.class));


                        }
                    }
                });

    }

    @Override
    public void onClick(View view) {
        if(view == botonlogin ){
            UserLogin();
        }
        if(view == sincuenta){
            finish();
           startActivity(new Intent(this , RegistracionActivity.class));

        }
    }
}
