package main.t02t03t04.comparator;

import main.t02t03t04.stationery.Stationery;

import java.util.Comparator;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class SortedByPrice implements Comparator<Stationery> {
    public int compare(Stationery o1, Stationery o2) {

        float price1 = o1.getPrice();
        float price2 = o2.getPrice();

        if(price1 < price2) {
            return 1;
        }
        else if(price1 > price2) {
            return -1;
        }
        else {
            return 0;
        }
    }


}
