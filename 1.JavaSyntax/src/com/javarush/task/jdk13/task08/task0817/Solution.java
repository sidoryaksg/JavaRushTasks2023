package com.javarush.task.jdk13.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Удалить людей, имеющих одинаковые имена
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Петров", "Артем");
        map.put("Иванов", "Иван");
        map.put("Александров", "Артем");
        map.put("Рыжов", "Гордей");
        map.put("Перов", "Василий");
        map.put("Петов", "Анатолий");
        map.put("Петр", "Александр");
        map.put("Пашков", "Александр");
        map.put("Петин", "Азбек");
        map.put("Васин", "Григорий");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> entry : copy.entrySet())
              {
                  if (Collections.frequency(copy.values(), entry.getValue())> 1){
                      removeItemFromMapByValue(map, entry.getValue());

              }

        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        removeTheFirstNameDuplicates(map);
//        for (Map.Entry<String, String> entry : map.entrySet()
//             ) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//
//        }

    }
}
