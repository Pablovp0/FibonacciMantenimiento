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

}
