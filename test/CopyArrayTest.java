import _7_SingleDimensionalArrays.CopyArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CopyArrayTest {
    CopyArray copyArray;
    @BeforeEach
            void setUp(){
         copyArray = new CopyArray();
    }
    @Test
    public void copyElementsOfArrayTest(){
        int[] array = {3, 67, 34, 6, 9};
        assertEquals(array.length, copyArray.copyElementsOfArray(array));
    }
    //TODO I will have to create a method that replicates all the elements of an array and also test it

    public void testThatPrintingOccurs(){}




}
