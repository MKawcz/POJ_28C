package com.company.lab10.zad4;

import java.util.Comparator;

public class StudentIndexComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getIndeks().compareTo(o2.getIndeks());
    }
}
