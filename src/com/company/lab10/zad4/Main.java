package com.company.lab10.zad4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Maciej", "Kowalski", "s24511");
        Student student1 = new Student("Tomasz", "Szuba", "s44444");
        Student student2 = new Student("Mikolaj", "Kawczynski", "s25441");
        Student[] students = {student, student1, student2};
        StudentIndexComparator studentIndexComparator = new StudentIndexComparator();

        Arrays.sort(students, studentIndexComparator);
        for (Student s: students) {
            System.out.println(s.toString());
        }
    }
}
