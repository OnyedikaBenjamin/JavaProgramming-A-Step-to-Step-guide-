import _10_ObjectOrientedThinking.ComputeLoanNew;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputeLoanTest {
    ComputeLoanNew loan2;
    @BeforeEach
    void setUp(){
       loan2 = new ComputeLoanNew();
    }
    @Test
    @DisplayName("Test that Monthly payments cannot be calculated with negative values")
    public void test1(){
        loan2.setAnnualInterest(-2.5);
        loan2.setNumberOfYears(5);
        loan2.setLoanAmount(1000);
        assertNotEquals(18, loan2.getMonthlyPayment());
    }
    @Test
    @DisplayName("Test that monthly payments can be calculated")
    public void test2(){
        assertNotEquals(18, loan2.getMonthlyPayment());
        loan2.setAnnualInterest(2.5);
        loan2.setNumberOfYears(5);
        loan2.setLoanAmount(1000);
        assertEquals(18, loan2.getMonthlyPayment());
    }
    @Test
    @DisplayName("Test that total payments can be calculated")
    public void test3(){
        loan2.setAnnualInterest(2.5);
        loan2.setNumberOfYears(5);
        loan2.setLoanAmount(1000);
        assertEquals(1080, loan2.getTotalPayment());
    }
}
