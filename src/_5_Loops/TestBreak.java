package _5_Loops;

public class TestBreak {

    public static void main(String[] args) {

        int number = 0;
        int sum = 0;
        while(number < 20){
            number++;
            sum += number;

            if(sum > 100){
                break;
            }
        }
        System.out.println("Number is " + number + " and Sum is " + sum);

    }
}