package code.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Function2Test {

    @Test
    public void calculate() {
        Argumentable solve = new Function2(2,3,1,4);
        double actual = solve.calculate(1);
        double expected = 0.2822400161197344;
        assertEquals(expected, actual, 0);
    }
}