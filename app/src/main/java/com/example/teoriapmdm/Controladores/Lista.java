package com.example.teoriapmdm.Controladores;

import android.annotation.SuppressLint;
import android.os.Bundle;

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

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        recView = (RecyclerView) findViewById(R.id.reciclerView);
        recAdapter = new RecyclerAdapter(getListJugadores());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setAdapter(recAdapter);
        recView.setLayoutManager(layoutManager);
    }
    public List<Jugadores> getListJugadores(){
        ArrayList<Jugadores> list = new ArrayList<Jugadores>();
        /*list.add(new Jugadores("Cristiano Ronaldo","Una vez se cansó de ser el mejor en juego de tronos, cogió un tridente y de fue a nadar con los peces",R.drawable.cr7));
        list.add(new Jugadores("Messi","Un hombre disfrazado de murciélago se pelea con un hombre con la ropa interior roja por fuera",R.drawable.messi));
        list.add(new Jugadores("Bencema","Un hombre disfrazado, el de juego de tronos, un robot, una mujer con una cuerda y el hombre de la ropa interior se pelean con un bicho",R.drawable.bencema));
        list.add(new Jugadores("Modric","¿Y si la ropa interior la hubiera comprado en Rusia?",R.drawable.modric));
        list.add(new Jugadores("Zidane","Una mujer superfuerte con un lazo, no quiere que nadie sepa que es superfuerte y que tiene un lazo",R.drawable.zidane));
        list.add(new Jugadores("Kaka","Un hombre rubio superfuerte se pelea con su hermano y se encuentra con una de las gemas del...oh wait!! que alguien despida al becario!!",R.drawable.kaka));
        */return list;
    }
}