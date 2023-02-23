package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList();
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        //Collections.sort(numbers);
        Integer length = 1;
        Integer maxLength = 1;
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i).equals( numbers.get(i+1)) ) {
                length++;
                maxLength = (maxLength < length) ? length : maxLength;
            }
        else length = 1;
        }

        System.out.println(maxLength);
    }
}
