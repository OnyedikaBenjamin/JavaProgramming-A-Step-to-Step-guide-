// Write an app that prompts the user to enter a month number and displays the month name.

package _7_SingleDimensionalArrays;

import java.util.Scanner;

public class DisplayingMonths {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month number : ");
        int userInput = input.nextInt();

        String [] month = {"January", "February", "March", "April", "May", "June", "July",
                           "August", "September", "October", "November", "December"};

        String theMonth = month[userInput - 1];
        System.out.println(theMonth);
    }



}
