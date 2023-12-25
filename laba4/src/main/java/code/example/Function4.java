package code.example;

public class Function4 implements Argumentable{
    private double a,b, lowerBound, upperBound;
    public Function4(double a, double b, double lowerBound, double upperBound){
        this.a = a;
        this.b = b;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public double calculate(double x) {
        return this.a * Math.exp(x) + this.b;
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


