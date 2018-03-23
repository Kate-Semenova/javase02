package main.t02t03t04.comparator;

import main.t02t03t04.stationery.Stationery;

import java.util.Comparator;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class SortedByNameAndPrice implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        SortedByName sortByName = new SortedByName();
        SortedByPriceDecreasingly sortedByPriceDecreasingly = new SortedByPriceDecreasingly();
        int compare = sortByName.compare(o1, o2);
        if (compare != 0) {
            return compare;
        }
        return sortedByPriceDecreasingly.compare(o1, o2);
    }
}
