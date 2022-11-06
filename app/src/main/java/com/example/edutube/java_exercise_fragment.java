package com.example.edutube;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class java_exercise_fragment extends Fragment {

    String topictextjaex []={"top-01","top-02","top-03","top-04","top-05","top-06","top-07","top-08","top-09"};
    String detailsjaex[] ={"detaildata01","detaildata02","detaildata03","detaildata04","detaildata05","detaildata06","detaildata07","detaildata08","detaildata09",};
    ListView listViewjaex;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vjaex = inflater.inflate(R.layout.fragment_java_exercise_fragment, container, false);
        listViewjaex = vjaex.findViewById(R.id.listviewcppex);

        MyjavaAdapter myjavaAdapter = new MyjavaAdapter();
        listViewjaex.setAdapter(myjavaAdapter);


        return vjaex;
    }

    public class MyjavaAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return topictextjaex.length ;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView =  getLayoutInflater().inflate(R.layout.cardviewer01,parent,false);
            TextView topicja = convertView.findViewById(R.id.topictextzz);
            TextView detailsja = convertView.findViewById(R.id.visibletextzz);

            topicja.setText(topictextjaex[position]);
            detailsja.setText(detailsjaex[position]);

            return convertView;
        }
    }


}