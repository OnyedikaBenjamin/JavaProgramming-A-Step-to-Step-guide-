package Kunal.Generics.GenericsWithOOP;

import org.junit.jupiter.api.Ben_Billion_Explanation;
import org.junit.jupiter.api.Ben_Billion_Notes;

public class Printer<T> {            @Ben_Billion_Notes("T means our type parameter, it defines the type of thing this printer is going to hold and print")
T thingToPrint;                      @Ben_Billion_Notes("What we want to print is of type T")

public Printer(T thingToPrint) {
    this.thingToPrint = thingToPrint;
}

    public static void main(String[] args) {
        @Ben_Billion_Explanation("We can now instantiate our printer object to print something of type integer")
        Printer<Integer> printer = new Printer<>(777);
        printer.print();
    }

    public void print() {
        System.out.println(thingToPrint);
    }

}


