package com.example.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.Carpeta;
import com.example.myapplication.R;

import java.util.ArrayList;

public class AdaptadorCarpeta extends RecyclerView.Adapter<AdaptadorCarpeta.ViewHolder> {
    ArrayList<Carpeta> listaCarpetas;

    public AdaptadorCarpeta(ArrayList<Carpeta> listaCarpetas) {
        this.listaCarpetas = listaCarpetas;
    }


    @NonNull
    @Override
    public AdaptadorCarpeta.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = inflater.inflate(R.layout.ly_item_winzip, null);
        return new AdaptadorCarpeta.ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorCarpeta.ViewHolder holder, int position) {
        holder.title.setText(listaCarpetas.get(position).getTitle());
        holder.detalle.setText(listaCarpetas.get(position).getDetalle());
    }

    @Override
    public int getItemCount() {
        return listaCarpetas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, detalle;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.lbltitle);
            detalle=(TextView) itemView.findViewById(R.id.lblDetalle);
            //imageView = (ImageView)itemView.findViewById(R.id.imgCarp);
        }
    }
}
