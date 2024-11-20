package com.example.teoriapmdm.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teoriapmdm.Controladores.Detalle;
import com.example.teoriapmdm.Modelos.Jugadores;
import com.example.teoriapmdm.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    private List<Jugadores> listJugadores;
    private OnItemLongClickListener longClickListener;

    // Constructor
    public RecyclerAdapter(List<Jugadores> listJugadores, OnItemLongClickListener longClickListener) {
        this.listJugadores = listJugadores;
        this.longClickListener = longClickListener;
    }

    @NonNull
    @Override
    public RecyclerAdapter.RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerHolder holder, int position) {
        Jugadores jugador = listJugadores.get(position);
        holder.txtViewDesc.setText(jugador.getDescripcion());
        holder.txtViewDesc.setEllipsize(TextUtils.TruncateAt.END);
        holder.txtViewTitle.setText(jugador.getNombre());
        holder.imgJugador.setImageResource(jugador.getImageId());
        holder.itemView.setOnClickListener(v -> {
            Context context = v.getContext();
            Intent detalle = new Intent(context, Detalle.class);
            detalle.putExtra("nombre", jugador.getNombre());
            detalle.putExtra("descripcion", jugador.getDescripcion());
            detalle.putExtra("imagen", jugador.getImageId());
            context.startActivity(detalle);
        });
        holder.itemView.setOnLongClickListener(v -> {
            if (longClickListener != null) {
                longClickListener.onItemLongClick(position);
            }
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return listJugadores.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        ImageView imgJugador;
        TextView txtViewTitle;
        TextView txtViewDesc;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            imgJugador = itemView.findViewById(R.id.img_item);
            txtViewTitle = itemView.findViewById(R.id.txt_item_tittle);
            txtViewDesc = itemView.findViewById(R.id.txt_item_desc);
        }
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(int position);
    }
}
