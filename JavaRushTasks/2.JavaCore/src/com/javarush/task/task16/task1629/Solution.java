package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        t1.start();
        t1.join();
        Read3Strings t2 = new Read3Strings();
        t2.start();
        t2.join();


        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread{
        List<String> list = new ArrayList<>();
        @Override
        public void run() {
            try {
                list.add(reader.readLine());
                list.add(reader.readLine());
                list.add(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

        public void printResult() {
            System.out.println("");
            for (String line: list
                 ) {
                System.out.print(line + " ");

            }
        }
    }

    //add your code here - добавьте код тут
}
