import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {
    int negativeValue_1 = -10;
    int negativeValue_2 = -5;
    int positiveValue_1 = 9;
    int positiveValue_2 = 3;

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        int result = 12;
        assertEquals(String.format("%s + %s must be %s", positiveValue_1, positiveValue_2, result), result, calc.add(positiveValue_1, positiveValue_2));
    }

    @Test
    public void testAddTwoNegativeValues() {
        int result = -15;
        assertEquals(String.format("%s + %s must be %s", negativeValue_1, negativeValue_2, result), result, calc.add(negativeValue_1, negativeValue_2));
    }

    @Test
    public void testSubdivisionTwoValues() {
        int result = -5;
        assertEquals(String.format("%s - %s must be %s", negativeValue_1, negativeValue_2, result), result, calc.subtraction(negativeValue_1, negativeValue_2));
    }

    @Test
    public void testSquareRoot() {
        double result = 3.0;
        assertEquals(String.format("square root of %s must be %s", positiveValue_1, result), result, calc.squareRoot(positiveValue_1));
    }

    @Test
    public void testSquaredNumber() {
        double result = 81.0;
        assertEquals(String.format("%s ^2 must be %s", positiveValue_1, result), result, calc.squaredNumber(positiveValue_1));
    }

    @Test
    public void testDivisionTwoValues() {
        double result = 2.5;
        
        assertEquals(String.format("%s must be %s", positiveValue_1, result), result, calc.division(5, 2));
    }

    @Test
    public void testDivisionByZero() {
        String result = "/ by zero";
        try {
            calc.division(positiveValue_1, 0);
            Assert.fail("No any exception");
        } catch (ArithmeticException e) {
            assertTrue(String.format("Error must contain %s", result), e.getMessage().contains(result));
        } catch (Exception e) {
            Assert.fail("Wrong exception " + e.toString());
        }
    }

    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
