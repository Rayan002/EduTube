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

public class PythontDoc extends AppCompatActivity {

    String topictextjaex[] = {"Python Comments", "Python Variables", "Python Data Type", "Python Numbers", "Python Strings", "Python Booleans", "Python Operators", "Python Lists", "Python If ... Else","Python While Loops","Python For Loops"};
    String detailsjaex[] = {"Python Comments\n" +
            "Comments can be used to explain Python code.\n" +
            "\n" +
            "Comments can be used to make the code more readable.\n" +
            "\n" +
            "Comments can be used to prevent execution when testing code.\n" +
            "\n" +
            "Creating a Comment\n" +
            "Comments starts with a #, and Python will ignore them:\n" +
            "\n" +
            "Example\n" +
            "#This is a comment\n" +
            "print(\"Hello, World!\")", "Variables\n" +
            "Variables are containers for storing data values.\n" +
            "\n" +
            "Creating Variables\n" +
            "Python has no command for declaring a variable.\n" +
            "\n" +
            "A variable is created the moment you first assign a value to it.\n" +
            "\n" +
            "Example\n" +
            "x = 5\n" +
            "y = \"John\"\n" +
            "print(x)\n" +
            "print(y)", "Python Data Types\n" +
            "Built-in Data Types\n" +
            "In programming, data type is an important concept.\n" +
            "\n" +
            "Variables can store data of different types, and different types can do different things.\n" +
            "\n" +
            "Python has the following data types built-in by default, in these categories:\n" +
            "\n" +
            "Text Type:\tstr\n" +
            "Numeric Types:\tint, float, complex\n" +
            "Sequence Types:\tlist, tuple, range\n" +
            "Mapping Type:\tdict\n" +
            "Set Types:\tset, frozenset\n" +
            "Boolean Type:\tbool\n" +
            "Binary Types:\tbytes, bytearray, memoryview\n" +
            "None Type:\tNoneType", "Python Numbers\n" +
            "There are three numeric types in Python:\n" +
            "\n" +
            "int\n" +
            "float\n" +
            "complex\n" +
            "Variables of numeric types are created when you assign a value to them:\n" +
            "\n" +
            "Example\n" +
            "x = 1    # int\n" +
            "y = 2.8  # float\n" +
            "z = 1j   # complex\n", "Strings\n" +
            "Strings in python are surrounded by either single quotation marks, or double quotation marks.\n" +
            "\n" +
            "'hello' is the same as \"hello\".\n" +
            "\n" +
            "You can display a string literal with the print() function:\n" +
            "\n" +
            "Example\n" +
            "print(\"Hello\")\n" +
            "print('Hello')", "Booleans represent one of two values: True or False.\n" +
            "\n" +
            "Boolean Values\n" +
            "In programming you often need to know if an expression is True or False.\n" +
            "\n" +
            "You can evaluate any expression in Python, and get one of two answers, True or False.\n" +
            "\n" +
            "When you compare two values, the expression is evaluated and Python returns the Boolean answer:\n" +
            "\n" +
            "Example\n" +
            "print(10 > 9)\n" +
            "print(10 == 9)\n" +
            "print(10 < 9)", "Python Operators\n" +
            "Operators are used to perform operations on variables and values.\n" +
            "\n" +
            "In the example below, we use the + operator to add together two values:\n" +
            "\n" +
            "Example\n" +
            "print(10 + 5)", "mylist = [\"apple\", \"banana\", \"cherry\"]\n" +
            "List\n" +
            "Lists are used to store multiple items in a single variable.\n" +
            "\n" +
            "Lists are one of 4 built-in data types in Python used to store collections of data, the other 3 are Tuple, Set, and Dictionary, all with different qualities and usage.\n" +
            "\n" +
            "Lists are created using square brackets:\n" +
            "\n" +
            "Example\n" +
            "Create a List:\n" +
            "\n" +
            "thislist = [\"apple\", \"banana\", \"cherry\"]\n" +
            "print(thislist)\n", "Python Conditions and If statements\n" +
            "Python supports the usual logical conditions from mathematics:\n" +
            "\n" +
            "Equals: a == b\n" +
            "Not Equals: a != b\n" +
            "Less than: a < b\n" +
            "Less than or equal to: a <= b\n" +
            "Greater than: a > b\n" +
            "Greater than or equal to: a >= b\n" +
            "These conditions can be used in several ways, most commonly in \"if statements\" and loops.\n" +
            "\n" +
            "An \"if statement\" is written by using the if keyword.\n" +
            "\n" +
            "Example\n" +
            "If statement:\n" +
            "\n" +
            "a = 33\n" +
            "b = 200\n" +
            "if b > a:\n" +
            "  print(\"b is greater than a\")","Python Loops\n" +
            "Python has two primitive loop commands:\n" +
            "\n" +
            "while loops\n" +
            "for loops\n" +
            "The while Loop\n" +
            "With the while loop we can execute a set of statements as long as a condition is true.\n" +
            "\n" +
            "Example\n" +
            "Print i as long as i is less than 6:\n" +
            "\n" +
            "i = 1\n" +
            "while i < 6:\n" +
            "  print(i)\n" +
            "  i += 1","Python For Loops\n" +
            "A for loop is used for iterating over a sequence (that is either a list, a tuple, a dictionary, a set, or a string).\n" +
            "\n" +
            "This is less like the for keyword in other programming languages, and works more like an iterator method as found in other object-orientated programming languages.\n" +
            "\n" +
            "With the for loop we can execute a set of statements, once for each item in a list, tuple, set etc.\n" +
            "\n" +
            "Example\n" +
            "Print each fruit in a fruit list:\n" +
            "\n" +
            "fruits = [\"apple\", \"banana\", \"cherry\"]\n" +
            "for x in fruits:\n" +
            "  print(x)"};
    ListView listViewjaex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythont_doc);

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