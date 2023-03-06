package com.javarush.task.jdk13.task09.task0930;

import java.util.ArrayList;
import java.util.List;

public class ArraySorter {

    public void sort(String[] array) {
        //напишите тут ваш код
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        for (String value : array
        ) {
            if (isNumber(value)) {
                integers.add(Integer.parseInt(value));
            }
            else {
                strings.add(value);
            }
        }

        
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // Строка содержит '-'
                    || (!Character.isDigit(character) && character != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && character == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
