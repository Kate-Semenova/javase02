package main.t05.finalclass;

import main.t05.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public final class AllStudents {
    public static final List<Student> STUDENTS = new ArrayList<>();

    static {
        STUDENTS.add(new Student("Katerina", "Semenova"));
        STUDENTS.add(new Student("Ivan", "Ivanoff"));
        STUDENTS.add(new Student("Robert", "Smith"));
        STUDENTS.add(new Student("Michel", "Robinson"));
        STUDENTS.add(new Student("Richard", "Gir"));
        STUDENTS.add(new Student("Simon", "Luv"));
        STUDENTS.add(new Student("Helen", "Kar"));
        STUDENTS.add(new Student("Lisa", "Venom"));
        STUDENTS.add(new Student("Gabriel", "Smith"));
        STUDENTS.add(new Student("Marie", "Li"));
    }
}
