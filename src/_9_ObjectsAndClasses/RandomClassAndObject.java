package _9_ObjectsAndClasses;

import java.util.Random;
public class RandomClassAndObject {

    public static void main(String[] args) {

        // We called our random class explicitly.

        Random random1 = new Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(random1.nextInt(1000) + " ");

        Random random2 = new Random(3);
        System.out.println("From random2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
    }
}
