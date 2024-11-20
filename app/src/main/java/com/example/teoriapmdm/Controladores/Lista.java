package com.example.teoriapmdm.Controladores;

import static com.example.teoriapmdm.Utilidades.ListaJugadores.getListJugadores;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teoriapmdm.Adapters.RecyclerAdapter;
import com.example.teoriapmdm.Modelos.Jugadores;
import com.example.teoriapmdm.R;

import java.util.ArrayList;
import java.util.List;

public class Lista extends AppCompatActivity {

    RecyclerAdapter recAdapter;
    RecyclerView recView;
    Toolbar toolbar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        recView = (RecyclerView) findViewById(R.id.recyclerView);
        recAdapter = new RecyclerAdapter(getListJugadores());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setAdapter(recAdapter);
        recView.setLayoutManager(layoutManager);

    }

}