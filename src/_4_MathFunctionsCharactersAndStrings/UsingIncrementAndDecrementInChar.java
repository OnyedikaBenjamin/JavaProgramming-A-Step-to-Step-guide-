/*
  The increment and decrement operators can also be used on char variables to get the
next or preceding Unicode character. For example, the following statements display
character b.
 */


package _4_MathFunctionsCharactersAndStrings;

public class UsingIncrementAndDecrementInChar {

    public static void main(String[] args) {

        char charValue = 'a';
        System.out.println(++charValue);    // This statement prints out 'b'.

        // We can also show the preceding letter or number by using the decrement operator

        char value = '6';
        System.out.println(--value);    // This statement prints out '5'.
    }
}
