package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
//        String FILE_NAME = "/Users/sidoriak/Documents/test.txt";
        try (Scanner sc = new Scanner(new FileReader(Statics.FILE_NAME))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }



    public static void main(String[] args) {
        System.out.println(lines);
    }
}
