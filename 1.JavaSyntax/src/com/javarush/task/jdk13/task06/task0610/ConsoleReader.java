package com.javarush.task.jdk13.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inp = bufferedReader.readLine();
        return inp;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(bufferedReader.readLine());
        return inp;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double inp = Double.parseDouble(bufferedReader.readLine());

        return inp;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inp = bufferedReader.readLine();
        boolean result = true;
        if (inp.equals("true"))
            result = true;
        else if (inp.equals("false")) {
            result = false;
        }


        return result;

    }

    public static void main(String[] args) throws Exception {

        System.out.println(readDouble());

    }
}
