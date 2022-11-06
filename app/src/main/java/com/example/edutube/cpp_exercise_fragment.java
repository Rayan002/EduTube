package com.example.edutube;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class cpp_exercise_fragment extends Fragment {

    String topics[] ={"hello1","hello2","hello3","hello4","hello5"};
    String details[] ={"details of hello1","details of hello2","details of hello3","details of hello4","details of hello5"};
    ListView listviewcppex;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View vcpp = inflater.inflate(R.layout.fragment_cpp_exercise_fragment, container, false);

        listviewcppex = vcpp.findViewById(R.id.listviewcppex);

        MyAdapter adapter = new MyAdapter();
        listviewcppex.setAdapter(adapter);

        return vcpp;
    }


    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return topics.length;
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
            convertView = getLayoutInflater().inflate(R.layout.cardviewer,parent,false);
            TextView topicsz = convertView.findViewById(R.id.topictext);
            TextView detailsz = convertView.findViewById(R.id.visibletext);

            topicsz.setText(topics[position]);
            detailsz.setText(details[position]);
            return convertView;
        }
    }
}