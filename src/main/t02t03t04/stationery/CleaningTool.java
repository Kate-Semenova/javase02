package main.t02t03t04.stationery;

import main.t02t03t04.Price;

/**
 * Created by Ekaterina Semenova on 06.03.2018.
 */
public class CleaningTool extends Stationery {

    private Name name;

    public String getName() {
        if (name == null) {
            return "none";
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

    public CleaningTool(String name, Price price) {
        super(price);
        switch (name.toLowerCase()) {
            case "eraser": {
                this.name = Name.ERASER;
                break;
            }
            case "corrector": {
                this.name = Name.CORRECTOR;
                break;
            }
            default: {
                //TODO throw NoSuchNameException();
                System.out.println("Can`t identify a cleaning tool");

            }
        }
    }

}
