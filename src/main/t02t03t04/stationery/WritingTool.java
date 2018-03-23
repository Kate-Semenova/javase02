package main.t02t03t04.stationery;

import main.t02t03t04.Price;

import java.awt.*;

/**
 * Created by Ekaterina Semenova on 06.03.2018.
 */
public class WritingTool extends Stationery {
    private Name name;

    private enum Name {
        PEN,
        PENCIL,
        MARKER;

    }

    private boolean cap = true; //колпачок
    private Color color;

    public WritingTool(String name, Color color, Price price) {
        super(price);
        this.color = color;
        switch (name.toLowerCase()) {
            case "pen": {
                this.name = Name.PEN;
                break;
            }
            case "pencil": {
                this.name = Name.PENCIL;
                break;
            }
            case "marker": {
                this.name = Name.MARKER;
                break;
            }
            default: {
                //TODO throw NoSuchNameException();
                System.out.println("Can`t identify a writing tool");
            }
        }
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
            return "none";
        }
        return name.name();
    }

}
