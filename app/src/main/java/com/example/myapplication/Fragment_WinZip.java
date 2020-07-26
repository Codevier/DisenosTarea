package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Adapter.AdaptadorCarpeta;
import com.example.myapplication.Model.Carpeta;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_WinZip#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_WinZip extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Carpeta> listaCarpetas;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_WinZip() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_WinZip newInstance(String param1, String param2) {
        Fragment_WinZip fragment = new Fragment_WinZip();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista= inflater.inflate(R.layout.fragment_winzip, container, false);
        listaCarpetas= new ArrayList<>();
        recyclerView= vista.findViewById(R.id.lstListaUsuario);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        llenarLista();

        AdaptadorCarpeta adaptadorCarpeta= new AdaptadorCarpeta(listaCarpetas);
        //AdaptadorRecyclerEmpleo adaptadorRecycler=new AdaptadorRecyclerEmpleo(lstEmpleados);

        recyclerView.setAdapter(adaptadorCarpeta);
        return vista;
    }

    private void llenarLista() {
        listaCarpetas.add(new Carpeta("Alarmas","0 items","2017-12-31","19:00"));
        listaCarpetas.add(new Carpeta("Android","3 items","2020-02-01","20:23"));
        listaCarpetas.add(new Carpeta("UTEQ","87 items","2020-07-26","13:17"));
        listaCarpetas.add(new Carpeta("Moviles","75 items","2020-07-25","23:59"));
        listaCarpetas.add(new Carpeta("Programacion","7 items","2020-07-25","23:19"));
        listaCarpetas.add(new Carpeta("Proyecto","70 items","2020-07-23","13:09"));
        listaCarpetas.add(new Carpeta("Mis documentos","5 items","2020-07-20","20:12"));
        listaCarpetas.add(new Carpeta("Imagenes","10 items","2020-07-02","13:45"));
        listaCarpetas.add(new Carpeta("Reportes","7 items","2020-06-25","12:56"));
        listaCarpetas.add(new Carpeta("Respaldo","1 items","2020-06-20","12:59"));
        listaCarpetas.add(new Carpeta("Personal","7 items","2020-03-15","11:01"));
        listaCarpetas.add(new Carpeta("Memes","100 items","2020-02-13","03:33"));
        listaCarpetas.add(new Carpeta("Historias","77 items","2020-01-01","01:00"));



    }
}