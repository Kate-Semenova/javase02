package test.t06;

import org.junit.Before;
import org.junit.Test;
import main.t06.AtomicBoat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekaterina Semenova on 11.03.2018.
 */
public class AtomicBoatTest {
    private AtomicBoat atomicBoat;
    @Before
    public void setUp(){
        atomicBoat = new AtomicBoat("Helen", "USA", "AA");
    }
    @Test
    public void startShouldChangeIsOnTrip(){
        atomicBoat.start();
        assertTrue(atomicBoat.getIsOnTrip());
    }
    @Test
    public void startShouldChangeTripsNumber(){
        int count = atomicBoat.getCount();
        atomicBoat.start();
        count++;
        assertEquals(count, atomicBoat.getCount());
    }

    @Test
    public void stopShouldChangeIsOnTrip(){
        atomicBoat.start();
        atomicBoat.stop();
        assertFalse(atomicBoat.getIsOnTrip());
    }
}
