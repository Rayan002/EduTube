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

public class CtExercise extends AppCompatActivity {

    String topictextjaex[] = {"Hello World Program in C Language", "Basic ifelse condition program\n", "input of various datatypes in C", "Switch Case Statement in C Language", "for Loop Program", "while Loop Program", "do while Loop Program", "find Factorial of a Number in C\n", "Program to print the Fibonacci Series"};
    String detailsjaex[] = {"//this is a comment\n" +
            "#include <stdio.h>    //including header file in our program\n" +
            "\n" +
            "int main()            //main() where the execution begins\n" +
            "{\n" +
            "    printf(\"Hello World\");\n" +
            "    return 0;\n" +
            "}", "#include<stdio.h>\n" +
            "\n" +
            "int main()\n" +
            "{\n" +
            "    printf(\"\\n\\n\\t\\tStudytonight - Best place to learn\\n\\n\\n\");\n" +
            "\n" +
            "    int number;\n" +
            "    printf(\"Please enter a number:\\n\");\n" +
            "    scanf(\"%d\",&number);\n" +
            "    /*\n" +
            "        For single statements we can skip the curly brackets\n" +
            "    */\n" +
            "    if(number < 100)\n" +
            "        printf(\"Number is less than 100!\\n\");\n" +
            "    else if(number == 100)\n" +
            "        printf(\"Number is 100!\\n\");\n" +
            "    else\n" +
            "        printf(\"Number is greater than 100!\\n\");\n" +
            "\n" +
            "    printf(\"\\n\\n\\t\\t\\tCoding is Fun !\\n\\n\\n\");\n" +
            "    \n" +
            "    return 0;\n" +
            "}", "#include<stdio.h>\n" +
            "\n" +
            "int main()\n" +
            "{\n" +
            "    printf(\"\\n\\n\\t\\tStudytonight - Best place to learn\\n\\n\\n\");\n" +
            "\n" +
            "    int num1, num2;  \n" +
            "    float fraction;     \n" +
            "    char character;\n" +
            "\n" +
            "    printf(\"Enter two numbers number\\n\");\n" +
            "    \n" +
            "    // Taking integer as input from user\n" +
            "    scanf(\"%d%i\", &num1, &num2);\n" +
            "    printf(\"\\n\\nThe two numbers You have entered are %d and %i\\n\\n\", num1, num2);\n" +
            "\n" +
            "    // Taking float or fraction as input from the user\n" +
            "    printf(\"\\n\\nEnter a Decimal number\\n\");\n" +
            "    scanf(\"%f\", &fraction); \n" +
            "    printf(\"\\n\\nThe float or fraction that you have entered is %f\", fraction);\n" +
            "\n" +
            "    // Taking Character as input from the user\n" +
            "    printf(\"\\n\\nEnter a Character\\n\");\n" +
            "    scanf(\"%c\",&character);\n" +
            "    printf(\"\\n\\nThe character that you have entered is %c\", character);\n" +
            "\n" +
            "    printf(\"\\n\\n\\t\\t\\tCoding is Fun !\\n\\n\\n\");\n" +
            "    \n" +
            "    return 0;\n" +
            "}", "switch(expression)\n" +
            "{    \n" +
            "    case value1:    \n" +
            "        statement_1; \n" +
            "        break;\n" +
            "    case value2:    \n" +
            "        statement_2; \n" +
            "        break;\n" +
            "    //we can have as many cases as we want\n" +
            "    case value_n:   \n" +
            "        statement_n; \n" +
            "        break;\n" +
            "    default:         \n" +
            "        default statement;    //this is not necessary. It is used only for convenience\n" +
            "} ", "#include<stdio.h>\n" +
            "\n" +
            "int main()\n" +
            "{\n" +
            "    printf(\"\\n\\n\\t\\tStudytonight - Best place to learn\\n\\n\\n\");\n" +
            "\n" +
            "    /* \n" +
            "        Always declare the variables before using them \n" +
            "    */\n" +
            "    int i = 0;  // declaration and initialization at the same time\n" +
            "\n" +
            "\n" +
            "    for(i = 0; i < 10; i++)\n" +
            "    {\n" +
            "        printf(\"i = %d\\n\", i);\n" +
            "\n" +
            "        /*\n" +
            "            consequently, when i equals 10, the loop breaks.\n" +
            "            i is updated before the condition is checked-\n" +
            "            hence the value of i after exiting the loop is 10 \n" +
            "        */\n" +
            "     }\n" +
            "\n" +
            "    printf(\"\\n\\The value of i after exiting the loop is %d\\n\\n\", i);\n" +
            "    \n" +
            "    printf(\"\\nRemember that the loop condition checks the conditional statement before it loops again.\\n\\n\");\n" +
            "    \n" +
            "    printf(\"Consequently, when i equals 10, the loop breaks.\\n\\n\");\n" +
            "    \n" +
            "    printf(\"i is updated before the condition is checked- hence the value of i after exiting the loop is 10 .\\n\\n\");\n" +
            "    \n" +
            "    printf(\"\\n\\n\\t\\t\\tCoding is Fun !\\n\\n\\n\");\n" +
            "    return 0;\n" +
            "}", "#include<stdio.h>\n" +
            "\n" +
            "int main()\n" +
            "{\n" +
            "    printf(\"\\n\\n\\t\\tStudytonight - Best place to learn\\n\\n\\n\");\n" +
            "\n" +
            "    /* \n" +
            "        always declare the variables before using them \n" +
            "    */\n" +
            "    int i = 0;  // declaration and initialization at the same time\n" +
            "\n" +
            "    printf(\"\\nPrinting numbers using while loop from 0 to 9\\n\\n\");\n" +
            "\n" +
            "    /* \n" +
            "        while i is less than 10 \n" +
            "    */\n" +
            "    while(i<10)\n" +
            "    {\n" +
            "        printf(\"%d\\n\",i);\n" +
            "\n" +
            "        /* \n" +
            "            Update i so the condition can be met eventually \n" +
            "            to terminate the loop \n" +
            "        */\n" +
            "        i++;    // same as i=i+1;\n" +
            "      }\n" +
            "    printf(\"\\n\\n\\t\\t\\tCoding is Fun !\\n\\n\\n\");\n" +
            "    return 0;\n" +
            "}", "#include<stdio.h>\n" +
            "\n" +
            "int main()\n" +
            "{\n" +
            "    printf(\"\\n\\n\\t\\tStudytonight - Best place to learn\\n\\n\\n\");\n" +
            "\n" +
            "    /* \n" +
            "        always declare the variables before using them \n" +
            "    */\n" +
            "    int i = 10;     // declaration and initialization at the same time\n" +
            "\n" +
            "    do // do contains the actual code and the updation\n" +
            "    {\n" +
            "        printf(\"i = %d\\n\",i);\n" +
            "        i = i-1;    // updation\n" +
            "    }\n" +
            "    // while loop doesn't contain any code but just the condition\n" +
            "    while(i > 0);\n" +
            "    \n" +
            "    printf(\"\\n\\The value of i after exiting the loop is %d\\n\\n\", i);\n" +
            "    printf(\"\\n\\n\\t\\t\\tCoding is Fun !\\n\\n\\n\");\n" +
            "    return 0;\n" +
            "}", "#include<stdio.h>\n" +
            "void main()\n" +
            "{\n" +
            "   int i, n;\n" +
            "   long int fact = 1;\n" +
            "   printf(\"Enter the number: \");\n" +
            "   scanf(\"%d\" , &n);\n" +
            "   for(i = 1; i <= n; i++)\n" +
            "   {\n" +
            "       fact = fact * i;\n" +
            "   }\n" +
            "   printf(\"Factorial of %d is %ld\", n , fact);\n" +
            "}", "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "\n" +
            "void fibonacci(int num);\n" +
            "void main()\n" +
            "{\n" +
            "    int num = 0;\n" +
            "    clrscr();\n" +
            "    printf(\"Enter number of terms\\t\");\n" +
            "    scanf(\"%d\", &num);\n" +
            "    fibonacci(num);\n" +
            "    getch();\n" +
            "}\n" +
            "\n" +
            "void fibonacci(int num)\n" +
            "{\n" +
            "   int a, b, c, i = 3;\n" +
            "   a = 0;\n" +
            "   b = 1;\n" +
            "   if(num == 1)\n" +
            "   printf(\"%d\",a);\n" +
            "\n" +
            "   if(num >= 2)\n" +
            "   printf(\"%d\\t%d\",a,b);\n" +
            "\n" +
            "   while(i <= num)\n" +
            "   {\n" +
            "      c = a+b;\n" +
            "      printf(\"\\t%d\", c);\n" +
            "      a = b;\n" +
            "      b = c;\n" +
            "      i++;\n" +
            "   }\n" +
            "}"};
    ListView listViewjaex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ct_exercise);

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