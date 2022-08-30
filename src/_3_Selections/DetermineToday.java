//  If today is Tuesday, what day of the week will it be in 100 days?
package _3_Selections;

public class DetermineToday {

    public static void main(String[] args) {

        int daysTime = 100;

        if (daysTime % 7 == 1) {
            System.out.println("Wednesday");
        }
        else if (daysTime % 7 == 2) {
            System.out.println("Thursday");
        }
        else if (daysTime % 7 == 3) {
            System.out.println("Friday");
        }
        else if (daysTime % 7 == 4) {
            System.out.println("Saturday");
        }
        else if (daysTime % 7 == 5) {
            System.out.println("Sunday");
        }
        else if (daysTime % 7 == 6) {
            System.out.println("Monday");
        }
        else
            System.out.println("Tuesday");
    }
}
