package code.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegralFuncTest {

    @Test
    public void calculateFunc() {
        Function lineFunction = new Function(0, 1, 1, 5);
        IntegralFunc<Function> integralFunctional = new IntegralFunc<>(1, 5);
        double expectedResIntegral =  4;
        double actualResIngeral = integralFunctional.calculateFunc(lineFunction);
        assertEquals(expectedResIntegral, actualResIngeral, 0.01);

    }
}