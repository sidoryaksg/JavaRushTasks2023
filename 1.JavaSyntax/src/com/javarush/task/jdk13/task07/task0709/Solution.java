package com.javarush.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая короткая строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            array.add(reader.readLine());
        }

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() < minLength){
                minLength = array.get(i).length();
            }
        }

        for (String arrayValue: array
             ) {if (arrayValue.length() == minLength)
            System.out.println(arrayValue);
        }

    }
}
