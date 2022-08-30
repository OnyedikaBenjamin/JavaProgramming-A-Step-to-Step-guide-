import _10_ObjectOrientedThinking.BmiNew;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BmiTest {
    BmiNew bmi;
    @BeforeEach
    void setUp(){
        bmi = new BmiNew();
    }
    @Test
    public void testThatBmiCannotBeComputedWithNegativeValues(){
        bmi.setHeight(-70);
        bmi.setWeight(146);
        assertEquals(20.948603801493316,bmi.getBmi());
    }
    @Test
    public void testThatBmiReturnsCorrectStatus(){
        bmi.setHeight(70);
        bmi.setWeight(146);
        assertEquals("Normal",bmi.getStatus());
    }



}
