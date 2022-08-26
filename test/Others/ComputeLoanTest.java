package Others;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeLoanTest {
    ComputeLoanNew loan2;
    @BeforeEach
    void setUp(){
       loan2 = new ComputeLoanNew();
    }

    @Test
    public void testThatMonthlyPaymentCanBeCalculated(){
        loan2.setAnnualInterest(2.5);
        loan2.setNumberOfYears(5);
        loan2.setLoanAmount(1000);
        assertEquals(18, loan2.getMonthlyPayment());
    }
    @Test
    public void testThatTotalPaymentsCanBeCalculated(){
        loan2.setAnnualInterest(2.5);
        loan2.setNumberOfYears(5);
        loan2.setLoanAmount(1000);
        assertEquals(1080, loan2.getTotalPayment());
    }

}
