package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        int ind = url.indexOf("?");
        url = url.substring(ind + 1, url.length());
        String[] urls = url.split("&");
        List<String> obj = new ArrayList<String>();
        String name = "";

        for (String str : urls) {
            String first;
            String second;
            if (str.contains("=")) {
                int spl = str.indexOf("=");
                first = str.substring(0, spl);
                second = str.substring(spl + 1, str.length());
                if (first.equals("obj")) {
                    obj.add(second);
                }
            } else  {
                first = str;
            }
            name = name + first + " ";
        }


        System.out.println(name);
        if (obj.size() > 0) {
            for (String object : obj) {
                try {
                    alert(Double.valueOf(object));
                } catch (NumberFormatException e) {
                    alert(object);
                }
            }
        }

    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
