package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
            String line;
            while (true) {
                line = bufferedReader.readLine();
                arrayList.add(line + "\n");
                if (line.equals("exit"))
                    break;
            }

            for (String str : arrayList) {
                bufferedWriter.write(str);

            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

