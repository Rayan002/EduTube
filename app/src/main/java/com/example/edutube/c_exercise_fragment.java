package com.example.edutube;

import android.os.Bundle;

import androidx.annotation.ContentView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class c_exercise_fragment extends Fragment {

    ListView listview;

    String topics[] ={"hello1","hello2","hello3","hello4","hello5"};
    String details[] ={"details of hello1","details of hello2","details of hello3","details of hello4","details of hello5"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v1 =  inflater.inflate(R.layout.fragment_c_exercise_fragment, container, false);

        listview = (ListView) v1.findViewById(R.id.customlistview);
        Custom_list_viewadapter custom_list_viewadapter = new Custom_list_viewadapter(getActivity().getApplicationContext(), topics,details);
        listview.setAdapter(custom_list_viewadapter);
        return v1;
    }
}