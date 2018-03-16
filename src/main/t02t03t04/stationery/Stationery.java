package main.t02t03t04.stationery;

import main.t02t03t04.Price;

/**
 * Created by Ekaterina Semenova on 05.03.2018.
 */
public class Stationery {
    public static final String NONE = "none";
    private Price price;
    private String manufacturerCompany;

    public Stationery(Price price) {
        this.price = price;
        this.manufacturerCompany = NONE;
    }

    public Stationery(Price price, String manufacturerCompany) {
        this.price = price;
        this.manufacturerCompany = manufacturerCompany;
    }

    public float getPrice() {
        return price.getPrice();
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getManufacturerCompany() {
        return manufacturerCompany;
    }

    public void setManufacturerCompany(String manufacturerCompany) {
        this.manufacturerCompany = manufacturerCompany;
    }

    @Override
    public int hashCode() {
        return (int) price.getPrice() * 17;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object != null && object instanceof Stationery) {
            Stationery newObject = (Stationery) object;
            if (this.getPrice() != newObject.getPrice()) {
                return false;
            }
            if (!this.manufacturerCompany.equals(newObject.getManufacturerCompany())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String getName() {
        return NONE;
    }

    @Override
    public String toString() {
        return "Name is " + this.getName() + "; Price is " + this.price;
    }
}
