package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(3761, "Andrew", "Kulyniy");
        Student s2 = new Student(1093, "Oleh", "Kindratyuk");
        Student s3 = new Student(7256, "Olga", "Loseva");
        Student s4 = new Student(6634, "Irma", "Tinyk");
        Student s5 = new Student(4409, "Ihor", "Hudyak");

        List<Student> listOfStudents = new ArrayList<>();
        GroupOfStudents g1 = new GroupOfStudents(s3, listOfStudents);
        g1.changeTheElder(s3);

        g1.addTheStudent(s1);
        g1.addTheStudent(s2);
        g1.addTheStudent(s3);
        g1.addTheStudent(s4);
        g1.addTheStudent(s5);

        Student rSt1 = new Student(6634, "Bob", "Marvy");
        g1.replaceTheStudent(rSt1);

        g1.removeTheStudent(s1.getId());

        g1.addTheTask("Solve the problem 5");
        g1.addTheTask("Make the presentation");

        g1.markTheTaskAsDone("Make the presentation", s2);
    }
}