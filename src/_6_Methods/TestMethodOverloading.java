  // This is a program that creates three methods. The first finds the maximum integer,
 //  the second finds the maximum double, and the third finds the maximum among three double
//   values. All three methods are named max.


package _6_Methods;

public class TestMethodOverloading {

    public static int max(int x, int y) {
      if (x > y)
        return x;
      else
          return y;
    }
    public static double max(double x, double y) {
        if (x > y)
        return x;
    else
        return y;
    }
    public static double max(double x, double y, double z){

        return max(max(x, y), z);
    }

    public static void main(String[] args) {

        int x = 7;
        double y = 500.98;
        int z = 90;

        System.out.println("The max of the figures are " + max(x, y, z));
    }
}
