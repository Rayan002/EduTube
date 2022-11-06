package com.example.edutube;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Custom_list_viewadapter extends BaseAdapter {

    Context context;
    String[] topictext;
    String[] details;
    LayoutInflater inflater;

    public Custom_list_viewadapter(Context ctx ,String[] topictext,String[] details){

        this.context = ctx;
        this.topictext = topictext;
        this.details = details;
        inflater = LayoutInflater.from(ctx);



    }

    @Override
    public int getCount() {
        return topictext.length;
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
        convertView =inflater.inflate( R.layout.activity_custom_listview,null);
        TextView topictextz = (TextView) convertView.findViewById(R.id.topictext);
        TextView detailsz =(TextView) convertView.findViewById(R.id.visibletext);
        topictextz.setText(topictext[position]);
        detailsz.setText(details[position]);
        return convertView;
    }
}
