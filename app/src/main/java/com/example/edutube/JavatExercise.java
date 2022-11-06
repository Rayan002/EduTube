package com.example.edutube;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class JavatExercise extends AppCompatActivity {

    String topictextjaex[] = {"Write a method that sums two numbers.", "Write a method that calculates the factorial of a given number.", "Write a method that reverses a string.", "Write a method that returns the largest integer in the list.", "Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.", "Write a method that checks if a number is a prime number.", "Write a method that returns the nth element of the Fibonacci Sequence", "Write a method that returns the average of a list of integers.8"};
    String detailsjaex[] = {" public Integer sum(Integer i, Integer j) \n{return i +  j};", "public Integer factorial(Integer n) \n{int factorial = n;\n" +
            "for (int j = n - 1; j > 0; j--) {\n" +
            "    factorial = factorial * j;\n" +
            "}\n" +
            "return factorial;}", "public String reverse(String s) \n{String result = \"\";\n" +
            "for (int i = 0; i < s.length(); i++) {\n" +
            "    result += s.charAt(s.length() - i - 1);\n" +
            "}\n" +
            "return result;}", "public Integer maximum(Integer[] list) \n{ int maximum = list[0];\n" +
            "for (int i : list) {\n" +
            "    if (i > maximum) {\n" +
            "        maximum = i;\n" +
            "    }\n" +
            "}\n" +
            "return maximum;", "public String fizzBuzz(Integer i) \n{String result = \"\";\n" +
            "if (i % 3 == 0) {\n" +
            "    result += \"Fizz\";\n" +
            "}\n" +
            "if (i % 5 == 0) {\n" +
            "    result += \"Buzz\";\n" +
            "}\n" +
            "if (result.equals(\"\")) {\n" +
            "    result = i.toString();\n" +
            "}\n" +
            "return result;}", "public Boolean isPrime(Integer n) \n{boolean isPrime = true;\n" +
            " for (int i = n - 1; i > 1; i--) {\n" +
            "     if (n % i == 0) {\n" +
            "         isPrime = false;\n" +
            "         break;\n" +
            "     }\n" +
            " }\n" +
            " return isPrime;}", "public Integer fibonacci(Integer n) \n{if (n == 1) {\n" +
            "    return 1;\n" +
            "} else if (n == 0) {\n" +
            "    return 0;\n" +
            "} else {\n" +
            "    return fibonacci(n - 1) + fibonacci(n - 2);\n" +
            "}", "public Double average(List<Integer> list) \n{return list.stream()\n" +
            "  .mapToInt(i -> i)\n" +
            "  .average()\n" +
            "  .getAsDouble();}"};
    ListView listViewjaex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javat_exercise);

        //To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        listViewjaex = findViewById(R.id.listviewjaex);

        JavatExercise.MyjavaAdapterjava myjavaAdapter = new MyjavaAdapterjava();
        listViewjaex.setAdapter(myjavaAdapter);

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
            convertView = getLayoutInflater().inflate(R.layout.cardviewer02, parent, false);
            TextView topicja = convertView.findViewById(R.id.topictextzz);
            TextView detailsja = convertView.findViewById(R.id.visibletextzz);


            detailsja.setVisibility(GONE);

            topicja.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(detailsja.getVisibility() == GONE){
                        detailsja.setVisibility(View.VISIBLE);
                    }
                    else if(detailsja.getVisibility() == VISIBLE){
                        detailsja.setVisibility(GONE);
                    }
                }
            });

            topicja.setText(topictextjaex[position]);
            detailsja.setText(detailsjaex[position]);
            return convertView;

        }
    }

}