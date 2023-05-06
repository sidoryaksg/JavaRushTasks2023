package com.javarush.task.task16.task1626;

/* 
Создание по образцу
*/

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countUpIndex = 1;
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countUpIndex++;
                    Thread.sleep(500);
                    if ( countUpIndex>Solution.number)
                        return;

                }
            } catch (InterruptedException e) {

            }
        }
        //Add your code here - добавь код тут
        public String toString() {
            return Thread.currentThread().getName() + ": " + countUpIndex;
        }

    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
