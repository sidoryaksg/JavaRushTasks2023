package com.javarush.task.jdk13.task06.task0612;

/* 
Класс Calculator
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return  a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a*b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        //Double result=(a/b);

        return Double.valueOf(a)/Double.valueOf(b);
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return b*(Double.valueOf(a)/100);
    }

    public static void main(String[] args) {
        System.out.println(percent(4, 50));

    }
}