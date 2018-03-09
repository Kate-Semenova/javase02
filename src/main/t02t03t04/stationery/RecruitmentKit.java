package main.t02t03t04.stationery;

import main.t02t03t04.Price;
import main.t02t03t04.comparator.SortedByName;
import main.t02t03t04.comparator.SortedByNameAndPrice;
import main.t02t03t04.comparator.SortedByPrice;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Ekaterina Semenova on 08.03.2018.
 */
public class RecruitmentKit {
    private static List<Stationery> stationeries = new ArrayList<>();
    {
        stationeries.add(new WritingTool("pen", Color.BLUE, new Price(46, 54)));
        stationeries.add(new WritingTool("pencil", Color.DARK_GRAY, new Price(12,50)));
        stationeries.add(new CleaningTool("eraser", new Price(20)));
        stationeries.add(new ScaleTool("ruler", 13, "plastic", new Price(20)));
        stationeries.add(new ScaleTool("ruler", 30, "metal", new Price(100)));
    }
    public  List<Stationery> getStationeries(){
        return stationeries;
    }

    public List<Stationery> sortByPrice(){
        Collections.sort(stationeries, new SortedByPrice());
        return stationeries;
    }

    public List<Stationery> sortByName(){
       Collections.sort(stationeries, new SortedByName());
        return stationeries;
    }
    public List<Stationery> sortByNameAndPrice(){
        Collections.sort(stationeries,new SortedByNameAndPrice());
        return stationeries;
    }
}
