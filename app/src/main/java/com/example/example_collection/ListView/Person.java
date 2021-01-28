package com.example.example_collection.ListView;

public class Person {
    private  String newName;
    private  int newAge;
    public Person(String newName, int newAge) {
        this.newAge = newAge;
        this.newName = newName;
    }

    public String getNewName() {
        return newName;
    }

    public int getNewAge() {
        return newAge;
    }
}
