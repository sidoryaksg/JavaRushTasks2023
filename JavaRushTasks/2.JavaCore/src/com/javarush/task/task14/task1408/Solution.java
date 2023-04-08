package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
        Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen2.getDescription());

    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
//            switch (country) {
//                case Country.RUSSIA -> hen = new RussianHen();
//                case Country.BELARUS -> hen = new BelarusianHen();
//                case Country.UKRAINE -> hen = new UkrainianHen();
//                case Country.MOLDOVA -> hen = new MoldovanHen();
//            }
            if (country.equals(Country.BELARUS)) {
                hen = new BelarusianHen();
            } else if (country.equals(Country.UKRAINE)) {
                hen = new UkrainianHen();
            } else if (country.equals(Country.MOLDOVA)) {
                hen = new MoldovanHen();
            } else if (country.equals(Country.RUSSIA)) {
                hen = new RussianHen();
            }
            return hen;
        }
    }

}
