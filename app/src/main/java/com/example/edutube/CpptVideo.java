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

public class CpptVideo extends AppCompatActivity {

    String topictextjaex[] = {"C++ for beginner", "C++ Tutorials", "Introduction to C++", "C++ for beginners", "C++ with OOPs", "C++ programming ", "Datastructure And Algorithm in C++", "C++ Toturals", "C++ for placement"};
    String detailsjaex[] = {"By the cherno", "CodeWithHarry", "LearningLad", "Jenny's Lecture", "unacademy", "NesoAcademy", "SimpleSnippets", "ProgKnowledge", "Apna College"};
    int img[] = {R.drawable.cpp1,R.drawable.cpp2,R.drawable.cpp3,R.drawable.cpp4,R.drawable.cpp5,R.drawable.cpp6,R.drawable.cpp7,R.drawable.cpp8,R.drawable.cpp9};

    ListView listViewjaex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cppt_video);

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

                    gotoUrl("https://youtube.com/playlist?list=PLlrATfBNZ98dudnM48yfGUldqGD0S4FFb");
                }
                else if(position == 1){

                    gotoUrl("https://youtube.com/playlist?list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL");

                }
                else if(position == 2){

                    gotoUrl("https://youtube.com/playlist?list=PLfVsf4Bjg79Cu5MYkyJ-u4SyQmMhFeC1C");

                }
                else if(position == 3){

                    gotoUrl("https://youtube.com/playlist?list=PLdo5W4Nhv31YU5Wx1dopka58teWP9aCee");

                }
                else if(position == 4){

                    gotoUrl("https://youtube.com/playlist?list=PLA8BpojmT5JF4KKQCEIqURc71z6nvYXEK");
                }
                else if(position == 5){

                    gotoUrl("https://youtube.com/playlist?list=PLBlnK6fEyqRh6isJ01MBnbNpV3ZsktSyS");

                }
                else if(position == 6){

                    gotoUrl("https://youtube.com/playlist?list=PLIY8eNdw5tW_zX3OCzX7NJ8bL1p6pWfgG");

                }
                else if(position == 7){

                    gotoUrl("https://youtube.com/playlist?list=PLS1QulWo1RIYSyC6w2-rDssprPrEsgtVK");

                }

                else if(position == 7){

                    gotoUrl("https://youtube.com/playlist?list=PLfqMhTWNBTe0b2nM6JHVCnAkhQRGiZMSJ");

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