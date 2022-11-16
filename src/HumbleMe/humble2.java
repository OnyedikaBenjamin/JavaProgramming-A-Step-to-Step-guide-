package HumbleMe;
//   Write a program that prompts the user to enter a number continuously until the number matches
//    the randomly generated number. For each user input, the program tells the user whether
//     the input is too low or too high, so the user can make the next guess intelligently.    */

import java.util.Scanner;

public class humble2 {
    static Scanner input = new Scanner(System.in);
    static int randomNumber, userAnswer;


    public static void startProgram(){
        generateRandomNumber();
        promptUser();
        computeAndCheck();
    }

    public static void generateRandomNumber(){
        randomNumber = (int) (Math.random() * 100);
    }
    public static void promptUser(){
        System.out.println("Guess the number -> ");
        userAnswer = input.nextInt();
    }
    public static void computeAndCheck(){
        while (userAnswer != randomNumber ){
            if(userAnswer > randomNumber){
                System.out.print("Guess is too high, Please try again -> ");
            }
            else
                System.out.print("Guess is too low, Please try again -> ");
            userAnswer = input.nextInt();
        }
        System.out.println("Congrats!, you are correct.");
    }

    public static void main(String[] args) {
        startProgram();
    }
}
