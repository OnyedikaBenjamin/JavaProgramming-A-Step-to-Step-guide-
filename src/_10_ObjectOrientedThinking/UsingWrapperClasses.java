package _10_ObjectOrientedThinking;

public class UsingWrapperClasses {
    public static void main(String[] args) {

        // The numeric wrapper classes contain the "compareTo method" for comparing two numbers
        System.out.println(new Double(12.4).compareTo(new Double(12.3)));  //returns 1;
        System.out.println(new Double(12.3).compareTo(new Double(12.3))); //returns 0;
        System.out.println(Double.compare(12.3, 12.51));                              //returns -1;

        Integer x = 3, y = 7, z = 7;
        System.out.printf("%d%s%n",x.compareTo(y), " -> returns -1 because x is less than y");
        System.out.printf("%d%s%n",y.compareTo(x), " -> returns 1 because y is greater than x");
        System.out.printf("%d%s%n",z.compareTo(y), " -> returns 0 because z is equal to y");


        // The parseInt and parseDouble classes are used to parse a numeric figure into a digit or floating point value.
        String element = "345.78";
//        System.out.println(Integer.parseInt(element)); // this returns the numeric value in the String element.
        System.out.println(Double.parseDouble(element)); // This returns the double value of the String element.

        // Using the valueOf wrapper class
        String ID = "678.12";
        System.out.println(Double.valueOf(ID));   // This returns 678.12 that is the double value of ID.

        // Using the intValue() and doubleValue() wrapper classes..This will first compute the Double.valueOf or Int.valueOf
        // and then return the value in an int or doubleValue as specified.
        String amount = "919.789";
        System.out.println("a is " + Double.valueOf(amount).doubleValue());  // This will return 919.789
        System.out.println("b is " + Double.valueOf(amount).intValue());  // This will return 919
        System.out.println("c is " + Double.valueOf(amount).toString());    // This will return the string value of amount that is 919.789

    }
}
