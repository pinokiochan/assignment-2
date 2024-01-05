package models;

import interfaces.Payable;

public abstract class Person implements Comparable<Person>, Payable  {
    private static int nextId = 1;
    private int id;
    private String name;
    private String surname;
    private static int getNextId() {
        return nextId++;
    }

    public Person(){
        this.id = getNextId();
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return  id + ". " + name + " " + surname;
    }

    public abstract String getPosition();
}
