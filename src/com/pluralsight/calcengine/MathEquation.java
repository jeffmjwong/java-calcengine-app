package com.pluralsight.calcengine;

public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;

    public MathEquation(double leftVal, double rightVal, char opCode) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.opCode = opCode;
    }

    public void execute() {
        switch (this.opCode) {
            case 'a':
                this.result = this.leftVal + this.rightVal;
                break;
            case 's':
                this.result = this.leftVal - this.rightVal;
                break;
            case 'd':
                this.result = this.rightVal == 0.0d ? 0.0d : this.leftVal / this.rightVal;
                break;
            case 'm':
                this.result = this.leftVal * this.rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode!");
                this.result = 0.0d;
                break;
        }
    }
}
