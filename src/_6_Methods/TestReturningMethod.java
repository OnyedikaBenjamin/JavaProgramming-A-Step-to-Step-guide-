/** In JAVA, there is are VOID methods and VALUE returning methods.   ***/
//  Write a program that defines a method named printGrade and invokes it to print the grade for a given score.

package _6_Methods;

public class TestReturningMethod {

    public static void main(String[] args) {

        System.out.println(printGrade(67));
    }


    public static char printGrade(double score) {  //returns a character grade based on the numeric score value. the caller invokes this method.

        if (score >= 85)
            return 'A';
        else if (score >= 70)
            return 'B';
        else if (score >= 60)
            return 'C';
        else if (score >= 50)
            return 'D';
        else if (score >= 40)
            return 'E';
        else
            return 'F';
    }
}
