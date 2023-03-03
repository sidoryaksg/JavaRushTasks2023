package com.javarush.task.jdk13.task09.task0918;

/* 
Создаем свои исключения
*/

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends NullPointerException{
    }

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends IOException {
    }

    static class MyException4 extends ArithmeticException{
    }
}

