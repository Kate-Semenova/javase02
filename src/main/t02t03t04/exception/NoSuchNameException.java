package main.t02t03t04.exception;

/**
 * Created by Ekaterina Semenova on 11.03.2018.
 */
public class NoSuchNameException extends IllegalArgumentException {
    public NoSuchNameException(String name) {
        super("Can`t identify " + name);
    }
}
