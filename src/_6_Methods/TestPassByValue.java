   // Write a program that demonstrates the effect of passing by value. The program should create a method for swapping
  // two variables and the values of the arguments should not change after the method is invoked.

package _6_Methods;

public class TestPassByValue {

    public static void swap(int a, int b){
        int emptyPlaceholder = a;         // This is the method scope where we implemented what we want the method to do.
        a = b;
        b = emptyPlaceholder;
        
    }

    public static void main(String[] args) {

        int x = 5;
        int y = 9;
        System.out.println("The initial value of x is " + x + " and the initial value of y is " + y);

        swap(x, y);                     // Here we invoked the method to swap x and y.

        System.out.println("After we invoked our swap method, the value of 'x' is " + x + " and the value of 'y' is " + y);
    }


}
