package com.cursoandroid.teste.pomo.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cursoandroid.teste.pomo.AtiviActivity;
import com.cursoandroid.teste.pomo.AtividadeActivity;
import com.cursoandroid.teste.pomo.PontActivity;
import com.cursoandroid.teste.pomo.R;
import com.cursoandroid.teste.pomo.SobreActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class GeralFragment extends Fragment{


    public GeralFragment() {
        // Required empty public constructor
    }

    private Button buttonAtividade;
    private Button buttonPont;
    private Button buttonSobre;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_geral, container, false);

        buttonAtividade = view.findViewById(R.id.buttonAdd);
        buttonPont = view.findViewById(R.id.buttonPont);
        buttonSobre = view.findViewById(R.id.buttonSobre);

        buttonAtividade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta = new Intent(getContext(), AtiviActivity.class);
                startActivity(intenta);
            }
        });
        buttonPont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentb = new Intent(getContext(), PontActivity.class);
                startActivity(intentb);
            }
        });
        buttonSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc = new Intent(getContext(), SobreActivity.class);
                startActivity(intentc);
            }
        });
        return view;
    }
    }


