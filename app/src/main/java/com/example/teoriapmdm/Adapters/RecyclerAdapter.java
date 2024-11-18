package com.example.teoriapmdm.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teoriapmdm.Modelos.Jugadores;
import com.example.teoriapmdm.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    List<Jugadores> listJugadores;

    public RecyclerAdapter(List<Jugadores> listJugadores){ this.listJugadores = listJugadores; }

    @NonNull
    @Override
    public RecyclerAdapter.RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler,parent, false);
        RecyclerHolder recyclerHolder = new RecyclerHolder(view);
        return recyclerHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        ImageView imgJugador;
        TextView txtViewTitle;
        TextView  txtViewDesc;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);

            /*imgJugador  = (ImageView) itemView.findViewById(R.id.img_item);
            txtViewTitle = (TextView)  itemView.findViewById(R.id.txt_item_tittle);
            txtViewDesc  = (TextView)  itemView.findViewById(R.id.txt_item_desc);*/


        }
    }
}
