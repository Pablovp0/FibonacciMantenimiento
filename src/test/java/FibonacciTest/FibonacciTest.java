package FibonacciTest;

import Fibonacci.Fibonacci;
import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    public void setUp(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void testNumber0() {
        int expectedResult = 0;

        assertEquals(expectedResult, fibonacci.compute(0));
    }

    @Test
    public void testNumber1() {
        int expectedResult = 1;

        assertEquals(expectedResult, fibonacci.compute(1));
    }

    @Test
    public void testNumber2() {
        int expectedResult = 1;

        assertEquals(expectedResult, fibonacci.compute(2));
    }

    @Test
    public void testNumber3() {
        int expectedResult = 2;

        assertEquals(expectedResult, fibonacci.compute(3));
    }

    @Test
    public void testNumber4() {
        int expectedResult = 3;

        assertEquals(expectedResult, fibonacci.compute(4));
    }

    @Test
    public void testNumber5() {
        int expectedResult = 5;

        assertEquals(expectedResult, fibonacci.compute(5));
    }

    @Test
    public void testNumber6() {
        int expectedResult = 8;

        assertEquals(expectedResult, fibonacci.compute(6));
    }

    @Test
    public void testNumber7() {
        int expectedResult =13;

        assertEquals(expectedResult, fibonacci.compute(7));
    }

    @Test
    public void testNumber8() {
        int expectedResult = 21;

        assertEquals(expectedResult, fibonacci.compute(8));
    }

}
