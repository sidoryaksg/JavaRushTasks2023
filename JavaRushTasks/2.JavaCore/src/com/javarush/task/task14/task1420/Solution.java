package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int first;
        int second;
        int max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        first = Integer.parseInt(reader.readLine());
        second = Integer.parseInt(reader.readLine());
        try {
            for (int i = first; i > 0; i--) {
                if (first % i == 0 && second % i == 0 && !(second == (i))) {
                    max = i;
                    break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(max);

    }
}
