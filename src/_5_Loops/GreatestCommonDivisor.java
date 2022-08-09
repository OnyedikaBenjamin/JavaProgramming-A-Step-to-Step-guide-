// Write  program that prompts the user to enter two positive integers and finds their greatest common divisor.

package _5_Loops;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int number2 = input.nextInt();

        int gcd = 1;  // Initial gcd is 1
        int k;       //  Next possible gcd

        for (k = 2; k <= number1 && k <= number2; k++) {
            if (number1 % k == 0 && number2 % k == 0)
                gcd = k;
        }
        System.out.println("The greatest common divisor for " + number1 +
                     " and " + number2 + " is " + gcd);

    }
}
