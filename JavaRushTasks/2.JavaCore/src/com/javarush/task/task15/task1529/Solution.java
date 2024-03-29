package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();

    }

    public static CanFly result;

    public static void reset() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = br.readLine();
            if (input.equals("helicopter")) {
                result = new Helicopter();
            } else if (input.equals("plane")){
                result = new Plane(Integer.parseInt(br.readLine()));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
