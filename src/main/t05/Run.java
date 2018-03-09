package main.t05;

import main.t05.finalclass.AllGroups;
import main.t05.finalclass.AllStudents;
import main.t05.model.Group;
import main.t05.model.Student;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class Run {
    public static void main(String[] args) {
        Student X = AllStudents.students.get(0);

        System.out.println("Information about student " + X);
        for (Group g: AllGroups.GROUP_SET
                ) {
            if(g.hasStudent(X)){
                System.out.println(g.getDiscipline() + " " + g.getAssessment(X));
            }
        }

        System.out.println();
        Student Y = AllStudents.students.get(1);
        System.out.println("Information about student " + Y);
        for (Group g: AllGroups.GROUP_SET
                ) {
            if(g.hasStudent(Y)){
                System.out.println(g.getDiscipline() + " " + g.getAssessment(X));
            }
        }

        System.out.println("========================");
        for (Group g: AllGroups.GROUP_SET
             ) {
            System.out.println(g);
        }
    }
}
