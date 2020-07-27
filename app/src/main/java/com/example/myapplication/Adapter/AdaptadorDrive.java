package com.example.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.Drive;
import com.example.myapplication.Model.Gmail;
import com.example.myapplication.R;

import java.util.ArrayList;

public class AdaptadorDrive extends RecyclerView.Adapter<AdaptadorDrive.ViewHolder> {
    ArrayList<Drive> listaDrive;

    public AdaptadorDrive(ArrayList<Drive> listaDrive) {
        this.listaDrive = listaDrive;
    }


    @NonNull
    @Override
    public AdaptadorDrive.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = inflater.inflate(R.layout.ly_item_gmail, null);
        return new AdaptadorDrive.ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorDrive.ViewHolder holder, int position) {
        holder.encabezado.setText(listaDrive.get(position).getEncabezado());
        holder.descripcion.setText(listaDrive.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return listaDrive.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView encabezado, descripcion;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.encabezado = (TextView) itemView.findViewById(R.id.lbltitle);
            this.descripcion = (TextView) itemView.findViewById(R.id.lblDetalle);
        }
    }
}
