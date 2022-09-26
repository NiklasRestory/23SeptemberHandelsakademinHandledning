package com.company;

public class Person {
    private String name = "Joakim";

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public Person(String name) {
        this.name = name;
    }
    public Person() {

    }

}
