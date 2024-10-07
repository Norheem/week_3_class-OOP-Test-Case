package classActivity7A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addTwoPlusTwoShouldBeFour() {

        SimpleCalculator calculator = new SimpleCalculator();

        int actual = calculator.add(2, 2);

        assertEquals(4, actual);
    }

    @Test
    void itShouldPrintHelloWorld() {

        SimpleCalculator name = new SimpleCalculator();

        String actual = name.hello();

        String expected = "Hello World";

        assertEquals(expected, actual);
    }
}