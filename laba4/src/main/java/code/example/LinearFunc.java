package code.example;

import java.util.function.DoubleUnaryOperator;

public class LinearFunc <T extends  Argumentable> implements Functionable <T>{


    @Override
    public double calculateFunc(T function) {
        double lowerbound = function.getLowerBound();
        double upperbound = function.getUpperBound();
        double middlebound = (lowerbound + upperbound) / 2;
        return function.calculate(lowerbound) + function.calculate(upperbound) + function.calculate(middlebound);
    }
}
