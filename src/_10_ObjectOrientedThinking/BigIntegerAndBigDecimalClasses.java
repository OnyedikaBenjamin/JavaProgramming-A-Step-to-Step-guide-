package _10_ObjectOrientedThinking;
//The BigInteger and BigDecimal classes can be used to represent integers or
//decimal numbers of any size and precision.

import java.math.*;

public class BigIntegerAndBigDecimalClasses {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b); // 9223372036854775807 * 2
        System.out.println(c);

        /*
        There is no limit to the precision of a BigDecimal object. The divide method may throw
        an ArithmeticException if the result cannot be terminated. However, you can use the overloaded
        divide(BigDecimal d, int scale, int roundingMode) method to specify a scale and a rounding mode to avoid this
        exception, where scale is the maximum number of digits after the decimal point. For example, the following code
         creates two BigDecimal objects and performs division with scale 20 and rounding mode BigDecimal.ROUND_UP.
         */
        BigDecimal d = new BigDecimal(1.0);
        BigDecimal e = new BigDecimal(3);
//        BigDecimal f = a.divide(e, 20, BigDecimal.ROUND_UP);
        System.out.println(d);
    }
}