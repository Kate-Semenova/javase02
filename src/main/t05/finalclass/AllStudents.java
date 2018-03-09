package main.t05.finalclass;

import main.t05.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public final class AllStudents {
    public static final List<Student> students = new ArrayList<>();
    static {
        students.add(new Student("Katerina", "Semenova"));
        students.add(new Student("Ivan", "Ivanoff"));
        students.add(new Student("Robert", "Smith"));
        students.add(new Student("Michel", "Robinson"));
        students.add(new Student("Richard", "Gir"));
        students.add(new Student("Simon", "Luv"));
        students.add(new Student("Helen", "Kar"));
        students.add(new Student("Lisa", "Venom"));
        students.add(new Student("Gabriel", "Smith"));
        students.add(new Student("Marie", "Li"));
    }
}
