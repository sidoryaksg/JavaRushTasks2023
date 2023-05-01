package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }

    public static void main(String[] args) {
        for (Thread thread : threads
        ) {
            thread.start();

        }
    }

}

class Thread1 extends Thread {
    @Override
    public void run() {
        while (true) {
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

}

class Thread3 extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Ура");
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread4 extends Thread implements Message {
    public void run() {
        while (!isInterrupted()) {
        }
    }

    public void showWarning() {
        this.interrupt();
    }
}

class Thread5 extends Thread {
    private int count = 0;
    public String inp;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void run() {
        try {
            while (!(inp = bufferedReader.readLine()).equals("N")) {
                count += Integer.parseInt(inp);

            }
            System.out.println(count);
        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
        }
    }
}