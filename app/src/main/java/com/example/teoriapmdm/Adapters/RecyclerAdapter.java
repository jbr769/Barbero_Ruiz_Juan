package com.example.teoriapmdm.Adapters;

import static androidx.core.content.ContextCompat.startActivity;

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
import com.example.teoriapmdm.Controladores.Lista;
import com.example.teoriapmdm.Modelos.Jugadores;
import com.example.teoriapmdm.R;
import android.text.method.ScrollingMovementMethod;

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
    Jugadores jugador = listJugadores.get(position);
    holder.txtViewDesc.setText(jugador.getDescripcion());
    holder.txtViewDesc.setEllipsize(TextUtils.TruncateAt.END);
    holder.txtViewTitle.setText(jugador.getNombre());
    holder.imgJugador.setImageResource(jugador.getImageId());
    holder.imgJugador.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Context context = view.getContext();
            Intent detalle = new Intent(context, Detalle.class);
            detalle.putExtra("nombre", jugador.getNombre());
            detalle.putExtra("descripcion", jugador.getDescripcion());
            detalle.putExtra("imagen", jugador.getImageId());
            context.startActivity(detalle);
        }
    });
    holder.imgJugador.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {

            return false;
        }
    });
    }

    @Override
    public int getItemCount() {
        return listJugadores.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        ImageView imgJugador;
        TextView txtViewTitle;
        TextView  txtViewDesc;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            imgJugador  = (ImageView) itemView.findViewById(R.id.img_item);
            txtViewTitle = (TextView)  itemView.findViewById(R.id.txt_item_tittle);
            txtViewDesc  = (TextView)  itemView.findViewById(R.id.txt_item_desc);
        }
    }
}
