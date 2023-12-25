package code.example;

public class QuadEquation {
    private double a,b,c;
    public QuadEquation(){}
    public QuadEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double[] SolveEquation(){
        double D = (b*b - 4*a*c);
        if(D > 0){
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            return new double[] {x1, x2};
        }
        else if(D==0){
            double x = -b / (2 * a);
            return new double[] {x};
        }
        else{
            return new double[0];
        }
    }
}
