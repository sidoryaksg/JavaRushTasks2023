package com.javarush.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Три массива
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //заполняем лист
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        //сортируем
        for (int number : numbers
        ) {
            if (number % 3 == 0)
                divBy3.add(number);
            if (number % 2 == 0) {
                divBy2.add(number);
            }
            if (number % 3 > 0 && number % 2 > 0)
                others.add(number);
        }

        //выводим
        printList(divBy3);
        //System.out.println("--------");
        printList(divBy2);
        //System.out.println("--------");
        printList(others);

    }

    public static void printList(ArrayList<Integer> list) throws Exception {
        //напишите тут ваш код
        for (int value : list
             ) {
            System.out.println(value);
        }
    }
}
