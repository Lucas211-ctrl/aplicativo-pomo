package com.cursoandroid.teste.pomo.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.cursoandroid.teste.pomo.AtiviActivity;
import com.cursoandroid.teste.pomo.ConcluidoActivity;
import com.cursoandroid.teste.pomo.DescansaActivity;
import com.cursoandroid.teste.pomo.DescansamaisActivity;
import com.cursoandroid.teste.pomo.PontActivity;
import com.cursoandroid.teste.pomo.R;
import com.cursoandroid.teste.pomo.SobreActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class PomodoriFragment extends Fragment {
    int time = 0;

    private ImageButton buttonPomodori;
    private ImageButton buttonDescanso;
    private ImageButton buttonMdescanso;

    public PomodoriFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_pomodori, container, false);
            buttonPomodori = view.findViewById(R.id.buttonPomodori);
            buttonDescanso = view.findViewById(R.id.buttonDescanso);
            buttonMdescanso = view.findViewById(R.id.buttonMdescanso);

            buttonPomodori.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Thread.sleep(1500000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent intente = new Intent(getContext(), ConcluidoActivity.class);
                    startActivity(intente);
                }
            });

            buttonDescanso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Thread.sleep(300000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent intente = new Intent(getContext(), DescansaActivity.class);
                    startActivity(intente);
                }
            });

            buttonMdescanso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Thread.sleep(900000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent intente = new Intent(getContext(), DescansamaisActivity.class);
                    startActivity(intente);
                }
            });
        return view;
    }
}

