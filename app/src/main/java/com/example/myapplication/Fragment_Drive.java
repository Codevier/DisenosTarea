package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Adapter.AdaptadorDrive;
import com.example.myapplication.Model.Drive;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Drive#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Drive extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Drive> listaDrive;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_Drive() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frafment_G_Gmail.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Drive newInstance(String param1, String param2) {
        Fragment_Drive fragment = new Fragment_Drive();
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
        View vista= inflater.inflate(R.layout.fragment__drive, container, false);
        listaDrive= new ArrayList<>();
        recyclerView= vista.findViewById(R.id.lstListaDrive);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        llenarLista();

        AdaptadorDrive adaptadorCarpeta= new AdaptadorDrive(listaDrive);
        recyclerView.setAdapter(adaptadorCarpeta);
        return vista;
    }
    private void llenarLista() {
        listaDrive.add(new Drive("Disposita 7","Documento de programacion orientado a objetos","2"));
        listaDrive.add(new Drive("Disposita 6","Documento de comercio electronico","1"));
        listaDrive.add(new Drive("Horario de clases","Documento de horario de clases","3"));


    }
}