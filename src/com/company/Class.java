package com.company;

import java.util.ArrayList;

public class Class {
    ArrayList<Person> people = new ArrayList<>();
    String className = "";

    public void setPeople(ArrayList<Person> peopleParameter) {
        people = peopleParameter;
    }

    public Class(String name, ArrayList<Person> people) {
        this.people = people;
        className = name;
    }

    public void printPeople() {
        for (Person person: people) {
            System.out.println(className + ": " + person.getName());
        }
    }
}
