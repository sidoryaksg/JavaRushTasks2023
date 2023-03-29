package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

import java.lang.annotation.Repeatable;

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Dog implements Movable, Eat {
        @Override
        public void move() {
            System.out.println("Move");
        }

        @Override
        public void eat() {
            System.out.println("Eat");
        }
    }

    public class Cat implements Movable, Eat, Edible {
        @Override
        public void move() {
            System.out.println("Move");
        }

        @Override
        public void eat() {
            System.out.println("Eat");
        }

        @Override
        public void beEaten() {
            System.out.println("Be Eaten");
        }

    }
    public class Mouse implements Movable, Edible {
        @Override
        public void move() {
            System.out.println("Move");
        }
        @Override
        public void beEaten() {
            System.out.println("Be Eaten");
        }
    }
}