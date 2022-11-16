package HumbleMe;

import java.util.Scanner;

public class Humble1 {
    private static int number1, number2, userAnswer, correctAnswer;
    static Scanner input = new Scanner(System.in);

    public static void startProgram() {
        generateNumbers();
        promptUser();
        computeAndPrint();
    }
    public static void generateNumbers() {
        Scanner input = new Scanner(System.in);
        number1 = 10 + (int) (Math.random() * 9);
        number2 = 10 + (int) (Math.random() * 9);
    }

    public static void promptUser() {
        System.out.println("What is " + number1 + " + " + number2 + " ?? -> ");
        userAnswer = input.nextInt();
        correctAnswer = number1 + number2;
    }

    private static void computeAndPrint() {
        while (userAnswer != correctAnswer) {
            System.out.println("Wrong answer! Please try again, what is " + number1 + " + " + number2 + "?");
            userAnswer = input.nextInt();
        }
        System.out.println("You got it... continue comme cas");
    }


    public static void main(String[] args) {
        startProgram();
    }
}
