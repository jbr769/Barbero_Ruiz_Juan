package com.example.teoriapmdm.Controladores;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.teoriapmdm.R;

public class Detalle extends AppCompatActivity {

    TextView titulo;
    TextView des;
    ImageView imagen;

    @Override
    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        titulo = (TextView) findViewById(R.id.txt_Detalle_title);
        des = (TextView) findViewById(R.id.txt_Detalle_des);
        imagen = (ImageView) findViewById(R.id.img_Detalle);
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String descripcion = intent.getStringExtra("descripcion");
        int imagenId = intent.getIntExtra("imagen", 0);
        titulo.setText(nombre);
        des.setText(descripcion);
        imagen.setImageResource(imagenId);
    }
}
