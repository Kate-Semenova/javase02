package test.t02t03t04.stationary;

import main.t02t03t04.Price;
import main.t02t03t04.stationery.*;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekaterina Semenova on 08.03.2018.
 */
public class RecruitmentKitTest {
    RecruitmentKit rk;
    List<Stationery> stationeries;

    @Before
    public void setUp(){
        rk = new RecruitmentKit();
        stationeries = new ArrayList<>();
    }
    @Test
    public void sortByPriceShouldReturnLinkedSortedList(){
        stationeries.add(new ScaleTool("ruler", 30, "metal", new Price(100)));
        stationeries.add(new WritingTool("pen", Color.BLUE, new Price(46, 54)));
        stationeries.add(new CleaningTool("eraser", new Price(20)));
        stationeries.add(new ScaleTool("ruler", 13, "plastic", new Price(20)));
        stationeries.add(new WritingTool("pencil", Color.DARK_GRAY, new Price(12,50)));
        for (Stationery stationery: stationeries
             ) {
            System.out.println(stationery.toString());
        }

        assertEquals(stationeries, rk.sortByPrice());
    }

    @Test
    public void sortByNameShouldReturnLinkedSortedList(){
        stationeries.add(new CleaningTool("eraser", new Price(20)));
        stationeries.add(new WritingTool("pen", Color.BLUE, new Price(46, 54)));
        stationeries.add(new WritingTool("pencil", Color.DARK_GRAY, new Price(12,50)));
        stationeries.add(new ScaleTool("ruler", 13, "plastic", new Price(20)));
        stationeries.add(new ScaleTool("ruler", 30, "metal", new Price(100)));

        for (Stationery stationery: stationeries
                ) {
            System.out.println(stationery.toString());
        }
        assertEquals(stationeries, rk.sortByName());
    }

    @Test
    public void sortByNameAndPriceShouldReturnSortedList(){
        stationeries.add(new CleaningTool("eraser", new Price(20)));
        stationeries.add(new WritingTool("pen", Color.BLUE, new Price(46, 54)));
        stationeries.add(new WritingTool("pencil", Color.DARK_GRAY, new Price(12,50)));
        stationeries.add(new ScaleTool("ruler", 30, "metal", new Price(100)));
        stationeries.add(new ScaleTool("ruler", 13, "plastic", new Price(20)));
        for (Stationery stationery: stationeries
                ) {
            System.out.println(stationery.toString());
        }
        assertEquals(stationeries, rk.sortByNameAndPrice());
    }
}
