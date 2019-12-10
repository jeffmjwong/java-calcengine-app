package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double val1 = 100.0d;
        double val2 = 25.0d;
        char opCode = 'm';

        System.out.println(calculate(val1, val2, opCode));
    }

    private static double calculate(double val1, double val2, char opCode) {
        if (opCode == 'a') {
            return val1 + val2;
        } else if (opCode == 's') {
            return val1 - val2;
        } else if (opCode == 'd') {
            return val2 == 0.0d ? 0.0d : val1 / val2;
        } else if (opCode == 'm') {
            return val1 * val2;
        } else {
            System.out.println("Error - invalid opCode!");
            return 0.0d;
        }
    }
}
