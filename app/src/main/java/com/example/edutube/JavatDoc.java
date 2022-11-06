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

public class JavatDoc extends AppCompatActivity {


    String topictextjaex[] = {"\nJava Comments", "\nJava Variables", "\nJava Data Types", "\nJava Type Casting", "\nJava Operators", "\nJava Strings", "\nJava If ... Else", "\nJava Switch", "\nJava While Loop","\nJava For Loop"};
    String detailsjaex[] = {"Comments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code. " +
            "    Single-line Comments\n" +
            "Single-line comments start with two forward slashes (//).\n" +
            "\n" +
            "Any text between // and the end of the line is ignored by Java (will not be executed).\n" +
            "\n" +
            "This example uses a single-line comment before a line of code:\n" +
            "\n" +
            "Example\n" +
            "// This is a comment\n" +
            "System.out.println(\"Hello World\"); ", "Variables are containers for storing data values.\n" +
            "\n" +
            "In Java, there are different types of variables, for example:\n" +
            "\n" +
            "String - stores text, such as \"Hello\". String values are surrounded by double quotes\n" +
            "int - stores integers (whole numbers), without decimals, such as 123 or -123\n" +
            "float - stores floating point numbers, with decimals, such as 19.99 or -19.99\n" +
            "char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes\n" +
            "boolean - stores values with two states: true or false", "As explained in the previous chapter, a variable in Java must be a specified data type:\n" +
            "\n" +
            "Example\n" +
            "int myNum = 5;               // Integer (whole number)\n" +
            "float myFloatNum = 5.99f;    // Floating point number\n" +
            "char myLetter = 'D';         // Character\n" +
            "boolean myBool = true;       // Boolean\n" +
            "String myText = \"Hello\";     // String", "Java Type Casting\n" +
            "Type casting is when you assign a value of one primitive data type to another type.\n" +
            "\n" +
            "In Java, there are two types of casting:\n" +
            "\n" +
            "Widening Casting (automatically) - converting a smaller type to a larger type size\n" +
            "byte -> short -> char -> int -> long -> float -> double\n" +
            "\n" +
            "Narrowing Casting (manually) - converting a larger type to a smaller size type\n" +
            "double -> float -> long -> int -> char -> short -> byte", "Java Operators\n" +
            "Operators are used to perform operations on variables and values.\n" +
            "\n" +
            "In the example below, we use the + operator to add together two values:\n" +
            "\n" +
            "Example\n" +
            "int x = 100 + 50;\n" +
            "\n" +
            "Although the + operator is often used to add together two values, like in the example above, it can also be used to add together a variable and a value, or a variable and another variable:\n" +
            "\n" +
            "Example\n" +
            "int sum1 = 100 + 50;        // 150 (100 + 50)\n" +
            "int sum2 = sum1 + 250;      // 400 (150 + 250)\n" +
            "int sum3 = sum2 + sum2;     // 800 (400 + 400)", "Java Strings\n" +
            "Strings are used for storing text.\n" +
            "\n" +
            "A String variable contains a collection of characters surrounded by double quotes:\n" +
            "\n" +
            "Example\n" +
            "Create a variable of type String and assign it a value:\n" +
            "\n" +
            "String greeting = \"Hello\";", "Java Conditions and If Statements\n" +
            "Java supports the usual logical conditions from mathematics:\n" +
            "\n" +
            "Less than: a < b\n" +
            "Less than or equal to: a <= b\n" +
            "Greater than: a > b\n" +
            "Greater than or equal to: a >= b\n" +
            "Equal to a == b\n" +
            "Not Equal to: a != b\n" +
            "You can use these conditions to perform different actions for different decisions.\n" +
            "\n" +
            "Java has the following conditional statements:\n" +
            "\n" +
            "Use if to specify a block of code to be executed, if a specified condition is true\n" +
            "Use else to specify a block of code to be executed, if the same condition is false\n" +
            "Use else if to specify a new condition to test, if the first condition is false\n" +
            "Use switch to specify many alternative blocks of code to be executed\n" +
            "The if Statement\n" +
            "Use the if statement to specify a block of Java code to be executed if a condition is true.\n" +
            "\n" +
            "Syntax\n" +
            "if (condition) {\n" +
            "  // block of code to be executed if the condition is true\n" +
            "}", "Java Switch Statements\n" +
            "Instead of writing many if..else statements, you can use the switch statement.\n" +
            "\n" +
            "The switch statement selects one of many code blocks to be executed:\n" +
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
            "}", "Loops\n" +
            "Loops can execute a block of code as long as a specified condition is reached.\n" +
            "\n" +
            "Loops are handy because they save time, reduce errors, and they make code more readable.\n" +
            "\n" +
            "Java While Loop\n" +
            "The while loop loops through a block of code as long as a specified condition is true:\n" +
            "\n" +
            "Syntax\n" +
            "while (condition) {\n" +
            "  // code block to be executed\n" +
            "}","Java For Loop\n" +
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
            "for (int i = 0; i < 5; i++) {\n" +
            "  System.out.println(i);\n" +
            "}\n" +
            "\n"};
    ListView listViewjaex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javat_doc);

        //To chnage the color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.dark_grey)));

        //To chnage the color of status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        listViewjaex = findViewById(R.id.listviewjaex);

     JavatDoc.MyjavaAdapterjava myjavaAdapter = new JavatDoc.MyjavaAdapterjava();
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