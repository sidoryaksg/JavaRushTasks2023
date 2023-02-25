package com.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Удалить всех людей, родившихся летом
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Иванов", dateFormat.parse("JAN 2 2020"));
        map.put("Петров", dateFormat.parse("JUN 2 2020"));
        map.put("Сидоров", dateFormat.parse("JUL 2 2020"));
        map.put("Кучко", dateFormat.parse("JAN 2 2020"));
        map.put("Васина", dateFormat.parse("JAN 2 2020"));
        map.put("Розова", dateFormat.parse("JAN 2 2020"));
        map.put("Шилин", dateFormat.parse("JAN 2 2020"));
        map.put("Марксов", dateFormat.parse("JAN 2 2020"));
        map.put("Васин", dateFormat.parse("JAN 2 2020"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> copy = new HashMap<>(map);

        for (Map.Entry<String, Date> entry : copy.entrySet()
             ) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(entry.getValue());
            if ((cal.get(Calendar.MONTH)) > 4 && (cal.get(Calendar.MONTH)) < 8 )
                map.remove(entry.getKey());
        }

    }

    public static void main(String[] args) throws Exception{
//        Map<String, Date> map = createMap();
//        removeAllSummerPeople(map);
//        for (Map.Entry<String, Date> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }


    }
}
