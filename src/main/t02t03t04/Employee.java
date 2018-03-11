package main.t02t03t04;

import main.t02t03t04.exception.NoSuchStationaryException;
import main.t02t03t04.stationery.Stationery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ekaterina Semenova on 28.02.2018.
 */
public class Employee {
    private String name;
    private String surname;
    private List<Stationery> stationeries = new ArrayList<>();

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addStationery(Stationery stationery) {
        stationeries.add(stationery);
    }

    public void addStationaries(List<Stationery> stationeries) {
        this.stationeries.addAll(stationeries);
    }

    public List<Stationery> getStationeries() {
        return stationeries;
    }

    public boolean hasStationery(Stationery stationery) {
        return stationeries.contains(stationery);
    }

    public void removeStationery(Stationery stationery) throws NoSuchStationaryException {

        if (this.hasStationery(stationery)) {
            stationeries.remove(stationery);
        } else {
            throw new NoSuchStationaryException(stationery.toString());
        }
    }

    public float costOfAllStationeries() {
        float price = 0;
        for (Stationery st :
                stationeries) {
            price += st.getPrice();
        }
        return price;
    }

    public int amountOfStationeries() {
        return stationeries.size();
    }
}
