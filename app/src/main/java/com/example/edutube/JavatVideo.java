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

public class JavatVideo extends AppCompatActivity {

    String topictextjaex[] = {"Java Programming", "Java Tutorials For Beginners", "Java For Placement", "Free Java Course", "Zero To hero in Java", "Java Tutorials", "Learn Java From Scratch", "Core Java", "Java Tutorials"};
    String detailsjaex[] = {"Neso Academy", "ProgKnowledge", "Apna College", "Code With Harry", "Kunal Kushwaha", "Codeitup", "Naveen", "Learn Code With Durgesh", "Bro Code",};
    int img[] = {R.drawable.j1,R.drawable.j2,R.drawable.j3,R.drawable.j4,R.drawable.j5,R.drawable.j6,R.drawable.j7,R.drawable.j8,R.drawable.j9};

    ListView listViewjaex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javat_video);

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

                    gotoUrl("https://youtube.com/playlist?list=PLBlnK6fEyqRjKA_NuK9mHmlk0dZzuP1P5");
                }
                else if(position == 1){

                    gotoUrl("https://youtube.com/playlist?list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al");

                }
                else if(position == 2){

                    gotoUrl("https://youtube.com/playlist?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop");

                }
                else if(position == 3){

                    gotoUrl("https://youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");

                }
                else if(position == 4){

                    gotoUrl("https://youtube.com/playlist?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ");
                }
                else if(position == 5){

                    gotoUrl("https://youtube.com/playlist?list=PLmRclvVt5DtnqhXTJwd-oqVRwO3bLZCGV");

                }
                else if(position == 6){

                    gotoUrl("https://youtube.com/playlist?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx");

                }
                else if(position == 7){

                    gotoUrl("https://youtube.com/playlist?list=PL0zysOflRCekkNEe4FDmdUN3FATodg3Yf");

                }

                else if(position == 7){

                    gotoUrl("https://youtube.com/playlist?list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1");

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