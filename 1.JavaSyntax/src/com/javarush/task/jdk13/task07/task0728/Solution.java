package com.javarush.task.jdk13.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
//        int[] sorted = new int[array.length];
        int temp;
        int arrayLength = array.length;
        for (int arrayEnd = arrayLength - 1; arrayEnd >= 0; arrayEnd--) {

            for (int i = 0; i < arrayLength - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    //     i = 0;
                }
            }
        }

    }

}

