package lab01.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(5, calculator.divide(5, 1));
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-6, calculator.multiply(-2, 3));
    }
}
