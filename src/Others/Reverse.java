package Others;// Write a program that takes in a number, and reverses it  i.e 26789 to 98726

public class Reverse {
public static int reverseNumber(int numberToReverse) {
        int reverse = 0;
        while (numberToReverse != 0) {
            int remainder = numberToReverse % 10;
            reverse = reverse * 10 + remainder;
            numberToReverse = numberToReverse / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int a = 1234567;
        System.out.println(" number reversed is "+ reverseNumber(a));
    }
}

