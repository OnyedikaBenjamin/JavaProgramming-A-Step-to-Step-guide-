  //   Write a program that prompts a user to enter an Integer. if the number is a multiple of five,
 //    the program displays "HiFive". If the number is divisible by 2, it displays HiEven.

 package _3_Selections;

  import java.util.Scanner;

  public class SimpleIfDemo {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a number : ");
      int number = input.nextInt();

      if (number % 5 == 0){
       System.out.println("HiFive");
      }
      if (number % 2 == 0){
       System.out.println("HiEven");
      }

 }
}
