package com.example.myapplication.Model;

import android.widget.ImageView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Carpeta {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("hour")
    @Expose
    private String hour;
    @SerializedName("img")
    @Expose
    private String img;

    private ImageView imagen;

    public Carpeta(String title, String item, String date, String hour) {
        this.title = title;
        this.item = item;
        this.date = date;
        this.hour = hour;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public Carpeta(JSONObject a) throws JSONException {
        title =  a.getString("title").toString();
        date =  a.getString("date").toString() ;
        hour =  a.getString("hour").toString() ;
        item =  a.getString("item").toString() ;
        img = a.getString("img").toString() ;
    }

    public static ArrayList<Carpeta> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Carpeta> carpetas = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            carpetas.add(new Carpeta(datos.getJSONObject(i)));
        }
        return carpetas;
    }
}
