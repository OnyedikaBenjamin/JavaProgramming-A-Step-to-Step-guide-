package _12_ExceptionHandlingAndTextIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo{
    static final int GUESS_NUMBER = 4;
    static Scanner input = new Scanner(System.in);
    static int userInput;

    public static void main(String[] args) {
        startProgram();
    }
    public static void startProgram() {
        try{
            promptUser();
            while (inputDoesNotMatch()){
                System.out.println("You are wrong!");
                startProgram();}}
        catch(InputMismatchException ime){
            System.out.println("This is not a valid integer number.");}}
    private static boolean inputDoesNotMatch() {
        return userInput != GUESS_NUMBER;}
    public static void promptUser(){
        System.out.print("Enter the guess number -> ");
        userInput = input.nextInt();
    }
}