package com.javarush.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные буквы
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Character> line = new ArrayList<Character>();
        List<Character> vowelsList = new ArrayList<>();
        List<Character> consonantsList = new ArrayList<>();
        String inp = reader.readLine();
        for (int i = 0; i < inp.length(); i++) {
            line.add(inp.charAt(i));
        }

        for (Character ch : line
        ) {
            if (isVowel(ch)){
                vowelsList.add(ch);
            }
            else if (ch != ' '){
                consonantsList.add(ch);
            }
        }
        for (Character ch: vowelsList
             ) {
            System.out.print(ch + " ");
        }
        System.out.println("");
        for (Character ch: consonantsList
        ) {
            System.out.print(ch + " ");
        }

    }


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
