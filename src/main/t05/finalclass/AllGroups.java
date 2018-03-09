package main.t05.finalclass;

import main.t05.model.Discipline;
import main.t05.model.Group;
import main.t05.model.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public final class AllGroups {
    public static final Set<Group> GROUP_SET = new HashSet<>();

    static {
        Discipline math = Discipline.MATH;
        Discipline chem = Discipline.CHEMISTRY;
        Discipline java = Discipline.JAVA_COURSE;
        Discipline english = Discipline.ENGLISH;
        Discipline pi = Discipline.PI;

        Group mathGroup = new Group(math);
        Group chemGroup = new Group(chem);
        Group javaGroup = new Group(java);
        Group enGroup = new Group(english);
        Group piGroup = new Group(pi);

        GROUP_SET.add(mathGroup);
        GROUP_SET.add(chemGroup);
        GROUP_SET.add(javaGroup);
        GROUP_SET.add(enGroup);
        GROUP_SET.add(piGroup);

        for (Student student : AllStudents.students
                ) {
            mathGroup.addStudentAndAssessment(student, 5);
        }

        chemGroup.addStudentAndAssessment(AllStudents.students.get(0), 5.5);
        chemGroup.addStudentAndAssessment(AllStudents.students.get(1), 6.0);
        chemGroup.addStudentAndAssessment(AllStudents.students.get(5), 3.2);

        javaGroup.addStudentAndAssessment(AllStudents.students.get(0), 4);
        javaGroup.addStudentAndAssessment(AllStudents.students.get(7), 5);


    }


}
