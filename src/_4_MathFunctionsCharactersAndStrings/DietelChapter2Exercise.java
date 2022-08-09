/*
Write an application that inputs one number consisting of five digits from the user,
separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print 4 2 3 3 9
Assume that the user enters the correct number of digits. What happens when you enter a
number with more than five digits? What happens when you enter a number with fewer than five
digits?.
*/


package _4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

public class DietelChapter2Exercise {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        String numberEntered = in.nextLine();

        char first = numberEntered.charAt(0);
        char second = numberEntered.charAt(1);
        char third = numberEntered.charAt(2);
        char fourth = numberEntered.charAt(3);
        char fifth = numberEntered.charAt(4);

        System.out.println(first + "   " +second + "   " + third + "   " + fourth + "   " + fifth);
    }
}
