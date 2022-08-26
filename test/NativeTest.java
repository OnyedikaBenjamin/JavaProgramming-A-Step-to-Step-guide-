import Others.Native;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NativeTest {
    Native unicorns;

    @BeforeEach
     void setUp() {
        unicorns= new Native();
    }

    @Test
    public void CohortIdTest(){
      unicorns.setCohortId(34);
      assertEquals(0, unicorns.getCohortId());
    }
}
// TODO :  more implementations on my main class and an all round testing