package com.example.myapplication.Model;

import android.widget.ImageView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Gmail {
    @SerializedName("head")
    @Expose
    private String encabezado;
    @SerializedName("subject")
    @Expose
    private String asunto;
    @SerializedName("description")
    @Expose
    private String descripcion;
    @SerializedName("dato")
    @Expose
    private String fecha;

    public Gmail(String encabezado, String asunto, String descripcion, String fecha) {
        this.encabezado = encabezado;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Gmail(JSONObject a) throws JSONException {
        encabezado =  a.getString("head").toString();
        asunto =  a.getString("subject").toString() ;
        descripcion =  a.getString("description").toString() ;
        fecha =  a.getString("dato").toString() ;
    }

    public static ArrayList<Gmail> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Gmail> carpetas = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            carpetas.add(new Gmail(datos.getJSONObject(i)));
        }
        return carpetas;
    }
}
