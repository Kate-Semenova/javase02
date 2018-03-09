package t06;

import java.util.Timer;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class AtomicBoat {
    private String name;
    private String country;
    private Engine engine;
    private int count = 0;
    private boolean isOnTrip;

    public AtomicBoat(String name, String country, String model){
        this.name = name;
        this.country = country;
        engine = new Engine(model);
    }

    public String getName(){
        return this.name;
    }

    public String getCountry() {
        return country;
    }
    public String getModel(){
        return engine.getModel();
    }
    public void changeEngine(Engine engine){
        this.engine = engine;
    }

    public void start(){

        if(!isOnTrip && engine.turnOn()){
            System.out.println(name + " has started");
            System.out.println("It is its " + count + " trip");
            isOnTrip = true;
        }
        else{
            if(isOnTrip){
                System.out.println("The boat is already on a trip. Stop it");
            } else {
                this.changeEngine(new Engine("A2"));
                System.out.println("Engine was changed with a brand new model");
                this.start();
            }
        }
    }
    public void stop(){
        isOnTrip = false;
    }

    public class Engine{
        private boolean fixed;
        private String model;
        private int operatingTime;
        private Engine(String model){
            fixed = true;
            this.model = model;
            switch (model){
                case "A1":{
                    operatingTime = 3;
                    break;
                }
                case "A2":{
                    operatingTime = 5;
                    break;
                }
                default:{
                    operatingTime = 1;
                }
            }
        }

        private boolean turnOn(){
            if(fixed){
                count++;
                operatingTime--;
                if(operatingTime == 0){
                    fixed = false;
                }
                System.out.println("Engine is turned on");
                return true;
            }
            System.out.println("Engine is out of date");
            return false;
        }

        private String getModel() {
            return model;
        }
    }
}
