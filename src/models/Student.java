package models;

public class Student extends Person {

    private static int nextId = 1;
    private int id;
    private static int getNextId() {return nextId++;}
    private String name;
    private String surname;
    private double gpa;

    @Override
    public String toString() {
        return "Student: " + name + surname;
    }

    @Override
    public String getPosition() {
        return null;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(){

    }
    public Student(String name, String surname, double gpa){
        this();
        this.name = name;
        this.surname = surname;
        setGpa(gpa);
    }

    @Override
    public double getPaymentAmount() {
        return getGpa() > 2.67 ? 36660.0 : 0.0;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
