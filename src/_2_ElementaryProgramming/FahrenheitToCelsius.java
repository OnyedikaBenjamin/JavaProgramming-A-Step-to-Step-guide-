package _2_ElementaryProgramming;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter value for fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0/9) * (fahrenheit - 32);      // Remember the reason behind making that value 5.0 and not 5

        System.out.println(fahrenheit + " fahrenheit is equal to " + celsius + " celsius.");


    }
}
