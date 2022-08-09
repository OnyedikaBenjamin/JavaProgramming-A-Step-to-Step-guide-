     // This is a program that demonstrates the effect of passing by value. The program creates a method for swapping two variables.
    // The swap method is invoked by passing two arguments.
   // Interestingly, the values of the arguments are not changed after the method is invoked


package _6_Methods;

public class TestPassByValue {
    public static void main(String[] args) {

        int x = 5;
        int y = 9;
        System.out.println("Before invoking the swap method, x is " + x + " and y is " + y);

        swap(x, y);                     // Here we invoked the method to swap x and y.

        System.out.println("After invoking the swap method, x is " + x + " and y is " + y);
    }

    public static void swap(int a, int b){
        int emptyPlaceholder = a;         // This is the method scope where we implemented what we want the method to do.
        a = b;
        b = emptyPlaceholder;

        System.out.println("\tInside the swap method");
        System.out.println("\t\tAfter swapping, a is " + a+
                " and b is " + b);
        
    }
}

/**
 * Before the swap method is invoked, x is 5 and y is 9. After the swap method is invoked,
 * x is still 5 and y is still 9. Their values have not been swapped. As shown
 * in the program, the values of the arguments x and y are passed to a and b, but a and
 * b have their own memory locations independent of x and y. Therefore, changes in
 * a and b do not affect the contents of x and y.
 * Another twist is to change the parameter name 'a' in swap to x. What effect does this
 * have? No change occurs, because it makes no difference whether the parameter and the argument have the same name.
 * The parameter is a variable in the method with its own memory
 * space. The variable is allocated when the method is invoked, and it disappears when the
 * method is returned to its caller
 * */
