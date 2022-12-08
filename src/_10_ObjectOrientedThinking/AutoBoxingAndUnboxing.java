package _10_ObjectOrientedThinking;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {

//  Converting a primitive value to a wrapper object is called boxing. The reverse conversion is called unboxing.
//  The compiler will automatically box a primitive value that appears in a context requiring an object, and will
//  unbox an object that appears in a context requiring a primitive value. This is called autoboxing and autoUnboxing.

        Integer intObject = new Integer(2);
        Integer intObject2 = 2;    // This is referred to as auto-boxing.

        Integer[] intArray = {1, 2, 3}; //The primitives 1, 2, and 3 are automatically boxed into objects new Integer(1), new Integer(2), and new Integer(3).

        System.out.println(intArray[0] + intArray[1] + intArray[2]); //  The objects intArray[ 0],intArray[1], and intArray[2] are automatically unboxed into int values that are added together.

    }
}
