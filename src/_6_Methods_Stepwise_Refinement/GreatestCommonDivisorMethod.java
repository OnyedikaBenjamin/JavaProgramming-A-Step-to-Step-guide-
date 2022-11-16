package _6_Methods_Stepwise_Refinement;

public class GreatestCommonDivisorMethod {


    public static int myGcd(int no1, int no2) {

        int gcd = 1;    // Initial gcd
        int k = 2;     //  Possible gcd

                   while (k <= no1 && k <= no2) {
                       if (no1 % k == 0 && no2 % k == 0)
                           gcd = k; // Update gcd
                       k++;
                   }
        return gcd;
    }

        /** We can also use the for loop below  */
//        for (k = 2;  k <= no1  && k <= no2;  k++) {
//        if (no1 % k ==0 && no2 % k ==0)
//            gcd = k;
//    }


        public static void main(String[] args) {
            int a = 45;
            int b = 75;

            myGcd(a, b);
            System.out.println("The greatest common Difference of x and y is : " + myGcd(a,b));

        }
}
