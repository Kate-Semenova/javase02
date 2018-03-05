package main.t01;

/**
 * Created by Ekaterina Semenova on 28.02.2018.
 */
public class Pen {

    private String color;
    private boolean cap; //колпачок
    private String manufacturerCompany;
    private double prise;

    public Pen(String color, String manufacturerCompany, double prise){
        this.color = color;
        this.manufacturerCompany = manufacturerCompany;
        this.prise = prise;
    }

    public Pen(String color, String manufacturerCompany, double prise, boolean cap){
        this(color, manufacturerCompany, prise);
        this.cap = cap;
    }
    @Override
    public boolean equals(Object anObject){
        if (this == anObject) {
            return true;
        }
        if (anObject != null && anObject instanceof Pen){
            Pen anotherPen = (Pen)anObject;
            if(!color.equals(anotherPen.getColor())){
                return false;
            }
            if(cap != (anotherPen.hasCap())){
                return false;
            }
            if(!manufacturerCompany.equals(anotherPen.getManufacturerCompany())){
                return false;
            }
            if(prise != anotherPen.getPrise()){
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + (color == null ? 0 : color.hashCode());
        result = prime * result + (cap ? 1 : 0);
        result = prime * result + (manufacturerCompany == null ? 0 : manufacturerCompany.hashCode());
        result = prime * result + (cap ? 1 : 0);
        long prise = Double.doubleToLongBits(this.prise);
        result = prime * result + (int)(prise - (prise >>> 32));
        return result;
    }

    @Override
    public String toString(){
        if(this == null)
            return null;
        if(color == null) {
            if(manufacturerCompany == null){
                return String.format("Pen");
            }
            return String.format("Pen of %s company", manufacturerCompany);
        }
        return String.format("%s pen of %s company",
                (color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase()),
                manufacturerCompany);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean hasCap() {
        return cap;
    }

    public void setCap(boolean cap) {
        this.cap = cap;
    }

    public String getManufacturerCompany() {
        return manufacturerCompany;
    }

    public void setManufacturerCompany(String manufacturerCompany) {
        this.manufacturerCompany = manufacturerCompany;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrice(double prise) {
        this.prise = prise;
    }
}
