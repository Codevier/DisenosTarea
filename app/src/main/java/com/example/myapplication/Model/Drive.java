package com.example.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Drive {
    @SerializedName("head")
    @Expose
    private String encabezado;
    @SerializedName("subject")
    @Expose
    private String descripcion;

    @SerializedName("img")
    @Expose
    private String img;

    public Drive(String encabezado, String descripcion, String img) {
        this.encabezado = encabezado;
        this.descripcion = descripcion;
        this.img=img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Drive(JSONObject a) throws JSONException {
        encabezado =  a.getString("head").toString();
        descripcion =  a.getString("description").toString() ;
    }

    public static ArrayList<Drive> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Drive> carpetas = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            carpetas.add(new Drive(datos.getJSONObject(i)));
        }
        return carpetas;
    }
}
