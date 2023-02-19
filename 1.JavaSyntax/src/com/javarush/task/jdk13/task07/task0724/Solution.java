package com.javarush.task.jdk13.task07.task0724;

/* 
Семья
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human hum1 = new Human("Ivan", true, 22);
        Human hum2 = new Human("Dmitry", true, 32);
        Human hum3 = new Human("Alena", false, 12);
        Human hum4 = new Human("Sveta", false, 42);
        Human hum5 = new Human("Alisaa", false, 1, hum1, hum4);
        Human hum6 = new Human("Asia", false, 2, hum1, hum4);
        Human hum7 = new Human("Tolik", true, 3, hum1, hum4);
        Human hum8 = new Human("Aslan", true, 3, hum1, hum4);
        Human hum9 = new Human("Tanya", false, 3, hum1, hum4);

        System.out.println(hum1.toString());
        System.out.println(hum2.toString());
        System.out.println(hum3.toString());
        System.out.println(hum4.toString());
        System.out.println(hum5.toString());
        System.out.println(hum6.toString());
        System.out.println(hum7.toString());
        System.out.println(hum8.toString());
        System.out.println(hum9.toString());

    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}