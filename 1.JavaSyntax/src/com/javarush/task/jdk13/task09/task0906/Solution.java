package com.javarush.task.jdk13.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {

    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element: stackTraceElements
//             ) {
            System.out.println(stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": " + text);

//        }
    }
}
