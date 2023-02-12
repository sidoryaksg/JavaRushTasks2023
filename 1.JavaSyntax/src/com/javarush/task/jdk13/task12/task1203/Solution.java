package com.javarush.task.jdk13.task12.task1203;

/* 
Сознательный выбор
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        //напишите тут ваш код
        return l > -129 && l < 128;
    }

    public static boolean isShort(long l) {
        //напишите тут ваш код

        return l > -32769 && l < 32768;
    }

    public static boolean isInt(long l) {
        //напишите тут ваш код
        return l > -2147483649L && l < 2147483648L;
    }
}
