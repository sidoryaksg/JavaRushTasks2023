package com.javarush.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        //добавим строки
        while (true){
            String input = reader.readLine();
            if (input.equals("end")){
                break;
            }
            else {
                strings.add(input);
            }
        }

        for (String string: strings
             ) {
            System.out.println(string);

        }

    }
}