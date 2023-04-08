package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.javarush.task.task14.task1414.Solution.MovieFactory.getMovie;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        boolean correctInput = true;
        while (correctInput) {

            input = bufferedReader.readLine();
            Movie movie = getMovie(input);

            if (!input.equals("cartoon") &&
                    !input.equals("thriller") &&
                    !input.equals("soapOpera")){
                correctInput = false;
                break;
            }
            System.out.println(movie.getClass().getSimpleName());



        }
    }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */


    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }


            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Thriller extends Movie {

    }

    static class Cartoon extends Movie {

    }
}

