package main.t02t03t04.stationery;

import main.t02t03t04.Price;
import main.t02t03t04.exception.NoSuchNameException;

/**
 * Created by Ekaterina Semenova on 06.03.2018.
 */
public class ScaleTool extends Stationery {
    private int length;
    private Material material;

    private Name name;

    public ScaleTool(String name, int length, String material, Price price) throws NoSuchNameException {
        super(price);
        this.length = length;

        try {
            this.name = Name.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException exception) {
            throw new NoSuchNameException(name);
        }
        try {
            this.material = Material.valueOf(material.toUpperCase());
        } catch (IllegalArgumentException exception) {
            throw new NoSuchNameException(material);
        }
    }

    public String getName() {
        if (name == null) {
            return NONE;
        }
        return name.name();
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material.name().toLowerCase();
    }

    private enum Material {
        WOOD, METAL, PLASTIC;

    }

    private enum Name {
        RULER,
        PROTRACTOR,
        MEASURING_TAPE


    }

}
