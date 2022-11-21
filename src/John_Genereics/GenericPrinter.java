package John_Genereics;

import org.junit.jupiter.api.Ben_Billion_Explanation;
import org.junit.jupiter.api.Ben_Billion_Notes;
import org.junit.jupiter.api.Key_Point;

@Ben_Billion_Notes("Diametrical to our NormalPrinter class, Here we have an angle bracket beside the class name" +
        "           Which means our Type parameter, it defines the type of thing this printer is going to hold and print")

    @Key_Point("Generics don't work with primitives types, all we are to use is the Wrapper classes." +
        "       i.e Integer instead of int, Double instead of Double")

public class GenericPrinter<T>{
    T thingToPrint;                          @Ben_Billion_Explanation("What we want to print is of type T")


    public GenericPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public static void main(String[] args) {

        @Key_Point("Here (in the angle-brackets) we specify the type of thing our GenericPrinter object will print ... i.e Integer, String")
        GenericPrinter <String> genericPrinter1 = new GenericPrinter<>("Ben-Billion");
        GenericPrinter <Integer> genericPrinter2 = new GenericPrinter<>(2022);

        System.out.println("genericPrinter1 prints -> " + genericPrinter1.thingToPrint);
        System.out.println("genericPrinter2 prints -> " + genericPrinter2.thingToPrint);
    }

    public void print(){
        System.out.println(thingToPrint);
    }

}