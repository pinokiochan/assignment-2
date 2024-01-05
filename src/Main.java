import models.Employee;
import models.Person;
import models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Person> people = new ArrayList<>();

        people.addAll(loadStudents());
        people.addAll(loadEmployees());

        Collections.sort(people);
        printData(people);
    }
    public static ArrayList<Person> loadStudents() throws FileNotFoundException{
        return loadPerson("students", PersonType.STUDENT);

    }
    public static ArrayList<Person> loadEmployees() throws  FileNotFoundException{
        return loadPerson("employees", PersonType.EMPLOYEE);
    }
    private enum PersonType{
        STUDENT,
        EMPLOYEE
    }

    public static ArrayList<Person> loadPerson(String pathAdd, PersonType type) throws FileNotFoundException{
        String path = "C:\\Users\\Lenovo\\IdeaProjects\\assignment 2\\src\\source\\";
        File file = new File(path + pathAdd);
        Scanner scanner = new Scanner(file);
        ArrayList<Person> people = new ArrayList<>();
        switch (type){
            case STUDENT:
                while (scanner.hasNextLine()){
                    people.add(new Student(scanner.next(), scanner.next(), scanner.nextDouble()));
                }
                break;
            case EMPLOYEE:
                while (scanner.hasNextLine()){
                    people.add(new Employee(scanner.next(), scanner.next(), scanner.next(), scanner.nextDouble()));
                }
                break;
        }

        return people;
    }

    public static void printData(Iterable<Person> people){
        for(Person person : people){
            System.out.println(person.toString() + " earns " + String.format("%.2f",person.getPaymentAmount()) + " tenge");
        }
    }
}
