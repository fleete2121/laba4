package code.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    @Test
    public void calculate() {
        Argumentable solve = new Function(2,3,1,4);
        double actual = solve.calculate(1);
        double expected = 5;
        assertEquals(expected, actual, 0);
    }
}