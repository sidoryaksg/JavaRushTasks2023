package com.javarush.task.jdk13.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }

        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer> tempSet = set;
//        for (Integer num : tempSet
//        ) {
//            if (num > 10) {
//                set.remove(num);
//            }
//        }


        for (Iterator<Integer> it = tempSet.iterator(); it.hasNext(); ) {
            Integer temp = it.next();
            if (temp > 10)
                it.remove();
        }
    }


    public static void main(String[] args) {
        Set<Integer> result = createSet();
        removeAllNumbersGreaterThan10(result);
        System.out.println(result);

    }
}
