package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }
        try {
            throw new IndexOutOfBoundsException();

        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            throw new ConcurrentModificationException();
        } catch (ConcurrentModificationException e) {
            exceptions.add(e);
        }
        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }

        //
        try {
            throw new InterruptedIOException() ;
        } catch (InterruptedIOException e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalArgumentException() ;
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
