package com.javarush.task.jdk13.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {

        // Найти минимум тут
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }


        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            String line = reader.readLine();

            nums.add(Integer.parseInt(line));
        }

        return nums;
    }
}
