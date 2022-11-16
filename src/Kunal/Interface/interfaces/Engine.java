package Kunal.Interface.interfaces;

public interface Engine {
    static final int PRICE = 78000;

    default void start() {
        System.out.println("Started");
    }
    default void stop() {
        System.out.println("Engine Stopped");
    }
    default void accelerate() {
        System.out.println("Accelerating...");
    }
}
