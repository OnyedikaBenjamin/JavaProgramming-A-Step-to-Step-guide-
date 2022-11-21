package John_Genereics;

import org.junit.jupiter.api.Ben_Billion_Explanation;

public class NormalPrinter {
    Integer thingToPrint;                           @Ben_Billion_Explanation("What we want to print is of the Integer type")

    public NormalPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public static void main(String[] args) {
        @Ben_Billion_Explanation("We can now instantiate our printer object to print something of type integer")
        NormalPrinter printer = new NormalPrinter(777);
        printer.print();
    }

    public void print() {
        System.out.println(thingToPrint);
    }

}