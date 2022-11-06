package com.example.edutube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

public class Explore extends AppCompatActivity {
    ImageButton pythonbutton;
    ImageButton javabutton;
    ImageButton cbutton;
    ImageButton cppbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        //To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        pythonbutton = findViewById(R.id.video_01);
        javabutton = findViewById(R.id.javabutton);
        cbutton = findViewById(R.id.cbutton);
        cppbutton = findViewById(R.id.cppbutton);

        pythonbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Explore.this, "python", Toast.LENGTH_SHORT).show();
                Intent python_to_activity = new Intent (Explore.this,Python_type.class);
                startActivity(python_to_activity);
            }
        });

        javabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Explore.this, "java", Toast.LENGTH_SHORT).show();
                Intent java_to_activity = new Intent (Explore.this,Java_type.class);
                startActivity(java_to_activity);
            }
        });

        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Explore.this, "c", Toast.LENGTH_SHORT).show();
                Intent c_to_activity = new Intent (Explore.this,C_type.class);
                startActivity(c_to_activity);
            }
        });

        cppbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Explore.this, "cpp", Toast.LENGTH_SHORT).show();
                Intent cpp_to_activity = new Intent (Explore.this,Cpp_type.class);
                startActivity(cpp_to_activity);
            }
        });

    }
}