package org.example;

import code.example.QuadEquation;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadSolverTest {

    @Test
    public void quadSolv() {
        QuadSolver solver = new QuadSolver(1,-3,2);

        double actual3 = 0;
        try {
            actual3 = solver.QuadSolv();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double expected3 = 2;
        assertEquals(expected3,actual3,0);
    }
    @Test(expected = Exception.class)
    public void quadSolv2(){
        QuadSolver solver = new QuadSolver(1,1,1);

        double actual3 = 0;
        try {
            actual3 = solver.QuadSolv();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double expected3 = 0;

    }
}