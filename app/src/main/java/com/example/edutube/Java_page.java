package com.example.edutube;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Java_page extends AppCompatActivity {


    BottomNavigationView bottomNavigationViewjava;

    java_video_fragment java_video_fragment = new java_video_fragment();
    java_document_fragment java_document_fragment = new java_document_fragment();
    java_exercise_fragment java_exercise_fragment = new java_exercise_fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_page);


        //To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        bottomNavigationViewjava = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.Contjava,java_video_fragment).commit();

        bottomNavigationViewjava.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {

                switch (item.getItemId()){

                    case R.id.video:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Contjava,java_video_fragment).commit();
                        return true;

                    case R.id.document:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Contjava,java_document_fragment).commit();
                        return true;

                    case R.id.excercise:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Contjava,java_exercise_fragment).commit();
                        return true;
                }
                return false;
            }
        });


    }

}