package _2_ElementaryProgramming;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius : ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14;

        System.out.println(area);
    }
}

//  'System.in' shows that Input is going in while 'System.out' shows that info is going out.