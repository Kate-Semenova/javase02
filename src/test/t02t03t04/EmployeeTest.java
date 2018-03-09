package test.t02t03t04;

import main.t02t03t04.Employee;
import main.t02t03t04.Price;
import main.t02t03t04.stationery.Stationery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekaterina Semenova on 28.02.2018.
 */
public class EmployeeTest {

    Employee employee;
    Stationery stationery;

    @Before
    public void setUp() {
        employee = new Employee("John", "Snow");
        stationery = new Stationery(new Price(10));
        employee.addStationery(stationery);
    }

    @Test
    public void addStationeryShouldAddNewPenForEmployeeAndHasPenShouldReturnTrue() {
        assertTrue(employee.hasStationery(stationery));
    }

    @Test
    public void removePenShouldRemoveThePen() {
        employee.removeStationery(stationery);
        assertFalse(employee.hasStationery(stationery));
    }

    @Test
    public void costOfAllPensShouldReturnFloat(){
        stationery.setPrice(new Price(20));
        employee.addStationery( new Stationery(new Price(10)));
        employee.addStationery( new Stationery(new Price(11, 12)));
        employee.addStationery( new Stationery(new Price(1, 99)));
        System.out.println(employee.costOfAllStationeries());
        assertEquals(43.11, employee.costOfAllStationeries(), 0.0001);
    }
}
