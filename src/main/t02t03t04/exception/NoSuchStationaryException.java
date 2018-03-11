package main.t02t03t04.exception;

/**
 * Created by Ekaterina Semenova on 11.03.2018.
 */
public class NoSuchStationaryException extends IllegalArgumentException {
    public NoSuchStationaryException(String s) {
        System.out.println("There is no " + s);
    }
}
