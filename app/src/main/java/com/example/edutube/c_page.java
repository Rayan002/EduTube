package com.example.edutube;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class c_page extends AppCompatActivity {


    BottomNavigationView bottomNavigationViewc;

    c_video_fragment c_video_fragment = new c_video_fragment();
    c_document_fragment c_document_fragment = new c_document_fragment();
    c_exercise_fragment c_exercise_fragment = new c_exercise_fragment();
    c_document c_document = new c_document();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpage);

        //To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        bottomNavigationViewc = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.Contc,c_video_fragment).commit();

        bottomNavigationViewc.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.video:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Contc,c_video_fragment).commit();
                        return true;

                    case R.id.document:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.Contc,c_document_fragment).commit();
                        Intent intent = new Intent(getApplicationContext(), c_document.class);
                        startActivity(intent);

                        return true;

                    case R.id.excercise:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.Contc,c_exercise_fragment).commit();
                        Intent trailcode02 = new Intent(getApplicationContext(),trail_activity_01.class);
                        startActivity(trailcode02);
                        return true;
                }

                return false;
            }
        });

    }
}