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
        Student studentX = AllStudents.STUDENTS.get(0);

        System.out.println("Information about student " + studentX);
        for (Group g: AllGroups.GROUP_SET
                ) {
            if(g.hasStudent(studentX)){
                System.out.println(g.getDiscipline() + " " + g.getMark(studentX));
            }
        }

        System.out.println();
        Student studentY = AllStudents.STUDENTS.get(1);
        System.out.println("Information about student " + studentY);
        for (Group group: AllGroups.GROUP_SET
                ) {
            if(group.hasStudent(studentY)){
                System.out.println(group.getDiscipline() + " " + group.getMark(studentY));
            }
        }

        System.out.println("========================");
        for (Group group: AllGroups.GROUP_SET
             ) {
            System.out.println(group);
        }
    }
}
