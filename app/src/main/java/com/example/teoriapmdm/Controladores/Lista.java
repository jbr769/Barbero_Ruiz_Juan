package com.example.teoriapmdm.Controladores;

import static com.example.teoriapmdm.Utilidades.ListaJugadores.getListJugadores;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ActionMode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teoriapmdm.Adapters.RecyclerAdapter;
import com.example.teoriapmdm.Modelos.Jugadores;
import com.example.teoriapmdm.R;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {

    private RecyclerAdapter recAdapter;
    private RecyclerView recView;
    private ActionMode mActionMode;
    private ArrayList<Jugadores> jugadoresList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        jugadoresList = getListJugadores();
        recView = findViewById(R.id.recyclerView);
        recAdapter = new RecyclerAdapter(jugadoresList, position -> {
            if (mActionMode == null) {
                mActionMode = startSupportActionMode(mActionCallback);
            }
            mActionMode.setTag(position);
        });
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setAdapter(recAdapter);
        recView.setLayoutManager(layoutManager);
    }

    private ActionMode.Callback mActionCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.menu, menu);
            mode.setTitle("Borrar");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            int itemId = item.getItemId();
            if (itemId == R.id.item_delete) {
                final int selectedPosition = (int) mActionMode.getTag();
                new AlertDialog.Builder(Lista.this)
                        .setTitle("Confirmar eliminación")
                        .setMessage("¿Estás seguro de que quieres eliminar este jugador?")
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (selectedPosition != -1) {
                                    jugadoresList.remove(selectedPosition);
                                    recAdapter.notifyItemRemoved(selectedPosition);
                                    recAdapter.notifyItemRangeChanged(selectedPosition, jugadoresList.size());
                                }
                                mode.finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                mode.finish();
                                Toast.makeText(Lista.this, "Operacion cancelada", Toast.LENGTH_LONG).show();
                            }
                        })
                        .create()
                        .show();

                return true;
            }
            return false;
        }
        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };
}
