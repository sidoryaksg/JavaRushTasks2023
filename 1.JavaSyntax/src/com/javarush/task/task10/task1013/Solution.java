package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private boolean b;
        private int i;
        private double d;
        private String s;
        private byte by;
        private long l;
        public Human (String s){
            this.s = s;
        }

        public Human(boolean b) {
            this.b = b;
        }

        public Human(int i) {
            this.i = i;
        }

        public Human(double d) {
            this.d = d;
        }

        public Human(byte by) {
            this.by = by;
        }

        public Human(long l) {
            this.l = l;
        }

        public Human(long l, boolean b) {
            this.l = l;
            this.b = b;
        }

        public Human(String s, boolean b) {
            this.s = s;
            this.b = b;
        }

        public Human(String s, boolean b, int i) {
            this.s = s;
            this.b = b;
            this.i = i;
        }

        public Human(String s, boolean b, int i, long l) {
            this.s = s;
            this.b = b;
            this.i = i;
            this.l = l;
        }


    }
}
