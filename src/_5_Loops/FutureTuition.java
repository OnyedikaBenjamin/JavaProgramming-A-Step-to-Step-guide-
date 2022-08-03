/**    Suppose that the tuition for a university is $10,000 this year and tuition increases 7% every year.
        In how many years will the tuition be doubled?    */

package _5_Loops;

public class FutureTuition {

    public static void main(String[] args) {

        int tuition = 10_000;
        int yearsTaken = 0;

        while (tuition <= 20_000){
            tuition = (int) (tuition * 0.07) + tuition;
            yearsTaken++;
        }

        System.out.println("The tuition will be doubled in " + yearsTaken + "years." +
                "\n " +    "The tuition will be " + tuition + " in " + yearsTaken + "yrs.");

    }
}
