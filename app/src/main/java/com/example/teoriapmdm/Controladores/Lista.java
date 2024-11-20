package com.example.teoriapmdm.Controladores;

import static com.example.teoriapmdm.Utilidades.ListaJugadores.getListJugadores;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teoriapmdm.Adapters.RecyclerAdapter;
import com.example.teoriapmdm.Modelos.Jugadores;
import com.example.teoriapmdm.R;

import java.util.ArrayList;
import java.util.List;

public class Lista extends AppCompatActivity {

    private RecyclerAdapter recAdapter;
    private RecyclerView recView;
    private ActionMode mActionMode;

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
    private ActionMode.Callback mActionCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.menu, menu);
            mode.setTitle("Action Menu");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            int itemId = item.getItemId();

            mode.finish();
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };
}