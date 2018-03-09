package test.t02t03t04.comparator;

import main.t02t03t04.Price;
import main.t02t03t04.comparator.SortedByName;
import main.t02t03t04.stationery.ScaleTool;
import main.t02t03t04.stationery.Stationery;
import main.t02t03t04.stationery.WritingTool;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class SortedByNameTest {
    Stationery pen = new WritingTool("pen", Color.BLUE, new Price(12));
    ScaleTool ruler = new ScaleTool("ruler", 13, "plastic", new Price(50));
    WritingTool pen2 = new WritingTool("pen", Color.BLACK, new Price(1));
    SortedByName sortedByName = new SortedByName();

    @Test
    public void compareShouldReturnNegativeIfFirstIsBigger(){
        assertTrue(sortedByName.compare(pen, ruler) < 0);
    }
    @Test
    public void compareShouldReturnPositiveIfFirstIsBigger(){
        assertTrue(sortedByName.compare(ruler, pen) > 0);
    }
    @Test
    public void compareShouldReturnZeroIfFirstIsBigger(){
        assertTrue(sortedByName.compare(pen, pen2) == 0);
    }
}
