import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    static StringManipulation stringManipulation;
    @BeforeAll
    static void setUp()
    {
        stringManipulation=new StringManipulation();
    }
    @Test
    void testVowelCount()
    {
        assertEquals(6,stringManipulation.vowelCount("Bharat mata ki jay"));
    }

    @Test
    void testCharacterCount()
    {
        assertEquals(15,stringManipulation.characterCount("Bharat mata ki jay"));
    }
    @AfterAll
    static void tearDown()
    {
        stringManipulation=null;
    }

}