package main.t02t03t04.comparator;

import main.t02t03t04.stationery.Stationery;

import java.util.Comparator;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class SortedByName implements Comparator<Stationery> {

    public int compare(Stationery o1, Stationery o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();

        return str1.compareTo(str2);
    }
}
