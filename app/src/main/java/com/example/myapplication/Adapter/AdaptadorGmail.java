package com.example.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.Carpeta;
import com.example.myapplication.Model.Gmail;
import com.example.myapplication.R;

import java.util.ArrayList;

public class AdaptadorGmail extends RecyclerView.Adapter<AdaptadorGmail.ViewHolder> {
    ArrayList<Gmail> listaGmail;

    public AdaptadorGmail(ArrayList<Gmail> listaGmail) {
        this.listaGmail = listaGmail;
    }


    @NonNull
    @Override
    public AdaptadorGmail.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = inflater.inflate(R.layout.ly_item_gmail, null);
        return new AdaptadorGmail.ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorGmail.ViewHolder holder, int position) {
        holder.encabezado.setText(listaGmail.get(position).getEncabezado());
        holder.asunto.setText(listaGmail.get(position).getAsunto());
        holder.descripcion.setText(listaGmail.get(position).getDescripcion());
        holder.fecha.setText(listaGmail.get(position).getFecha());
    }

    @Override
    public int getItemCount() {
        return listaGmail.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView encabezado, asunto, descripcion,fecha;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.encabezado = (TextView) itemView.findViewById(R.id.headText);
            this.asunto = (TextView) itemView.findViewById(R.id.subText);
            this.descripcion = (TextView) itemView.findViewById(R.id.desText);
            this.fecha = (TextView) itemView.findViewById(R.id.dateText);
        }
    }
}
