import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    static Calculate  calculate;
    @BeforeAll
    static void setUp(){
        calculate=new Calculate();
    }
    @Test
    void testAddSum()
    {

        assertEquals(11,calculate.addSum(5,6));
    }
    @Test
    void testisEven()
    {
        assertTrue(calculate.isEven(6));
    }
    @AfterAll
    static void tearDown()
    {
     calculate=null;
    }

}