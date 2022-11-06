package com.example.edutube;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Python_page extends AppCompatActivity {



    BottomNavigationView bottomNavigationView;

    python_video_fragement python_video_fragement = new python_video_fragement();
    pyhton_document_fragment pyhton_document_fragment = new pyhton_document_fragment();
    python_exsercise_fragment python_exsercise_fragment = new python_exsercise_fragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_page);


        //To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));



        bottomNavigationView = findViewById(R.id.bottom_navigation);

      getSupportFragmentManager().beginTransaction().replace(R.id.Cont,python_video_fragement).commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()){

                    case R.id.video:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Cont,python_video_fragement).commit();
                        return true;


                    case R.id.document:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Cont,pyhton_document_fragment).commit();
                        return true;

                    case R.id.excercise:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Cont,python_exsercise_fragment).commit();
                        return true;
                }

                return false;
            }
        });
    }
}