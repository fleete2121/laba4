package code.example;

import org.junit.Test;

import java.util.function.DoubleUnaryOperator;

import static org.junit.Assert.*;

public class LinearFuncTest {

    @Test
    public void calculate() {
        Function lineFunction = new Function(1, 3, 1 , 5);
        LinearFunc<Function> sumFunctional = new LinearFunc<>();
        double expectedSum = lineFunction.calculate(1) + lineFunction.calculate(5) + lineFunction.calculate(3);
        double actualSum = sumFunctional.calculateFunc(lineFunction);
        assertEquals(expectedSum, actualSum,0);
    }
}