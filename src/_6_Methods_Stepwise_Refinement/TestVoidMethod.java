             /** In JAVA, there is are VOID methods and VALUE returning methods.   ***/
             //  Write a program that defines a method named printGrade and invokes it to print the grade for a given score.

package _6_Methods_Stepwise_Refinement;

public class TestVoidMethod {

    public static void printGrade(double score){

        if (score >= 85)
            System.out.println("A");
        else if ( score >=75)
            System.out.println("B");
        else if ( score >=60)
            System.out.println("C");
        else if ( score >=50)
            System.out.println("D");
        else if ( score >=40)
            System.out.println("E");
        else
            System.out.println("F");
    }

    public static void main(String[] args) {
        System.out.println("The grade is : " );
        printGrade(65);

    }
}
