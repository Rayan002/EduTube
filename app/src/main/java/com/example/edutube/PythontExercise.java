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

public class PythontExercise extends AppCompatActivity {


    String topictextjaex[] = {"Given two integer numbers return their product only if the product is equal to or lower than 1000, else return their sum.", "Write a program to iterate the first 10 numbers and in each iteration, print the sum of the current and previous number.", "Write a program to accept a string from the user and display characters that are present at an even index number.", "Write a program to remove characters from a string starting from zero up to n and return a new string.", "Write a function to return True if the first and last number of a given list is same. If numbers are different then return False.", "Iterate the given list of numbers and print only those numbers which are divisible by 5", "Write a program to find how many times substring “Emma” appears in the given string.", "Write a program to check if the given number is a palindrome number.\n" +
            "\n" +
            "A palindrome number is a number that is same after reverse. For example 545, is the palindrome numbers", "Create a new list from a two list using the following condition\n" +
            "\n" +
            "Given a two list of numbers, write a program to create a new list such that the new list should contain odd numbers from the first list and even numbers from the second list."};
    String detailsjaex[] = {"def multiplication_or_sum(num1, num2):\n" +
            "    # calculate product of two number\n" +
            "    product = num1 * num2\n" +
            "    # check if product is less then 1000\n" +
            "    if product <= 1000:\n" +
            "        return product\n" +
            "    else:\n" +
            "        # product is greater than 1000 calculate sum\n" +
            "        return num1 + num2\n" +
            "\n" +
            "# first condition\n" +
            "result = multiplication_or_sum(20, 30)\n" +
            "print(\"The result is\", result)\n" +
            "\n" +
            "# Second condition\n" +
            "result = multiplication_or_sum(40, 30)\n" +
            "print(\"The result is\", result)", "print(\"Printing current and previous number and their sum in a range(10)\")\n" +
            "previous_num = 0\n" +
            "\n" +
            "# loop from 1 to 10\n" +
            "for i in range(1, 11):\n" +
            "    x_sum = previous_num + i\n" +
            "    print(\"Current Number\", i, \"Previous Number \", previous_num, \" Sum: \", x_sum)\n" +
            "    # modify previous number\n" +
            "    # set it to the current number\n" +
            "    previous_num = i", "# accept input string from a user\n" +
            "word = input('Enter word ')\n" +
            "print(\"Original String:\", word)\n" +
            "\n" +
            "# get the length of a string\n" +
            "size = len(word)\n" +
            "\n" +
            "# iterate a each character of a string\n" +
            "# start: 0 to start with first character\n" +
            "# stop: size-1 because index starts with 0\n" +
            "# step: 2 to get the characters present at even index like 0, 2, 4\n" +
            "print(\"Printing only even index chars\")\n" +
            "for i in range(0, size - 1, 2):\n" +
            "    print(\"index[\", i, \"]\", word[i])", "def remove_chars(word, n):\n" +
            "    print('Original string:', word)\n" +
            "    x = word[n:]\n" +
            "    return x\n" +
            "\n" +
            "print(\"Removing characters from a string\")\n" +
            "print(remove_chars(\"pynative\", 4))\n" +
            "print(remove_chars(\"pynative\", 2))", "def first_last_same(numberList):\n" +
            "    print(\"Given list:\", numberList)\n" +
            "    \n" +
            "    first_num = numberList[0]\n" +
            "    last_num = numberList[-1]\n" +
            "    \n" +
            "    if first_num == last_num:\n" +
            "        return True\n" +
            "    else:\n" +
            "        return False\n" +
            "\n" +
            "numbers_x = [10, 20, 30, 40, 10]\n" +
            "print(\"result is\", first_last_same(numbers_x))\n" +
            "\n" +
            "numbers_y = [75, 65, 35, 75, 30]\n" +
            "print(\"result is\", first_last_same(numbers_y))", "num_list = [10, 20, 33, 46, 55]\n" +
            "print(\"Given list:\", num_list)\n" +
            "print('Divisible by 5:')\n" +
            "for num in num_list:\n" +
            "    if num % 5 == 0:\n" +
            "        print(num)", "str_x = \"Emma is good developer. Emma is a writer\"\n" +
            "# use count method of a str class\n" +
            "cnt = str_x.count(\"Emma\")\n" +
            "print(cnt)", "def palindrome(number):\n" +
            "    print(\"original number\", number)\n" +
            "    original_num = number\n" +
            "    \n" +
            "    # reverse the given number\n" +
            "    reverse_num = 0\n" +
            "    while number > 0:\n" +
            "        reminder = number % 10\n" +
            "        reverse_num = (reverse_num * 10) + reminder\n" +
            "        number = number // 10\n" +
            "\n" +
            "    # check numbers\n" +
            "    if original_num == reverse_num:\n" +
            "        print(\"Given number palindrome\")\n" +
            "    else:\n" +
            "        print(\"Given number is not palindrome\")\n" +
            "\n" +
            "palindrome(121)\n" +
            "palindrome(125)", "def merge_list(list1, list2):\n" +
            "    result_list = []\n" +
            "    \n" +
            "    # iterate first list\n" +
            "    for num in list1:\n" +
            "        # check if current number is odd\n" +
            "        if num % 2 != 0:\n" +
            "            # add odd number to result list\n" +
            "            result_list.append(num)\n" +
            "    \n" +
            "    # iterate second list\n" +
            "    for num in list2:\n" +
            "        # check if current number is even\n" +
            "        if num % 2 == 0:\n" +
            "            # add even number to result list\n" +
            "            result_list.append(num)\n" +
            "    return result_list\n" +
            "\n" +
            "list1 = [10, 20, 25, 30, 35]\n" +
            "list2 = [40, 45, 60, 75, 90]\n" +
            "print(\"result list:\", merge_list(list1, list2))",};
    ListView listViewjaex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythont_exercise);

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