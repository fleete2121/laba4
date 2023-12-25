package code.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Function3Test {

    @Test
    public void calculate() {
        Argumentable solve = new Function3(2,3,4,5,1,6);
        double actual = solve.calculate(1);
        double expected = 0.5555555555555556;
        assertEquals(expected, actual, 0);
    }
}