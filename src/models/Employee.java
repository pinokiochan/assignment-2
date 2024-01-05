package models;

public class Employee extends Person {
    private static int nextId = 1;
    private int id;
    private static int getNextId(){
        return nextId++;

    }
    private String name;
    private String surname;
    private String position;
    private double salary;

    @Override
    public String toString() {
        return position + ": " + id + ". " + name + " " + surname;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public Employee(){
        this.id = getNextId();
    }
    public Employee(String name, String surname, String position, double salary){
        this.id = getNextId();
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
