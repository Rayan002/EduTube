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

public class CpptDoc extends AppCompatActivity {

    String topictextjaex[] = {"C++ Comments", "C++ Variables", "C++ User Input", "C++ Data Types", "C++ Operators", "C++ If ... Else", "C++ Switch", "C++ While Loop", "C++ For Loop"};
    String detailsjaex[] = {"C++ Comments\n" +
            "Comments can be used to explain C++ code, and to make it more readable. It can also be used to prevent execution when testing alternative code. Comments can be singled-lined or multi-lined.\n" +
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
            "cout << \"Hello World!\";", "C++ Variables\n" +
            "Variables are containers for storing data values.\n" +
            "\n" +
            "In C++, there are different types of variables (defined with different keywords), for example:\n" +
            "\n" +
            "int - stores integers (whole numbers), without decimals, such as 123 or -123\n" +
            "double - stores floating point numbers, with decimals, such as 19.99 or -19.99\n" +
            "char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes\n" +
            "string - stores text, such as \"Hello World\". String values are surrounded by double quotes\n" +
            "bool - stores values with two states: true or false\n" +
            "Declaring (Creating) Variables\n" +
            "To create a variable, specify the type and assign it a value:\n" +
            "\n" +
            "Syntax\n" +
            "type variableName = value;", "C++ User Input\n" +
            "You have already learned that cout is used to output (print) values. Now we will use cin to get user input.\n" +
            "\n" +
            "cin is a predefined variable that reads data from the keyboard with the extraction operator (>>).\n" +
            "\n" +
            "In the following example, the user can input a number, which is stored in the variable x. Then we print the value of x:\n" +
            "\n" +
            "Example\n" +
            "int x; \n" +
            "cout << \"Type a number: \"; // Type a number and press enter\n" +
            "cin >> x; // Get user input from the keyboard\n" +
            "cout << \"Your number is: \" << x; // Display the input value\n", "C++ Data Types\n" +
            "As explained in the Variables chapter, a variable in C++ must be a specified data type:\n" +
            "\n" +
            "Example\n" +
            "int myNum = 5;               // Integer (whole number)\n" +
            "float myFloatNum = 5.99;     // Floating point number\n" +
            "double myDoubleNum = 9.98;   // Floating point number\n" +
            "char myLetter = 'D';         // Character\n" +
            "bool myBoolean = true;       // Boolean\n" +
            "string myText = \"Hello\";     // String\n", "C++ Operators\n" +
            "Operators are used to perform operations on variables and values.\n" +
            "\n" +
            "In the example below, we use the + operator to add together two values:\n" +
            "\n" +
            "Example\n" +
            "int x = 100 + 50;", "C++ Conditions and If Statements\n" +
            "C++ supports the usual logical conditions from mathematics:\n" +
            "\n" +
            "Less than: a < b\n" +
            "Less than or equal to: a <= b\n" +
            "Greater than: a > b\n" +
            "Greater than or equal to: a >= b\n" +
            "Equal to a == b\n" +
            "Not Equal to: a != b\n" +
            "You can use these conditions to perform different actions for different decisions.\n" +
            "\n" +
            "C++ has the following conditional statements:\n" +
            "\n" +
            "Use if to specify a block of code to be executed, if a specified condition is true\n" +
            "Use else to specify a block of code to be executed, if the same condition is false\n" +
            "Use else if to specify a new condition to test, if the first condition is false\n" +
            "Use switch to specify many alternative blocks of code to be executed\n" +
            "The if Statement\n" +
            "Use the if statement to specify a block of C++ code to be executed if a condition is true.\n" +
            "\n" +
            "Syntax\n" +
            "if (condition) {\n" +
            "  // block of code to be executed if the condition is true\n" +
            "}", "C++ Switch Statements\n" +
            "Use the switch statement to select one of many code blocks to be executed.\n" +
            "\n" +
            "Syntax\n" +
            "switch(expression) {\n" +
            "  case x:\n" +
            "    // code block\n" +
            "    break;\n" +
            "  case y:\n" +
            "    // code block\n" +
            "    break;\n" +
            "  default:\n" +
            "    // code block\n" +
            "}", "C++ Loops\n" +
            "Loops can execute a block of code as long as a specified condition is reached.\n" +
            "\n" +
            "Loops are handy because they save time, reduce errors, and they make code more readable.\n" +
            "\n" +
            "C++ While Loop\n" +
            "The while loop loops through a block of code as long as a specified condition is true:\n" +
            "\n" +
            "Syntax\n" +
            "while (condition) {\n" +
            "  // code block to be executed\n" +
            "}", "C++ For Loop\n" +
            "When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:\n" +
            "\n" +
            "Syntax\n" +
            "for (statement 1; statement 2; statement 3) {\n" +
            "  // code block to be executed\n" +
            "}"};
    ListView listViewjaex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cppt_doc);
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