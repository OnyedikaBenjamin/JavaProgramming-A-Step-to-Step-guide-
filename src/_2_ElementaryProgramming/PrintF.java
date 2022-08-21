package _2_ElementaryProgramming;

public class PrintF {

    public static void main(String[] args) {

        boolean myBoolean = true;
        char myChar = '#';
        int myInt = 50;
        String myString = "Benjamin";
        double myDouble = 1047486.78654;

// TODO
//  I will do my printing here using each of the data types specifier.

        System.out.printf("%b%n", myBoolean);
        System.out.printf("%c%n", myChar);
        System.out.printf("%d%n", myInt);
        System.out.printf("%s%n", myString);
        System.out.printf("%f%n", myDouble);


        System.out.printf("I have $%.3f %n", myDouble);   // This will approximate the double value to 3 decimal place
        System.out.printf("I have $%,.3f", myDouble); //  This will add a comma to make it readable.

    }
}
