package main.t02t03t04.stationery;

import main.t02t03t04.Price;
import main.t02t03t04.exception.NoSuchNameException;

/**
 * Created by Ekaterina Semenova on 06.03.2018.
 */
public class CleaningTool extends Stationery {

    private Name name;

    public CleaningTool(String name, Price price) {
        super(price);
        try {
            this.name = Name.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException exception) {
            throw new NoSuchNameException(name);
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
    private enum Name {
        ERASER,
        CORRECTOR

    }

}
