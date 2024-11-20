package com.example.teoriapmdm.Controladores;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.teoriapmdm.R;

public class Registro extends AppCompatActivity {

        EditText nombre;
        EditText email;
        EditText edad;
        Button btnregi;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_registro);

            nombre = (EditText) findViewById(R.id.txtNombre);
            email = (EditText) findViewById(R.id.txtEmail);
            edad = (EditText) findViewById(R.id.txtEdad);
            btnregi = (Button) findViewById(R.id.btnRegistrase);

            nombre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if(b){
                        if (nombre.getText().toString().equalsIgnoreCase("NOMBRE")) nombre.setText("");
                    }else{
                        if (nombre.getText().toString().isEmpty()) nombre.setText("NOMBRE");
                    }
                }
            });

            email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if (b){
                        if (email.getText().toString().equalsIgnoreCase("EMAIL")) email.setText("");
                    }else{
                        if (email.getText().toString().isEmpty()) email.setText("EMAIL");
                    }
                }
            });

            edad.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if (b){
                        if (edad.getText().toString().equalsIgnoreCase("EDAD")) edad.setText("");
                    }else{
                        if (edad.getText().toString().isEmpty()) edad.setText("EDAD");
                    }
                }
            });

            btnregi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (nombre.getText().toString().equalsIgnoreCase("NOMBRE") || email.getText().toString().equalsIgnoreCase("EMAIL") || edad.getText().toString().equalsIgnoreCase("EDAD")){
                        Toast.makeText(Registro.this, "Debe rellenar todos los campos", Toast.LENGTH_LONG).show();
                    }else if (Integer.parseInt(edad.getText().toString()) < 18){
                        Toast.makeText(Registro.this, "Debe ser mayor de edad para registrarse", Toast.LENGTH_LONG).show();
                    }else{
                        AlertDialog registro = crearAlert();
                        registro.show();
                    }
                }
            });
        }

        private AlertDialog crearAlert() {
            AlertDialog.Builder builder = new AlertDialog.Builder(Registro.this);
            builder.setMessage("Registro correcto");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            return builder.create();
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
