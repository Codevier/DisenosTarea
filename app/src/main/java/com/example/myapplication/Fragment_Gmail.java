package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.AdaptadorCarpeta;
import com.example.myapplication.Adapter.AdaptadorGmail;
import com.example.myapplication.Model.Carpeta;
import com.example.myapplication.Model.Gmail;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Gmail#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Gmail extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Gmail> listaGmail;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_Gmail() {
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
    public static Fragment_Gmail newInstance(String param1, String param2) {
        Fragment_Gmail fragment = new Fragment_Gmail();
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
        View vista= inflater.inflate(R.layout.fragment_gmail, container, false);
        listaGmail= new ArrayList<>();
        recyclerView= vista.findViewById(R.id.lstListaCorreos);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        llenarLista();

        AdaptadorGmail adaptadorGmail= new AdaptadorGmail(listaGmail);
        //AdaptadorRecyclerEmpleo adaptadorRecycler=new AdaptadorRecyclerEmpleo(lstEmpleados);

        recyclerView.setAdapter(adaptadorGmail);
        return vista;
    }

    private void llenarLista() {
        listaGmail.add(new Gmail("Kaspersky","Celebra nuestro aniversario con nosotros.","Ahorra 50% en Kaspersky Total Security y llévate gratis nuestra VPN premium ilimitada para que navegues sin dejar huella. Además protege tus transacciones, navegación, cámara web y privacidad digital","21 jul"));
        listaGmail.add(new Gmail("1 JEANNY XAVIER MUÑOZ PISCO ","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));
        listaGmail.add(new Gmail("JEANNY XAVIER MUÑOZ PISCO","Respaldo de programa","Aqui te envie todos los documentos...","25 jul"));

    }
}