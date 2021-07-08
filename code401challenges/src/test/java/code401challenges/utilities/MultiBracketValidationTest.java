package code401challenges.utilities;

import org.junit.Test;

import static code401challenges.utilities.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiBracketValidationTest {
// HAPPY TEST
    @Test public void allCorrectOrderTest(){
        String input = "{}{Code}[Fellows](())";
        boolean actual = multiBracketValidation(input);
        assertTrue(actual);
    }
// FAIL CASE
    @Test public void failCaseTest(){
        String input = "(";
        boolean actual = multiBracketValidation(input);
        System.out.println(actual);
        assertFalse(actual);
    }
// EDGE CASE
    @Test public void edgeCaseTest(){
        String input = "[({}]";
        boolean actual = multiBracketValidation(input);
        assertFalse(actual);
    }
}
