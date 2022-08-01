package _2_ElementaryProgramming;

import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter seconds : ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;

        int hour = minutes / 60;

        int remainingSeconds = seconds % 60;   // remaining... is what is left after dividing seconds by 60.

        System.out.print(seconds + " seconds is " + hour + "hr, " + minutes + "mins and " + remainingSeconds + "secs." );

    }
}
