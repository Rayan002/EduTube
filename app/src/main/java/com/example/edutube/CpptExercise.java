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

public class CpptExercise extends AppCompatActivity {

    String topictextjaex[] = {" print “Hello World!” in C++", "add two variables in CPP", "Find the maximum number in an array of Integers.", "Try to swap two numbers with a third variable.", "Can you now swap two numbers without a third variable?", " check whether a number is prime or not", "Write a program to find the reverse of a number.", "Now when you know to reverse a number, can you try to check whether a number is a palindrome or not?", "Find the factorial of a number."};
    String detailsjaex[] = {"#include<iostream.h>\n" +
            "using namespace std;\n" +
            "int main() {\n" +
            "    cout<<\"Hello World!\";\n" +
            "    return 0;\n" +
            "}\n" +
            "Output: Hello World", "#include<iostream.h> \n" +
            "using namespace std;\n" +
            "int main() {\n" +
            "    int a = 2;\n" +
            "    int b = 6;\n" +
            "    cout<<a+b;\n" +
            "    return 0;\n" +
            "}\n" +
            "Output: 8", "#include <iostream.h>\n" +
            "using namespace std;\n" +
            "int main() {\n" +
            "    int arr[5] = { 1, 2, 5, 4, 3 };\n" +
            "    int max = 0;\n" +
            "    for(int i = 0;i<5;i++)\n" +
            "        {\n" +
            "            if(max < arr[i])\n" +
            "                max = arr[i];\n" +
            "        }\n" +
            "    cout<<max<<endl;\n" +
            "    return 0;\n" +
            "}\n" +
            "Output: 5", "#include<iostream.h> \n" +
            "using namespace std;\n" +
            "int main() {\n" +
            "    int number1 = 145;\n" +
            "    int number2 = 200;\n" +
            "    cout<<number1<<\" \"<<number2<<endl;\n" +
            "    int temp = number1;\n" +
            "    number1 = number2;\n" +
            "    number2 = temp;\n" +
            "    cout<<number1<<\" \"<<number2<<endl;\n" +
            "    return 0;\n" +
            "}", "#include<iostream.h> \n" +
            "using namespace std;\n" +
            "int main() {\n" +
            "    int number1 = 145;\n" +
            "    int number2 = 200;\n" +
            "    cout<<number1<<\" \"<<number2<<endl;\n" +
            "    number1 = number1 + number2;\n" +
            "    number2 = number1 - number2;\n" +
            "    number1 = number1 - number2;\n" +
            "    cout<<number1<<\" \"<<number2<<endl;\n" +
            "    return 0;\n" +
            "}\n" +
            "Output:  145 200\n" +
            "    200 145", "#include<iostream.h> \n" +
            "using namespace std;\n" +
            "int main() {\n" +
            "    int a = 23;\n" +
            "    int b = 2;\n" +
            "    //start from b as 1 can divide any number\n" +
            "    bool prime = true;\n" +
            "    while(b!=a){\n" +
            "        if(a%b == 0)\n" +
            "            {\n" +
            "                prime = false;\n" +
            "                break;\n" +
            "            }\n" +
            "        b++;\n" +
            "    }\n" +
            "    if(prime)\n" +
            "    cout<<\"prime\";\n" +
            "    else cout<<\"not prime\";\n" +
            "    return 0;\n" +
            "}\n" +
            "Output: prime", "#include<iostream.h> \n" +
            "using namespace std;\n" +
            "int main() {\n" +
            "    int a = 1223;\n" +
            "    int res = 0;\n" +
            "    while(a!=0){\n" +
            "        int dig = a%10;\n" +
            "        res = res*10 + dig;\n" +
            "        a =a/10;\n" +
            "    }\n" +
            "    cout<<res;\n" +
            "    return 0;\n" +
            "}\n" +
            "Output: 3221", "#include <iostream.h>\n" +
            "using namespace std;\n" +
            "int reverse(int a){\n" +
            "    int res = 0;\n" +
            "    while(a!=0){\n" +
            "        int dig = a%10;\n" +
            "        res = res*10 + dig;\n" +
            "        a =a/10;\n" +
            "    }\n" +
            "    return res;\n" +
            "}\n" +
            "int main() {\n" +
            "    int a = 1221;\n" +
            "    int b = reverse(a);\n" +
            "    if(a == b)\n" +
            "        cout<<\"Palindrome\";\n" +
            "    else\n" +
            "        cout<<\"Not palindrome\";\n" +
            "    return 0;\n" +
            "}\n" +
            "Output: Palindrome","#include <iostream.h>\n" +
            "using namespace std;\n" +
            "int factorial(int n){\n" +
            "    int res = 1;\n" +
            "    for(int i = 2;i<=n;i++)\n" +
            "        res = res*i;\n" +
            "    return res;\n" +
            "}\n" +
            "int main() {\n" +
            "    int a = 5;\n" +
            "    cout<<factorial(a)<<endl;\n" +
            "    return 0;\n" +
            "}\n" +
            "Output: 120"};
    ListView listViewjaex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cppt_exercise);
//To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        listViewjaex = findViewById(R.id.listviewjaex);

        MyjavaAdapterjava myjavaAdapter = new MyjavaAdapterjava();
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