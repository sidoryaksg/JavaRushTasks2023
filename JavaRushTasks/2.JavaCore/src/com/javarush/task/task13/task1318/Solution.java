package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream fis = new FileInputStream(br.readLine());
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext())
                System.out.println(scanner.nextLine());
            br.close();
            fis.close();

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

    }
}