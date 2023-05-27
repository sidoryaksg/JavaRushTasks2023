package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat inpDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outpDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        //обрабатываем -c
        if (args[0].equals("-c") && args.length == 4) {
            try {
                if (args[2].equals("ж")) {

                    allPeople.add(Person.createFemale(args[1], inpDateFormat.parse(args[3])));
                } else {
                    allPeople.add(Person.createMale(args[1], inpDateFormat.parse(args[3])));
                }
                System.out.println(allPeople.size()-1);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
        //обрабатываем -r
        else if (args[0].equals("-r") && args.length == 2) {
            Person outpPerson = allPeople.get(Integer.parseInt(args[1]));
            String sex = "";
            switch (outpPerson.getSex()) {
                case MALE:
                    sex = "м";
                    break;
                case FEMALE:
                    sex = "ж";
                    break;
            }
            System.out.println(outpPerson.getName() + " " + sex + " " + outpDateFormat.format(outpPerson.getBirthDate()));
        }

        //обрабатываем -u
        else if (args[0].equals("-u") && args.length == 5) {
            try {
                if (args[3].equals("м")) {
                    allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], inpDateFormat.parse(args[4])));
                } else if (args[3].equals("ж")) {
                    allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], inpDateFormat.parse(args[4])));
                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

        }

        //обрабатываем -d
        else if (args[0].equals("-d") && args.length == 2) {
            Person person = null;
            try {
                person = Person.createFemale("", inpDateFormat.parse("01/01/2000"));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);

            allPeople.set(Integer.parseInt(args[1]), person);
        }

        //тстовый вывод
//        for (Person p : allPeople
//        ) {
//            System.out.println("Name: " + p.getName() + " Sex: " + p.getSex() + " BD: " + outpDateFormat.format(p.getBirthDate()));
//
//        }
//        ///////////
    }

}

