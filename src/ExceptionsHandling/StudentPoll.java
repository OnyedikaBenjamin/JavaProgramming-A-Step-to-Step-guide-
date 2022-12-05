package ExceptionsHandling;

import java.util.Scanner;

public class StudentPoll {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many Students rated the food quality? -> ");
        int noOfStudents = input.nextInt();

        int[] responses = new int[noOfStudents], frequency = new int[6];

        for (int i = 0; i < noOfStudents; i++) {
            System.out.print("What's Student" + (i + 1) + " response?? -> ");
            int userResponse = input.nextInt();
            responses[i] = userResponse;
        }
        for (int response : responses) {
            try {
                // Make element at frequency[0] to be = no Of Occurrence of 1
                ++frequency[response];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(response + " is above the rating!!. please input a rating from 1 to 5.");
            }
        }

        System.out.print("Rating\t\tFrequency\n");
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.println(rating + "\t\t\t\t" + frequency[rating]);
        }
    }
}