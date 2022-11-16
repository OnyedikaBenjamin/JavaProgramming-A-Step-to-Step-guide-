package Kunal.Extends_ImplementDemo;

import org.junit.jupiter.api.Ben_Billion_Notes;

public class Child implements Father{
    @Ben_Billion_Notes("Remember the Override Annotation denotes that a method has been overridden or an abstract method" +
            "            has been implemented.\n" +
            "            Now the child has the attributes of the father.... and now we can provide the implementation of" +
            "            the abstract methods.")

    @Override

    public void shout() {
        System.out.println("Shouts aimlessly");
    }

    @Override
    public void fight() {
        System.out.println("He is a good Fighter");
    }
}
