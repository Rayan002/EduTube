package com.example.edutube;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ms.square.android.expandabletextview.ExpandableTextView;


public class cpp_document_fragment extends Fragment {

    ExpandableTextView expandableTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_cpp_document_fragment, container, false);

       expandableTextView = v.findViewById(R.id.expand_text_view);
       expandableTextView.setText(getString(R.string.stringcpp01));


       return v;
    }
}