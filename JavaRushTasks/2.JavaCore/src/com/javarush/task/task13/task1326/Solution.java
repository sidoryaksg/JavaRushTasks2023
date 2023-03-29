package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream fis = new FileInputStream(br.readLine())) {
            br.close();
            List<Integer> list = new ArrayList<>();
            try (Scanner sc = new Scanner(fis)) {
                while (sc.hasNextInt()) {
                    list.add(sc.nextInt());
                }
                Collections.sort(list);
                for (int i = 0; i < list.size(); i++) {
                    int output = list.get(i).intValue();
                    if (output % 2 == 0)
                        System.out.print(list.get(i) + "\n");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
