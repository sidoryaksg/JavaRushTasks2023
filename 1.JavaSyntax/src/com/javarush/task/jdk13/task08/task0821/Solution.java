package com.javarush.task.jdk13.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Гусев", "Гавриил");
        map.put("Радищев", "Евгений");
        map.put("Иванов", "Павел");
        map.put("Грязев", "Артем");
        map.put("Алексеев", "Павел");
        map.put("Ион", "Иван");
        map.put("Ивлев", "Сергей");
        map.put("Иванова", "Анна");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
