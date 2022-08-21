/**  Note that Java API contains a rich set of classes for developing Java programs.
 *   All the classes in the java library are all static classes.*/

package _9_ObjectsAndClasses;

public class DateAndTimeClassAndObject {

    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
// We constructed a date object from a static java class 'java.util.Date'.

        System.out.printf("%s%d%s%n", "The elapsed time since jan 1 1970 is ", date.getTime(), " milliseconds");
        System.out.printf("%s%n%s", "The current date and time is ", date);
    }
}
