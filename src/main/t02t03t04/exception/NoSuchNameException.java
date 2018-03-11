package main.t02t03t04.exception;

/**
 * Created by Ekaterina Semenova on 11.03.2018.
 */
public class NoSuchNameException extends IllegalArgumentException {
    public NoSuchNameException(String material) {
        System.out.println("Can`t identify " + material);
    }
}
