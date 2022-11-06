package com.example.edutube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PythontVideo extends AppCompatActivity {

    String topictextjaex[] = {"Python Full Course", "Complete Roadmap To Python", "Complete Python Course", "Introduction To Python", "Python for Beginners", "Python Journey", "Python with Aman D", "Python Full course", "Python Course"};
    String detailsjaex[] = {"Telusko", "Krish Naik", "Harshit", "WsCube tech", "Sundeep", "Programiz", "Apni Kaksha", "CodeWithMosh", "Code With Harry"};
    int img[] = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9};

    ListView listViewjaex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythont_video);

        //To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        listViewjaex = findViewById(R.id.listviewjaex);

        MyjavaAdapterjava myjavaAdapter = new MyjavaAdapterjava();
        listViewjaex.setAdapter(myjavaAdapter);


        listViewjaex.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){

                    gotoUrl("https://youtube.com/playlist?list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3");
                }
                else if(position == 1){

                    gotoUrl("https://youtube.com/playlist?list=PLZoTAELRMXVNUL99R4bDlVYsncUNvwUBB");

                }
                else if(position == 2){

                    gotoUrl("https://youtube.com/playlist?list=PLwgFb6VsUj_lQTpQKDtLXKXElQychT_2j");

                }
                else if(position == 3){

                    gotoUrl("https://youtube.com/playlist?list=PLjVLYmrlmjGcQfNj_SLlLV4Ytf39f8BF7");

                }
                else if(position == 4){

                    gotoUrl("https://youtube.com/playlist?list=PLLOxZwkBK52DmuHRO3UNpqAzDF57FtIxk");
                }
                else if(position == 5){

                    gotoUrl("https://youtube.com/playlist?list=PL98qAXLA6afuh50qD2MdAj3ofYjZR_Phn");

                }
                else if(position == 6){

                    gotoUrl("https://youtube.com/playlist?list=PLKKfKV1b9e8r_GAb4BQNc2ZSh6S7NwK9W");

                }
                else if(position == 7){

                    gotoUrl("https://youtube.com/playlist?list=PLdo5W4Nhv31bZSiqiOL5ta39vSnBxpOPT");

                }

                else if(position == 7){

                    gotoUrl("https://youtube.com/playlist?list=PLu0W_9lII9agICnT8t4iYVSZ3eykIAOME");

                }
            }
        });
    }



    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


    public class MyjavaAdapterjava extends BaseAdapter {
        @Override
        public int getCount() {
            return topictextjaex.length;
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
            convertView = getLayoutInflater().inflate(R.layout.cardviwer_video, parent, false);
            TextView topicja = convertView.findViewById(R.id.topictextzz);
            TextView detailsja = convertView.findViewById(R.id.visibletextzz);
            ImageView playlistimage = convertView.findViewById(R.id.playlistImage);

            topicja.setText(topictextjaex[position]);
            detailsja.setText(detailsjaex[position]);
            playlistimage.setImageResource(img[position]);
            return convertView;
        }
    }
}