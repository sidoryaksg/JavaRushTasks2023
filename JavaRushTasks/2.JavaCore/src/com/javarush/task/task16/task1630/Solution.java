package com.javarush.task.task16.task1630;

import java.io.*;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String filename;
        String result = "";

        @Override
        public void setFileName(String fullFileName) {
            filename=fullFileName;
        }

        @Override
        public String getFileContent() {
            return result;

        }


        @Override
        public void start() {
            this.run();


        }

        @Override
        public void run() {
            try {BufferedReader fReader = new BufferedReader(new FileReader(filename));
                while (fReader.ready()){
                    result= result + fReader.readLine() + " ";

                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

///Users/sidoriak/1.txt
