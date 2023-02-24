package com.javarush.task.jdk13.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Ломов", "Иван");
        map.put("Куров", "Петр");
        map.put("Жуков", "Артем");
        map.put("Петров", "Евегний");
        map.put("Сидоров", "Евгений");
        map.put("Алексеев", "Александр");
        map.put("Романов", "Иван");
        map.put("Чернов", "Василий");
        map.put("Другов", "Айдар");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        return Collections.frequency(map.values(), name);



    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        return map.containsKey(lastName) ? 1 : 0;


    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();



    }
}
