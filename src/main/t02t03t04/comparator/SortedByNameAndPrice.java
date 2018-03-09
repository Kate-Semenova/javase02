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
        SortedByPrice sortedByPrice = new SortedByPrice();

        if(sortByName.compare(o1, o2) != 0){
            return sortByName.compare(o1, o2);
        }
        return sortedByPrice.compare(o1, o2);
    }
}
