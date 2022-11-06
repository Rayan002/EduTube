package com.example.edutube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Python_type extends AppCompatActivity {

    ImageButton video_java;
    ImageButton doc_java;
    ImageButton excerise_java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_type);

        //To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        video_java = findViewById(R.id.video_01);
        doc_java = findViewById(R.id.doc01);
        excerise_java = findViewById(R.id.excerise01);

        video_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent java_to_video = new Intent (Python_type.this,PythontVideo.class);
                startActivity(java_to_video);
            }
        });

        doc_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent java_to_doc = new Intent (Python_type.this,PythontDoc.class);
                startActivity(java_to_doc);
            }
        });

        excerise_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent java_to_doc = new Intent (Python_type.this,PythontExercise.class);
                startActivity(java_to_doc);
            }
        });

    }
}