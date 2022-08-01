 // Create a program that executes this function..."
//  "A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400".


package _3_Selections;

 import java.util.Scanner;

 public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year : ");   // i.e 2008 is 2008 a leap year ?...true
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 ==0 && year % 100 !=0) || (year % 400 ==0);

        System.out.println("Is " + year + " a leap year? : " + isLeapYear);

    }
}
