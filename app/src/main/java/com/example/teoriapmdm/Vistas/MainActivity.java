package com.example.teoriapmdm.Vistas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.teoriapmdm.R;

public class MainActivity extends AppCompatActivity {

    Button btn_Registro;
    Button btn_Lista;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Registro = (Button) findViewById(R.id.btnRegistro);
        btn_Lista = (Button) findViewById(R.id.btnLista);

        btn_Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registro = new Intent(getApplicationContext(), Registro.class);
                startActivity(registro);
            }
        });

        btn_Lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lista.class);
                startActivity(intent);
            }
        });

    }
}