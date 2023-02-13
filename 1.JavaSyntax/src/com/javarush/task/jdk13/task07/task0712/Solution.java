package com.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальное или максимальное
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < minLength)
                minLength = strings.get(i).length();
            if (strings.get(i).length() > maxLength)
                maxLength = strings.get(i).length();
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == minLength) {
                System.out.println(strings.get(i));
                break;
            }
            if (strings.get(i).length() == maxLength) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
