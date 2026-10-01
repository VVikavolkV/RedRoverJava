package lesson11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void shouldDoubleNumber() {
        Calculator calculator = new Calculator();

        int actual = calculator.doubleNumber(3);

        Assert.assertEquals(actual, 6);
    }

    @Test
    public void shouldReturnZeroForZero() {
        Calculator calculator = new Calculator();

        int actual = calculator.doubleNumber(0);

        Assert.assertEquals(actual, 0);
    }

    @Test
    public void shouldDoubleNegativeNumber() {
        Calculator calculator = new Calculator();

        int actual = calculator.doubleNumber(-2);

        Assert.assertEquals(actual, -4);
    }

    @Test
    public void doublesNegativeNumber() {
        Calculator calculator = new Calculator();

        int actual = calculator.doubleNumber(-4);

        Assert.assertEquals(actual, -8);
    }




}