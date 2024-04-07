import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void plus() {
        Calculator calc = new Calculator();
        double expected = 3;
        double actual = calc.plus(1,2);
        assertEquals(expected, actual, 0.001);
        double expected2 = 6;
        double actual2 = calc.plus(4,2);
        assertEquals(expected2, actual2, 0.001);
        double expected3 = 9;
        double actual3 = calc.plus(3,6);
        assertEquals(expected3, actual3, 0.001);
    }

    @Test
    void umnozh() {
        Calculator calc = new Calculator();
        double expected = 2;
        double actual = calc.umnozh(1,2);
        assertEquals(expected, actual, 0.001);
        double expected2 = 8;
        double actual2 = calc.umnozh(4,2);
        assertEquals(expected2, actual2, 0.001);
        double expected3 = 18;
        double actual3 = calc.umnozh(3,6);
        assertEquals(expected3, actual3, 0.001);
    }

    @Test
    void delen() {
        Calculator calc = new Calculator();
        double expected = 0.5;
        double actual = calc.delen(1,2);
        assertEquals(expected, actual, 0.001);
        double expected2 = 2;
        double actual2 = calc.delen(4,2);
        assertEquals(expected2, actual2, 0.001);
        double expected3 = 0.5;
        double actual3 = calc.delen(3,6);
        assertEquals(expected3, actual3, 0.001);
    }

    @Test
    void minus() {
        Calculator calc = new Calculator();
        double expected = -1;
        double actual = calc.minus(1,2);
        assertEquals(expected, actual, 0.001);
        double expected2 = 2;
        double actual2 = calc.minus(4,2);
        assertEquals(expected2, actual2, 0.001);
        double expected3 = -3;
        double actual3 = calc.minus(3,6);
        assertEquals(expected3, actual3, 0.001);
    }
}