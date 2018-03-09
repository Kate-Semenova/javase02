package test.t05.model;

import main.t05.model.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class StudentTest {
    Student student1;
    Student student2;

    @Before
    public void setUp(){
        student1 = new Student("Kate", "Semenova");
        student2 = new Student("Kate", "Ivanova");
    }

    @Test
    public void equalsShouldReturnFalseIfStudentsAreDifferent(){
        assertFalse(student1.equals(student2));
    }
}
