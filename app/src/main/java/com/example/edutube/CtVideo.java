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

public class CtVideo extends AppCompatActivity {

    String topictextjaex[] = {"C-Programming", "Intro To C Programming", "C Programming Tutorial", "C Language Intro", "C Programming For Beginners", "C Language -part01", "Problem Solving In C","C Full Course"};
    String detailsjaex[] = {"NesoAcademay",    "Jenny's Lecture",        "Telusko",                 "Programiz",         "Naresh-I",       "Technical Education", "WsCube Tech", "Gabs Classes"};
    int img[] = {R.drawable.c2,R.drawable.c3,R.drawable.c6,R.drawable.c5,R.drawable.c4,R.drawable.c7,R.drawable.c8,R.drawable.c9};

    ListView listViewjaex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ct_video);


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

                   gotoUrl("https://youtube.com/playlist?list=PLBlnK6fEyqRggZZgYpPMUxdY1CYkZtARR");
                }
                else if(position == 1){

                    gotoUrl("https://youtube.com/playlist?list=PLdo5W4Nhv31a8UcMN9-35ghv8qyFWD9_S");

                }
                else if(position == 2){

                    gotoUrl("https://youtube.com/playlist?list=PLe_7x5eaUqtWp9fvsxhC4XIkoR3n5A-sF");

                }
                else if(position == 3){

                    gotoUrl("https://youtube.com/playlist?list=PLsyeobzWxl7oBxHp43xQTFrw9f1CDPR6C");

                }
                else if(position == 4){

                    gotoUrl("https://youtube.com/playlist?list=PL98qAXLA6aftD9ZlnjpLhdQAOFI8xIB6e");
                }
                else if(position == 5){

                    gotoUrl("https://youtube.com/playlist?list=PLe_7x5eaUqtWp9fvsxhC4XIkoR3n5A-sF");

                }
                else if(position == 6){

                    gotoUrl("https://youtube.com/playlist?list=PLjVLYmrlmjGcrFEK43__3yeeySU1N7vpW");

                }
                else if(position == 7){

                    gotoUrl("https://youtube.com/playlist?list=PL_aBYbH6j5ycI4EJqTEafbkFWQATyB9ty");

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