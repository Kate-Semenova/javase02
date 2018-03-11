package test.t02t03t04.comparator;

import main.t02t03t04.Price;
import main.t02t03t04.comparator.SortedByName;
import main.t02t03t04.exception.NoSuchNameException;
import main.t02t03t04.stationery.ScaleTool;
import main.t02t03t04.stationery.Stationery;
import main.t02t03t04.stationery.WritingTool;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class SortedByNameTest {
    private Stationery pen = new WritingTool("pen", Color.BLUE, new Price(12));
    private ScaleTool ruler;

    WritingTool pen2;
    SortedByName sortedByName;

    @Before
    public void setUp() throws NoSuchNameException {
        ruler = new ScaleTool("ruler", 13, "plastic", new Price(50));
        sortedByName = new SortedByName();
        pen2 = new WritingTool("pen", Color.BLACK, new Price(1));
    }

    @Test
    public void compareShouldReturnNegativeIfFirstIsBigger() {
        assertTrue(sortedByName.compare(pen, ruler) < 0);
    }

    @Test
    public void compareShouldReturnPositiveIfFirstIsSmaller() {
        assertTrue(sortedByName.compare(ruler, pen) > 0);
    }

    @Test
    public void compareShouldReturnZeroIfEquals() {
        assertEquals(sortedByName.compare(pen, pen2), 0);
    }
}
