package com.cursoandroid.teste.pomo.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cursoandroid.teste.pomo.AtiviActivity;
import com.cursoandroid.teste.pomo.NewsActivity;
import com.cursoandroid.teste.pomo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFragment extends Fragment {

    public InicioFragment() {
        // Required empty public constructor
    }

    private Button buttonNews;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_inicio, container, false);
        buttonNews = view.findViewById(R.id.buttonNews);

        buttonNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentn = new Intent(getContext(), NewsActivity.class);
                startActivity(intentn);
            }
        });

        return view;

    }
}
