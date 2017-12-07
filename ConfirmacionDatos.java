package com.leticia.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmacionDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);
        Bundle bundle = getIntent().getExtras();
        //String Message = bundle.getString("Email");

        final TextView myEmail = (TextView) findViewById(R.id.txtEmail);
        myEmail.setText(bundle.getString("Email"));

        final TextView myNombre = (TextView) findViewById(R.id.txtNombre);
        myNombre.setText(bundle.getString("Nombre"));

        final TextView myDOB = (TextView) findViewById(R.id.txtDOB);
        myDOB.setText(bundle.getString("DOB"));

        final TextView myTel = (TextView) findViewById(R.id.txtTel);
        myTel.setText(bundle.getString("Tel"));

        final TextView myContacto = (TextView) findViewById(R.id.txtDesc);
        myContacto.setText(bundle.getString("Contacto"));
    }

    public void onClick (android.view.View v) {
        onBackPressed();
    }
}
