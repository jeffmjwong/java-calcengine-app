package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(25.0d, 92.0d, 'a');
        equations[2] = new MathEquation(225.0d, 17.0d, 's');
        equations[3] = new MathEquation(11.0d, 3.0d, 'm');

        for (int i = 0; i < equations.length; i++) {
            equations[i].execute();
            System.out.println(equations[i].result);
        }
    }

    private static double calculate(double leftVal, double rightVal, char opCode) {
        switch (opCode) {
            case 'a':
                return leftVal + rightVal;
            case 's':
                return leftVal - rightVal;
            case 'd':
                return rightVal == 0.0d ? 0.0d : leftVal / rightVal;
            case 'm':
                return leftVal * rightVal;
            default:
                System.out.println("Error - invalid opCode!");
                return 0.0d;
        }
    }
}
