package _2_ElementaryProgramming;

public class SwapValuesOfVariables {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        System.out.println("Before the swap, x is " + x + " and y is " + y);

        int temp = x ;    // Save x in a temp variable   temp is now 1
        x = y;           //  Assign the value in y to x,  x is now 1
        y = temp;       //   y is now 1

        System.out.println("After the swap, x is " + x + " and y is " + y);

        int a = 6;
        int b = 10;
        a = a ^ b ^ (b = a);
        System.out.println("After the swap, a is " + a + " and b is " + b);
    }
}
