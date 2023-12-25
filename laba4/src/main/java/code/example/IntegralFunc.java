package code.example;

public class IntegralFunc <T extends  Argumentable> implements Functionable <T>{
    private double a,b;
    public IntegralFunc(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateFunc(T function) {
        double lowerbound = function.getLowerBound();
        double upperbound = function.getUpperBound();
        if (lowerbound > a || upperbound < b){
            throw new IllegalArgumentException("Область выходит за пределы отрезка");
        }
        double interval = (b - a) / 2;
        double integral = 0;
        for(double i = a; i < b; i+=interval){
            integral += function.calculate(i) * interval;
        }
        return integral;
    }

}
