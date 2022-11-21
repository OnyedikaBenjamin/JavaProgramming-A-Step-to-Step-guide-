package John_Genereics;

import org.junit.jupiter.api.Ben_Billion_Explanation;

public class GenericPrinterOOP<T extends Animal> {
    T thingToPrint;                          @Ben_Billion_Explanation("What we want to print is of type T")


    public GenericPrinterOOP(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public static void main(String[] args) {


        GenericPrinterOOP <String> genericPrinter1 = new GenericPrinterOOP<>("Ben-Billion");
        GenericPrinterOOP <Integer> genericPrinter2 = new GenericPrinterOOP<>(2022);

        System.out.println("genericPrinter1 prints -> " + genericPrinter1.thingToPrint);
        System.out.println("genericPrinter2 prints -> " + genericPrinter2.thingToPrint);
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
