package com.example.edutube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class Custom_listview extends AppCompatActivity {

    TextView topictext;
    TextView visibletext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);

        topictext = findViewById(R.id.topictext);
        visibletext = findViewById(R.id.visibletext);


        topictext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(visibletext.getVisibility() == View.GONE){
                    visibletext.setVisibility(View.VISIBLE);
                }

                else if(visibletext.getVisibility() == View.VISIBLE){
                    visibletext.setVisibility(View.GONE);
                }

            }
        });
    }
}