package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Налоговая и зарплаты
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 500);
        map.put("Петров", 50);
        map.put("Бегунов", 5000);
        map.put("Гладков", 1500);
        map.put("Сидоров", 2500);
        map.put("Гайнуллин", 3500);
        map.put("Шиберт", 4500);
        map.put("Васина", 200);
        map.put("Ивлев", 100);
        map.put("Пшечный", 1500);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : copy.entrySet()) {
            if (entry.getValue() < 500) {
                map.remove(entry.getKey());
            }
        }


    }

    public static void main(String[] args) {

    }
}