package com.example.edutube;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CtDoc extends AppCompatActivity {

    String topictextjaex[] = {"C Comments", "C Variables", "C Data Types", "C Constants", "C Operators", "C If ... Else", "C While Loop", "C For Loop", "C Break and Continue\n"};
    String detailsjaex[] = {"Comments in C\n" +
            "Comments can be used to explain code, and to make it more readable. It can also be used to prevent execution when testing alternative code.\n" +
            "\n" +
            "Comments can be singled-lined or multi-lined.\n" +
            "\n" +
            "Single-line Comments\n" +
            "Single-line comments start with two forward slashes (//).\n" +
            "\n" +
            "Any text between // and the end of the line is ignored by the compiler (will not be executed).\n" +
            "\n" +
            "This example uses a single-line comment before a line of code:\n" +
            "\n" +
            "Example\n" +
            "// This is a comment\n" +
            "printf(\"Hello World!\");", "Variables are containers for storing data values.\n" +
            "\n" +
            "In C, there are different types of variables (defined with different keywords), for example:\n" +
            "\n" +
            "int - stores integers (whole numbers), without decimals, such as 123 or -123\n" +
            "float - stores floating point numbers, with decimals, such as 19.99 or -19.99\n" +
            "char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes\n" +
            "Declaring (Creating) Variables\n" +
            "To create a variable, specify the type and assign it a value:\n" +
            "\n" +
            "Syntax\n" +
            "type variableName = value;", "Data Types\n" +
            "As explained in the Variables chapter, a variable in C must be a specified data type, and you must use a format specifier inside the printf() function to display it:\n" +
            "\n" +
            "Example\n" +
            "// Create variables\n" +
            "int myNum = 5;             // Integer (whole number)\n" +
            "float myFloatNum = 5.99;   // Floating point number\n" +
            "char myLetter = 'D';       // Character\n" +
            "\n" +
            "// Print variables\n" +
            "printf(\"%d\\n\", myNum);\n" +
            "printf(\"%f\\n\", myFloatNum);\n" +
            "printf(\"%c\\n\", myLetter);\n", "C Constants\n" +
            "Constants\n" +
            "When you don't want others (or yourself) to override existing variable values, use the const keyword (this will declare the variable as \"constant\", which means unchangeable and read-only):\n" +
            "\n" +
            "Example\n" +
            "const int myNum = 15;  // myNum will always be 15\n" +
            "myNum = 10;  // error: assignment of read-only variable 'myNum'", "Operators\n" +
            "Operators are used to perform operations on variables and values.\n" +
            "\n" +
            "In the example below, we use the + operator to add together two values:\n" +
            "\n" +
            "Example\n" +
            "int myNum = 100 + 50;\n" +
            "Although the + operator is often used to add together two values, like in the example above, it can also be used to add together a variable and a value, or a variable and another variable:\n" +
            "\n" +
            "Example\n" +
            "int sum1 = 100 + 50;        // 150 (100 + 50)\n" +
            "int sum2 = sum1 + 250;      // 400 (150 + 250)\n" +
            "int sum3 = sum2 + sum2;     // 800 (400 + 400)", "Conditions and If Statements\n" +
            "You learned from the operators comparison chapter, that C supports the usual logical conditions from mathematics:\n" +
            "\n" +
            "Less than: a < b\n" +
            "Less than or equal to: a <= b\n" +
            "Greater than: a > b\n" +
            "Greater than or equal to: a >= b\n" +
            "Equal to a == b\n" +
            "Not Equal to: a != b\n" +
            "You can use these conditions to perform different actions for different decisions.\n" +
            "\n" +
            "C has the following conditional statements:\n" +
            "\n" +
            "Use if to specify a block of code to be executed, if a specified condition is true\n" +
            "Use else to specify a block of code to be executed, if the same condition is false\n" +
            "Use else if to specify a new condition to test, if the first condition is false\n" +
            "Use switch to specify many alternative blocks of code to be executed\n" +
            "The if Statement\n" +
            "Use the if statement to specify a block of C code to be executed if a condition is true.\n" +
            "\n" +
            "Syntax\n" +
            "if (condition) {\n" +
            "  // block of code to be executed if the condition is true\n" +
            "}", "Loops\n" +
            "Loops can execute a block of code as long as a specified condition is reached.\n" +
            "\n" +
            "Loops are handy because they save time, reduce errors, and they make code more readable.\n" +
            "\n" +
            "While Loop\n" +
            "The while loop loops through a block of code as long as a specified condition is true:\n" +
            "\n" +
            "Syntax\n" +
            "while (condition) {\n" +
            "  // code block to be executed\n" +
            "}\n" +
            "In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5:\n" +
            "\n" +
            "Example\n" +
            "int i = 0;\n" +
            "\n" +
            "while (i < 5) {\n" +
            "  printf(\"%d\\n\", i);\n" +
            "  i++;\n" +
            "}", "For Loop\n" +
            "When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:\n" +
            "\n" +
            "Syntax\n" +
            "for (statement 1; statement 2; statement 3) {\n" +
            "  // code block to be executed\n" +
            "}\n" +
            "Statement 1 is executed (one time) before the execution of the code block.\n" +
            "\n" +
            "Statement 2 defines the condition for executing the code block.\n" +
            "\n" +
            "Statement 3 is executed (every time) after the code block has been executed.\n" +
            "\n" +
            "The example below will print the numbers 0 to 4:\n" +
            "\n" +
            "Example\n" +
            "int i;\n" +
            "\n" +
            "for (i = 0; i < 5; i++) {\n" +
            "  printf(\"%d\\n\", i);\n" +
            "}", "Break\n" +
            "You have already seen the break statement used in an earlier chapter of this tutorial. It was used to \"jump out\" of a switch statement.\n" +
            "\n" +
            "The break statement can also be used to jump out of a loop.\n" +
            "\n" +
            "This example jumps out of the loop when i is equal to 4:\n" +
            "\n" +
            "Example\n" +
            "int i;\n" +
            "\n" +
            "for (i = 0; i < 10; i++) {\n" +
            "  if (i == 4) {\n" +
            "    break;\n" +
            "  }\n" +
            "  printf(\"%d\\n\", i);\n" +
            "}\n",};
    ListView listViewjaex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ct_doc);

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
            convertView = getLayoutInflater().inflate(R.layout.cardviewer01, parent, false);
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
