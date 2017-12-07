package com.leticia.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* final EditText txtNombre = (EditText) findViewById(R.id.Nombre);
        String Name = (String) txtNombre.getText().toString();
        final EditText txtEmail = (EditText) findViewById(R.id.Email);
        txtEmail.setText("Leticia");*/

       final EditText txtNombre = (EditText) findViewById(R.id.Nombre);
       txtNombre.setSelectAllOnFocus(true);

       final EditText txtEmail = (EditText) findViewById(R.id.Email);
       txtEmail.setSelectAllOnFocus(true);

        final EditText txtTel = (EditText) findViewById(R.id.Tel);
        txtTel.setSelectAllOnFocus(true);

        final EditText txtContacto = (EditText) findViewById(R.id.Contacto);
        txtContacto.setSelectAllOnFocus(true);

    }

    public void Clicker (android.view.View v)
    {
        Intent ConfDatos = new Intent(MainActivity.this,ConfirmacionDatos.class);
        final EditText txtEmail = (EditText) findViewById(R.id.Email);
        final EditText txtNombre = (EditText) findViewById(R.id.Nombre);
        final DatePicker dpDOB = (DatePicker)  findViewById(R.id.FechaNac);
        final EditText txtTel = (EditText) findViewById(R.id.Tel);
        final EditText txtContacto = (EditText) findViewById(R.id.Contacto);

        //crear fecha formateada
        int day = dpDOB.getDayOfMonth();
        int month = dpDOB.getMonth() + 1;
        int year = dpDOB.getYear();
        String Date_DOB = (String) String.valueOf(month) + "/" + (String) String.valueOf(day) + "/" + (String) String.valueOf(year);

        ConfDatos.putExtra("Email",(String) txtEmail.getText().toString());
        ConfDatos.putExtra("Nombre",(String) txtNombre.getText().toString());
        ConfDatos.putExtra("DOB",(String) Date_DOB);
        ConfDatos.putExtra("Tel",(String) txtTel.getText().toString());
        ConfDatos.putExtra("Contacto",(String) txtContacto.getText().toString());





        startActivity(ConfDatos);
    }
}
