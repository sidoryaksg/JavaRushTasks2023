package com.javarush.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Самое большое число
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            integers.add(Integer.parseInt(bufferedReader.readLine()));

        }
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            if (integers.get(i) > maxvalue)
                maxvalue = integers.get(i);


        }
        System.out.println(maxvalue);

    }
}
