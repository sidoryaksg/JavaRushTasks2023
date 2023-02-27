package com.javarush.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Вся семья в сборе
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human child1 = new Human("Алиса", false, 3);
        Human child2 = new Human("Анна", false, 6);
        Human child3 = new Human("Боря", true, 3);
        Human mother = new Human("Света", false, 30, child1, child2, child3);
        Human father = new Human("Артем", true, 32, child1, child2, child3);
        Human grandma1 = new Human("Ольга", false, 56, mother);
        Human grandfa1 = new Human("Георгий", true, 60, mother);
        Human grandma2 = new Human("Татьяна", false, 58, father);
        Human grandfa2 = new Human("Аслан", true, 61, father);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandfa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandfa2.toString());
        System.out.println(grandma2.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        Integer age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, Boolean sex, Integer age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, Boolean sex, Integer age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
