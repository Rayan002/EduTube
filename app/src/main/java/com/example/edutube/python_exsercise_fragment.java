package com.example.edutube;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class python_exsercise_fragment extends Fragment {

    CardView cardView;
    TextView visibletext;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_python_exsercise_fragment, container, false);

        cardView = v.findViewById(R.id.cardview);
        visibletext = v.findViewById(R.id.visibletext);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              if(visibletext.getVisibility() == View.GONE){
                  visibletext.setVisibility(View.VISIBLE);
              }

              else if(visibletext.getVisibility() == View.VISIBLE){
                  visibletext.setVisibility(View.GONE);
              }

            }
        });
        return v;
    }
}