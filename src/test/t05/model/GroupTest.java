package test.t05.model;

import main.t05.model.Discipline;
import main.t05.model.Group;
import main.t05.model.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class GroupTest {
    Group group;
    Student student;


    @Before
    public void setUp() {
        group = new Group(Discipline.ENGLISH);
        student = new Student("Kate", "Semenova");
        group.addStudentAndMark(student, 5.0);
    }

    @Test
    public void hasStudentShouldReturnTrueIfThereIsAStudent() {

        assertTrue(group.hasStudent(student));
    }

    @Test
    public void getAssessmentShouldReturnAssessmentIfThereIsAStudent() {
        assertEquals(5.0, group.getMark(new Student("Kate", "Semenova")));
    }
}
