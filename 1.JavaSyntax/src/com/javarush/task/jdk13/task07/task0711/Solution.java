package com.javarush.task.jdk13.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удали последнюю строку и вставь её в начало
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String lastString;

        //заполняем массив
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        //удаляем последнюю строку и вставляем в начало
        for (int i = 0; i < 13; i++) {
            lastString = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, lastString);
        }

        //выводим строки
        for (String listValue : list) {
            System.out.println(listValue);
        }


    }
}
