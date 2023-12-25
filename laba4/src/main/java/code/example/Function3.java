package code.example;

public class Function3 implements Argumentable{
    private double a,b,c,d, lowerBound, upperBound;
    public Function3(double a, double b,double c,double d, double lowerBound, double upperBound){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public double calculate(double x) {
        return (this.a * x + this.b)/(this.c * x + this.d);
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
