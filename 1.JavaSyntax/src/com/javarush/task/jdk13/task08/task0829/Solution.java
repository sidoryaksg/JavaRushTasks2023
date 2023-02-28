package com.javarush.task.jdk13.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нужно добавить в программу новую функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<String, String>();
        while (true){
            String city = reader.readLine();
            if (city.isEmpty())
                    break;
            String family = reader.readLine();
            if (city.isEmpty())
                break;
            map.put(city, family);
        }
        String testCity = reader.readLine();
        System.out.println(map.get(testCity));

//        List<String> list = new ArrayList<>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) {
//                break;
//            }
//
//            list.add(family);
//        }

        // Read the house number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (houseNumber >= 0 && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
        String family = reader.readLine();


    }
}
