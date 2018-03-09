package main;

import main.t02t03t04.Employee;
import main.t02t03t04.stationery.*;

import java.util.List;

/**
 * Created by Ekaterina Semenova on 28.02.2018.
 */
public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Snow");
        RecruitmentKit rk = new RecruitmentKit();
        List<Stationery> stationeries = rk.getStationeries();

        employee1.addStationaries(stationeries);

        System.out.println();
        for (Stationery s : stationeries
                ) {
            System.out.println(s);
        }

        System.out.println(String.format("Cost of all stationeries is %.2f", employee1.costOfAllStationeries()));
        System.out.println(String.format("Amount of all stationeries is %d", employee1.amountOfStationeries()));

        System.out.println();
        System.out.println("Here employee`s List does not change at all. These methods are for RecruitmentKit only");
        System.out.println("=========sort by price========");
        rk.sortByPrice();
        for (Stationery s : stationeries
                ) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("========sort by name========");
        rk.sortByName();
        for (Stationery s : stationeries
                ) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("====sort by name and price====");
        rk.sortByNameAndPrice();
        for (Stationery s : stationeries
                ) {
            System.out.println(s);
        }
    }

}

