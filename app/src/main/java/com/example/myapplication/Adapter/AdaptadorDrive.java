package com.example.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.Drive;
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
        View item = inflater.inflate(R.layout.ly_item_drive, null);
        return new AdaptadorDrive.ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorDrive.ViewHolder holder, int position) {
        holder.encabezado.setText(listaDrive.get(position).getEncabezado());
        holder.descripcion.setText(listaDrive.get(position).getDescripcion());
        switch (listaDrive.get(position).getImg()){

            case "1":
                holder.imagen.setImageResource(R.drawable.im_documento1);
                break;
            case "2":
                holder.imagen.setImageResource(R.drawable.im_documento2);
                break;
            case "3":
                holder.imagen.setImageResource(R.drawable.im_documento_horario);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return listaDrive.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView encabezado, descripcion;
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.encabezado = (TextView) itemView.findViewById(R.id.titulo_drive);
            this.descripcion = (TextView) itemView.findViewById(R.id.descr_drive);
            this.imagen=(ImageView) itemView.findViewById(R.id.imageView_drive);
        }
    }
}
