// Write a program that takes in an argument, increases its value by 1 and then returns its new value

package _6_Methods_Stepwise_Refinement;

public class Increment {

    public static void main(String[] args) {
        int b = 7;
        System.out.println("Before the call, the value of 'b' is " + b);
        System.out.println("After the method call, the value of 'b' is increased to " + increase(7));
    }

    public static int increase(int x){
        x++;
        return x;
    }

}
