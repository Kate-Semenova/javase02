package main.t02t03t04.exception;

/**
 * Created by Ekaterina Semenova on 16.03.2018.
 */
public class NoSuchStationaryException extends Exception {
    public NoSuchStationaryException(String stationary) {
        super("There is no " + stationary);
    }
}
