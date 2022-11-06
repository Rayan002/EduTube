package com.example.edutube;


import android.animation.LayoutTransition;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.transition.Visibility;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class pyhton_document_fragment extends Fragment {

    TextView pythondetails01;
    LinearLayout layout01;
    CardView cardview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pyhton_document_fragment, container, false);

        pythondetails01 = view.findViewById(R.id.pythondeatails01);
        layout01 = view.findViewById(R.id.layout01);
        cardview = view.findViewById(R.id.cardview);
        layout01.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

    return view;
    }

    public void expand(View view){
////        int v = (pythondetails01.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
//
//        int v = pythondetails01.getVisibility();
//        if(v == View.GONE){
//            pythondetails01.setVisibility(View.VISIBLE);
//        }
//
////        else{
////            pythondetails01.getVisibility(View.GONE);
////        }

//        TransitionManager.beginDelayedTransition(layout01, new AutoTransition());
//        pythondetails01.setVisibility(View.VISIBLE);

        TransitionManager.beginDelayedTransition(cardview, new AutoTransition());
        pythondetails01.setVisibility(View.VISIBLE);
    }

}