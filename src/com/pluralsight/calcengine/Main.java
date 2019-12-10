package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double[] leftValues = { 100.0d, 25.0d, 225.0d, 11.0d };
        double[] rightValues = { 50.0d, 92.0d, 17.0d, 3.0d };
        char[] opCodes = { 'd', 'a', 's', 'm' };
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            results[i] = calculate(leftValues[i], rightValues[i], opCodes[i]);
        }

        System.out.println(results[0]);
        System.out.println(results[1]);
        System.out.println(results[2]);
        System.out.println(results[3]);
    }

    private static double calculate(double leftVal, double rightVal, char opCode) {
        if (opCode == 'a') {
            return leftVal + rightVal;
        } else if (opCode == 's') {
            return leftVal - rightVal;
        } else if (opCode == 'd') {
            return rightVal == 0.0d ? 0.0d : leftVal / rightVal;
        } else if (opCode == 'm') {
            return leftVal * rightVal;
        } else {
            System.out.println("Error - invalid opCode!");
            return 0.0d;
        }
    }
}
