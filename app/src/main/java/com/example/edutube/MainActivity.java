package com.example.edutube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button loginbutton;
ImageView sign_in;
DBHelper DB;
TextView username;
TextView password;
TextView incorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        DB = new DBHelper(this);
        username = findViewById(R.id.username);
        password  = findViewById(R.id.password);
        incorrect  = findViewById(R.id.incorrect);

        loginbutton  = findViewById(R.id.B1);
               loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              String name = username.getText().toString();

                Cursor res = DB.getdata();


                    while (res.moveToNext()) {
                        String dataname = res.getString(0);

                        if (name.equals(dataname)) {
                            Intent intent = new Intent(MainActivity.this, Explore.class);
                            startActivity(intent);
                        }
                        else {
                            incorrect.setTextColor(Color.RED);
                            incorrect.setText("Incorrect Username or Password");
                        }
                    }
            }
        });

        sign_in = findViewById(R.id.sign_on_google);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentd = new Intent(MainActivity.this,Database.class);
                startActivity(intentd);
                Toast.makeText(MainActivity.this, "redirecting to myaccount.google.com", Toast.LENGTH_SHORT).show();
            }
        });
    }
}