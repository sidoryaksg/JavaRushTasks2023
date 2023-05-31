package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    static SimpleDateFormat dateInpFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat dateOutpFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    createPersons(args);
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    updatePersons(args);
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    outpPerson(args);
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    deletePersons(args);
                }
                break;
//            default:
//                System.out.println("Неизвестная команда");
//                break;
        }

//        if (args[0].equals("-c") && ((args.length - 1) % 3 == 0))
//            createPersons(args);
//        else if (args[0].equals("-u") && (args.length - 1) % 4 == 0)
//            updatePersons(args);
//        else if (args[0].equals("-i"))
//            outpPerson(args);
//        else if (args[0].equals("-d"))
//            deletePersons(args);
//        for (Person p : allPeople) {
//            System.out.println(p.getName() + " " + p.getSex() + " " + dateOutpFormat.format(p.getBirthDate()) + " ");
//        }

    }

    private static void createPersons(String[] args) {
        for (int i = 1; i < args.length - 1; i = i + 3) {
            Person person;
            try {
                if (args[i + 1].equals("м")) {
                    person = Person.createMale(args[i], dateInpFormat.parse(args[i + 2]));
                } else person = Person.createFemale(args[i], dateInpFormat.parse(args[i + 2]));
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);

            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

        }


//        Person person1;
//        Person person2;
//        try {
//            if (args[2].equals("м")) {
//                person1 = Person.createMale(args[1], dateInpFormat.parse(args[3]));
//            } else person1 = Person.createFemale(args[1], dateInpFormat.parse(args[3]));
//            if (args[5].equals("м")) {
//                person2 = Person.createMale(args[4], dateInpFormat.parse(args[6]));
//            } else person2 = Person.createFemale(args[4], dateInpFormat.parse(args[6]));
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        allPeople.add(person1);
//        allPeople.add(person2);

    }

    private static void updatePersons(String[] args) {
        for (int i = 1; i < args.length - 1; i = i + 4) {
            Person person;
            try {
                if (args[i + 2].equals("м")) {
                    person = Person.createMale(args[i + 1], dateInpFormat.parse(args[i + 3]));
                } else person = Person.createFemale(args[i + 1], dateInpFormat.parse(args[i + 3]));
                allPeople.set(Integer.parseInt(args[i]), person);


            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

        }


//        int id = Integer.parseInt(args[1]);
//        int id2 = Integer.parseInt(args[5]);
//        try {
//            if (args[3].equals("м")) {
//                allPeople.set(id, Person.createMale(args[2], dateInpFormat.parse(args[4])));
//            } else allPeople.set(id, Person.createFemale(args[2], dateInpFormat.parse(args[4])));
//            if (args[7].equals("м")) {
//                allPeople.set(id2, Person.createMale(args[6], dateInpFormat.parse(args[8])));
//            } else allPeople.set(id2, Person.createFemale(args[6], dateInpFormat.parse(args[8])));
//
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

    }

    private static void deletePersons(String[] args) {
        try {

            for (int i = 1; i < args.length; i++) {
                Person person = Person.createFemale("1", dateInpFormat.parse("01/01/1988"));
                person.setBirthDate(null);
                person.setSex(null);
                person.setName(null);
                allPeople.set(Integer.parseInt(args[i]), person);

            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    private static void outpPerson(String[] args) {
        for (int i = 1; i < args.length; i++) {
            Person p = allPeople.get(Integer.parseInt(args[i]));
            String sex = "";
            if (p.getSex() == Sex.MALE) {
                sex = "м";
            } else sex = "ж";
            System.out.println(p.getName() + " " + sex + " " + dateOutpFormat.format(p.getBirthDate()));
        }
    }

}
