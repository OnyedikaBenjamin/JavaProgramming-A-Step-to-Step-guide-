import HumbleMe.Outlier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OutlierTest {
    Outlier outlier;
    @BeforeEach
     void setUp(){

    }

    @Test
    public void testThatFieldCanReturnOutlier(){
        outlier = new Outlier();
        int [] arrayOfIntegers = {2, 4, 6, 7, 8};
        Assertions.assertEquals(7, outlier.returnOutlier(arrayOfIntegers));
    }


}
