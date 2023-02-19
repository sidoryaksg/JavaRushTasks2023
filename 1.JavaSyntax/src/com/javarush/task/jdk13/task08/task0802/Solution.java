package com.javarush.task.jdk13.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();

        map.put("арбуз", "ягода" );
        map.put("банан", "трава" );
        map.put("вишня", "ягода" );
        map.put("груша", "фрукт" );
        map.put("дыня", "овощ" );
        map.put("ежевика", "куст" );
        map.put("жень-шень", "корень" );
        map.put("земляника", "ягода" );
        map.put("ирис", "цветок" );
        map.put("картофель", "клубень" );

        //print map
        for (Map.Entry<String, String> ent : map.entrySet()
             ) {
            System.out.println(ent.getKey() + " - " + ent.getValue());
        }
    }
}
