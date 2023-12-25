package code.example;

public class Function2 implements Argumentable {
    private double a,b, lowerBound, upperBound;
    public Function2(double a, double b, double lowerBound, double upperBound){
        this.a = a;
        this.b = b;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public double calculate(double x) {
        return this.a * Math.sin(this.b * x);
    }
    @Override
    public double getLowerBound(){
        return lowerBound;
    }
    @Override
    public double getUpperBound(){
        return upperBound;
    }
}
