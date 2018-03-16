package test.t02t03t04.stationary;

import main.t02t03t04.Price;
import main.t02t03t04.exception.NoSuchNameException;
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
    RecruitmentKit recruitmentKit;
    @Before
    public void setUp(){
         recruitmentKit = new RecruitmentKit();

    }
    @Test
    public void sortByPriceShouldReturnLinkedSortedList() throws NoSuchNameException{

        List<Stationery> stationeries1 = new ArrayList<>();
        stationeries1.add(new ScaleTool("ruler", 30, "metal", new Price(100)));
        stationeries1.add(new WritingTool("pen", Color.BLUE, new Price(46, 54)));
        stationeries1.add(new CleaningTool("eraser", new Price(20)));
        stationeries1.add(new ScaleTool("ruler", 13, "plastic", new Price(20)));
        stationeries1.add(new WritingTool("pencil", Color.DARK_GRAY, new Price(12,50)));
        for (Stationery stationery: stationeries1
             ) {
            System.out.println(stationery.toString());
        }

        assertEquals(stationeries1, recruitmentKit.sortByPrice());
    }

    @Test
    public void sortByNameShouldReturnLinkedSortedList(){

        List<Stationery> stationeries2 = new ArrayList<>();
        stationeries2.add(new CleaningTool("eraser", new Price(20)));
        stationeries2.add(new WritingTool("pen", Color.BLUE, new Price(46, 54)));
        stationeries2.add(new WritingTool("pencil", Color.DARK_GRAY, new Price(12,50)));
        stationeries2.add(new ScaleTool("ruler", 13, "plastic", new Price(20)));
        stationeries2.add(new ScaleTool("ruler", 30, "metal", new Price(100)));

        for (Stationery stationery: stationeries2
                ) {
            System.out.println(stationery.toString());
        }
        assertEquals(stationeries2, recruitmentKit.sortByName());
    }

    @Test
    public void sortByNameAndPriceShouldReturnSortedList(){

        List<Stationery> stationeries3 = new ArrayList<>();
        stationeries3.add(new CleaningTool("eraser", new Price(20)));
        stationeries3.add(new WritingTool("pen", Color.BLUE, new Price(46, 54)));
        stationeries3.add(new WritingTool("pencil", Color.DARK_GRAY, new Price(12,50)));
        stationeries3.add(new ScaleTool("ruler", 30, "metal", new Price(100)));
        stationeries3.add(new ScaleTool("ruler", 13, "plastic", new Price(20)));
        for (Stationery stationery: stationeries3
                ) {
            System.out.println(stationery.toString());
        }
        assertEquals(stationeries3, recruitmentKit.sortByNameAndPrice());
    }
}
