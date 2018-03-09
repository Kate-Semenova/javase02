package main.t02t03t04.stationery;

import main.t02t03t04.Price;

/**
 * Created by Ekaterina Semenova on 06.03.2018.
 */
public class ScaleTool extends Stationery {
    int length;
    Material material;

    public String getName() {
        if (name == null) {
            return "none";
        }
        return name.name();
    }

    public void setName(Name name) {
        this.name = name;
    }

    private enum Material {
        WOOD, METAL, PLASTIC;
    }

    private Name name;

    private enum Name {
        RULER,
        PROTRACTOR,
        MEASURING_TAPE
    }


    public ScaleTool(String name, int length, String material, Price price) {
        super(price);
        this.length = length;

        switch (name.toLowerCase()) {
            case "ruler": {
                this.name = Name.RULER;
                break;
            }
            case "protractor": {
                this.name = Name.PROTRACTOR;
                break;
            }
            case "measuring_tape": {
                this.name = Name.MEASURING_TAPE;
                if (length < 50) {
                    System.out.println(name + "can`t be shorter than 50");
                }
                break;
            }
            default: {
                //TODO throw NoSuchNameException();
                System.out.println("Can`t identify a scale tool");
            }
        }

        switch (material.toLowerCase()) {
            case "wood": {
                this.material = Material.WOOD;
                break;
            }
            case "metal": {
                this.material = Material.METAL;
                break;
            }
            case "plastic": {
                this.material = Material.PLASTIC;
                break;
            }
            default: {
                //TODO throw NoSuchNameException();
                System.out.println("Can`t identify material as" + material);
            }
        }
    }

}
