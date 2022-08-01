// A Sentinel Iteration have to do with controlling a loop with a sentinel value that terminates the loop.

package _5_Loops;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Sentinel Number : ");
        int userInput = input.nextInt();

        int sumSentinel = 0;

        while (userInput != 0){
            sumSentinel += userInput;

            System.out.println("Enter your sentinel Number");
            userInput = input.nextInt();

        }

        System.out.println("Therefore the sumSentinel is : " + sumSentinel);

    }
}
