package code.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadEquationTest {

    @Test
    public void solveEquation() {
        QuadEquation equation1 = new QuadEquation(1, -3, 2);
        double[] actual = equation1.SolveEquation();
        double[] expected = {2,1};
        assertArrayEquals(expected,actual , 0);

        QuadEquation equation2 = new QuadEquation(1, -2, 1);
        double[] actual2 = equation2.SolveEquation();
        double[] expected2 = {1};
        assertArrayEquals(expected2, actual2, 0);

        QuadEquation equation3 = new QuadEquation(1, 1, 1);
        double[] actual3 = equation3.SolveEquation();
        double[] expected3 = {};
        assertArrayEquals(expected3,actual3, 0);
    }
}