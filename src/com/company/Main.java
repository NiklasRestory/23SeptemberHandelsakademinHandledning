package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jake"));
        people.add(new Person("Joakim"));
        people.add(new Person("Luna"));
        people.add(new Person("Copernicus"));
        people.add(new Student("Papegia"));
        people.add(new Student("Fågel"));
        people.add(new Student("Prince"));


        int intValue = 43;
        String newString = Integer.toString(intValue);
        newString = intValue + "";

        System.out.println(people.get(0).getName());

        //Person[] personArray = new Person[4];
        //personArray[0] = new Student("Clark");
        //System.out.println(personArray[0].getName());

        Class classOfStudents = new Class("Class 1", people);
        Class aSecondClass = new Class("Class 2", people);

        //classOfStudents.setPeople(people);
        //aSecondClass.setPeople(people);

        classOfStudents.printPeople();
        aSecondClass.printPeople();

        people.get(3).setName("Mathaew");
        System.out.println("Copernicus changed name to Mathaew!");

        classOfStudents.printPeople();
        aSecondClass.printPeople();

        int indexOfMathaew = getIndexOfPersonWithName("Mathaew", people);
        System.out.println("Mathaew has index " + indexOfMathaew);

        /*try {
            //Runtime.getRuntime().exec("clear");
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            Process startProcess = pb.inheritIO().start();
            startProcess.waitFor();
        }
        catch (InterruptedException e) {

        }
        catch (IOException e) {

        }*/
        //

        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        //System.out.println("Mathaew has index " + people.);

    }

    public static int getIndexOfPersonWithName(String name, ArrayList<Person> people) {
        int indexOfName = -1;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(name)) {
                indexOfName = i;
                break;
            }
        }
        return indexOfName;
    }
}
