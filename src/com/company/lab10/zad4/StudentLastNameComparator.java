package com.company.lab10.zad4;

import java.util.Comparator;

public class StudentLastNameComparator  implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNazwisko().compareTo(o2.getNazwisko());
    }
}
