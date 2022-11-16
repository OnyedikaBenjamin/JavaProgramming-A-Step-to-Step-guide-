package HumbleMe;
//   Create a program that generates five subtraction questions (i.e number1 - number2), and after a student
//    answers all five, the program reports the number of correct answers.
//     The program also displays the time spent on the test and lists all the questions.

import java.util.Scanner;
public class humble3 {
    static int number1, number2, userAnswer, correctAnswer, wrongCount, correctCount;
    static Scanner input = new Scanner(System.in);
    static long startTime, testTime;

    public static void main(String[] args){
        startProgram();
    }

    public static void startProgram(){
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 5; i++){
            generateSubtractionQuestion();
            promptUser();
            computeAndPrint();
        }
        computeTime();
        resultReport();
    }
    public static void generateSubtractionQuestion(){
        number1 = (int) (Math.random() * 89);
        number2 = (int) (Math.random() * 99);
        if(number2 > number1){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
    }

    private static void promptUser() {
        System.out.printf("What is " + number1 + " - " + number2 + "? -> ");
        userAnswer = input.nextInt();
    }
    public static void computeAndPrint(){
        correctAnswer = number1 - number2;
        if(userAnswer != correctAnswer){
            wrongCount++;
        }
        else
            correctCount++;
    }
    public static void computeTime(){
        long endTime = System.currentTimeMillis();
        testTime = (endTime - startTime) / 1000;
    }
    public static void resultReport(){
        System.out.println("You got " + correctCount + " questions correct and " + wrongCount + "wrong.");
        System.out.println("Your test time is : " + testTime + " seconds");
    }



}
