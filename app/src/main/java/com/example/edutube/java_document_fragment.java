package com.example.edutube;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class java_document_fragment extends Fragment {


    TextView javadetail01;
    LinearLayout layout;
    CardView cardView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_pyhton_document_fragment, container, false);

        javadetail01 = view.findViewById(R.id.javadetail01);
        layout = view.findViewById(R.id.layout01);

        cardView = view.findViewById(R.id.cardview01);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View  view) {
                int v = (javadetail01.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

                TransitionManager.beginDelayedTransition(layout, new AutoTransition());
                javadetail01.setVisibility(v);

            }
        });

        return view;
    }

}


