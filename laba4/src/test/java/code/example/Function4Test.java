package code.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Function4Test {

    @Test
    public void calculate() {
        Argumentable solve = new Function4(2,3,4,5);
        double actual = solve.calculate(1);
        double expected = 8.43656365691809;
        assertEquals(expected, actual, 0);
    }
}