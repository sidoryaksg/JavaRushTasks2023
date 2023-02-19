package com.javarush.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Максимальное и минимальное числа в массиве
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = (Integer.parseInt(reader.readLine()));
        }

        for (Integer number: numbers
             ) {
            if (number < minimum)
                minimum = number;
            if (number > maximum)
                maximum = number;
        }


        System.out.print(maximum + " " + minimum);
    }
}
