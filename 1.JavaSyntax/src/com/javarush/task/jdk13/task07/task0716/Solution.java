package com.javarush.task.jdk13.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        //strings.add("мера");
        strings.add("градус");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> temp = new ArrayList<String>();
        temp.addAll(strings);


        for (String string : strings) {
            boolean r = false;
            boolean l = false;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == 'р' || string.charAt(i) == 'л') {
                    if (string.charAt(i) == 'л') {
                        l = true;
                    } else {
                        r = true;
                    }
                }

            }
            if ((r == false && l == false) || (r == true && l == true)) {
                continue;
            } else if (r == true) {
                temp.remove(string);
            } else {
                temp.add(string);
            }
        }


        return temp;
    }
}