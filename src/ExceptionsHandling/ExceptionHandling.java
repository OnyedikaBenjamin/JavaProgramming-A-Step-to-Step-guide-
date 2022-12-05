package ExceptionsHandling;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int e = 5 / 0;
            System.out.println("This statement won't run because there is an exception preceding it");
        } catch (NumberFormatException nfe) {
            System.err.println("See his big head!!! " +
                    "           Come-on input something right");
        } catch (ArithmeticException ae) {
            System.err.println("Just know that is not gonna work ever");
        } finally {
            System.out.println("The finally block is just used to write a statement after trying and catching");
        }

        System.out.println(printNumber());
    }

    // Say we have a method that returns a number
    public static int printNumber() {
        try {
            return 3;                   // let's try a number for exception
        } catch (Exception e) {
            return 4;                   // if the number could throw an exception, it should return 4.
        } finally {
            return 5;
            // Remember that the finally block always execute irrespective of any try or catch things.
            // A return statement in our finally block will override any statement in both our try and catch block
        }
    }
}