package t06;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class Run {
    public static void main(String[] args) {
        AtomicBoat atomicBoat = new AtomicBoat("Cindy", "Russia", "123");
        atomicBoat.start();

        System.out.println();
        atomicBoat.start();

        System.out.println();
        atomicBoat.start();

        System.out.println();
        atomicBoat.stop();
        atomicBoat.start();

        System.out.println();
        atomicBoat.stop();
        atomicBoat.start();

        System.out.println();
        atomicBoat.stop();
        atomicBoat.start();

        System.out.println();
        atomicBoat.stop();
        atomicBoat.start();

        System.out.println();
        atomicBoat.stop();
        atomicBoat.start();

        System.out.println();
        atomicBoat.stop();
        atomicBoat.start();

        System.out.println();
        atomicBoat.start();
    }
}
