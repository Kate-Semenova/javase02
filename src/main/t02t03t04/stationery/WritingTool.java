package main.t02t03t04.stationery;

import main.t02t03t04.Price;
import main.t02t03t04.exception.NoSuchNameException;

import java.awt.*;

/**
 * Created by Ekaterina Semenova on 06.03.2018.
 */
public class WritingTool extends Stationery {
    private Name name;

    private boolean cap = true; //колпачок
    private Color color;

    public WritingTool(String name, Color color, Price price) {
        super(price);
        this.color = color;
        try {
            this.name = Name.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException exception) {
            throw new NoSuchNameException(name);
        }
    }

    private enum Name {
        PEN,
        PENCIL,
        MARKER;

    }

    public Color getColor() {
        return color;
    }

    public void changeKernel(Color color) {
        this.color = color;
    }

    public void lostCap() {
        this.cap = false;
    }

    public boolean hasCap() {
        return this.cap;
    }

    public String getName() {
        if (name == null) {
            return NONE;
        }
        return name.name();
    }

}
