package com.example.fg.GamApp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.HashMap;

public class crearsala extends AppCompatActivity {

    Button crear;
    EditText nombre, juego ;
    Spinner spinner;
    String NombreSala, TipoJuego ;
    String finalResult ;
    String HttpURL = "http://proyectofaina.azurewebsites.net/crearsala.php";
    Boolean CheckEditText ;
    ProgressDialog progressDialog;
    HashMap<String,String> hashMap = new HashMap<>();
    HttpParse httpParse = new HttpParse();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearsala);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(crearsala.this , android.R.layout.simple_list_item_1 , getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);

        //Assign Id'S
        nombre = (EditText)findViewById(R.id.editTextF_Name);
        juego = (EditText)findViewById(R.id.editTextL_Name);

        crear = (Button)findViewById(R.id.Submit);


        //Adding Click Listener on button.
        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Checking whether EditText is Empty or Not
                CheckEditTextIsEmptyOrNot();

                if(CheckEditText){

                    // If EditText is not empty and CheckEditText = True then this block will execute.

                    UserRegisterFunction(NombreSala,TipoJuego);

                }
                else {

                    // If EditText is empty then this block will execute .
                    Toast.makeText(crearsala.this, "Llenar todos los campo , por favor", Toast.LENGTH_LONG).show();

                }

            }
        });

    }

    public void CheckEditTextIsEmptyOrNot(){

        NombreSala = nombre.getText().toString();
        TipoJuego = spinner.getSelectedItem().toString();



        if(TextUtils.isEmpty(NombreSala) || TextUtils.isEmpty(TipoJuego))
        {

            CheckEditText = false;

        }
        else {

            CheckEditText = true ;
        }

    }

    public void UserRegisterFunction(final String nombre, final String juego){

        class UserRegisterFunctionClass extends AsyncTask<String,Void,String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                progressDialog = ProgressDialog.show(crearsala.this,"Cargando",null,true,true);
            }

            @Override
            protected void onPostExecute(String httpResponseMsg) {

                super.onPostExecute(httpResponseMsg);

                progressDialog.dismiss();
                if(httpResponseMsg.equalsIgnoreCase("Sala Creada . Muchas Gracias!")){

                    Toast.makeText(crearsala.this,httpResponseMsg.toString(), Toast.LENGTH_LONG).show();

                    finish();

                    Intent intent = new Intent(crearsala.this, salas.class);

                    startActivity(intent);

                }


            }

            @Override
            protected String doInBackground(String... params) {

                hashMap.put("nombre",params[0]);

                hashMap.put("juego",params[1]);

                finalResult = httpParse.postRequest(hashMap, HttpURL);

                return finalResult;
            }
        }

        UserRegisterFunctionClass userRegisterFunctionClass = new UserRegisterFunctionClass();

        userRegisterFunctionClass.execute(nombre,juego);


    }

}