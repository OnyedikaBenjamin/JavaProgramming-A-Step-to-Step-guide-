package _10_ObjectOrientedThinking;

public class UsingWrapperClasses {
    public static void main(String[] args) {
        // Using the compareTo wrapper class
        Integer x = 3;
        System.out.printf("%s%d%n","x is ", x);
        System.out.printf("%d%s%n",x.compareTo(4), " -> returns -1 because x is less than 4");

        Integer y = 7;
        System.out.printf("%d%s%n",y.compareTo(x), " -> returns 1 because y is greater than x");

        Integer z = 7;
        System.out.printf("%d%s%n",z.compareTo(y), " -> returns 0 because z is equal to y");

        // Using the valueOf wrapper class
         int c = Integer.valueOf("23");
        System.out.println("c -> " + c);
         double f = Double.valueOf("23.45");
        System.out.println("f is " + f);

         // Using the intValue() wrapper class..This will firstly do everything in the in
         int g = (Integer.valueOf("23")).intValue();
        System.out.println("g is " + g);
         double h = (Double.valueOf("23.4")).doubleValue();
        System.out.println("h is " + h);
         int i = (Double.valueOf("23.4")).intValue();
        System.out.println("i is " + i);
         String j = (Double.valueOf("23.4")).toString();
        System.out.println("j is " + j);

        // Using the parseInt

        Integer k = 3 + new Integer(5);


    }
}
