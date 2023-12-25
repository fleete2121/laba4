package org.example;

import code.example.QuadEquation;

public class QuadSolver {
    QuadEquation solver;

    public QuadSolver(double a, double b, double c){
        this.solver = new QuadEquation(a,b,c);
    }

    public double QuadSolv()throws Exception{

        double[] solution = solver.SolveEquation();

        if(solution.length == 0){

            throw new Exception("Корней нет");
        }
        double MaxRoot = solution[0];
        for(int i = 0; i<solution.length; i++){
            if(MaxRoot < solution[i]){
                MaxRoot = solution[i];
            }
        }
        return MaxRoot;
    }
}
