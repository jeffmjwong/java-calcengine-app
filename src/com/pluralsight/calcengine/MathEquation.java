package com.pluralsight.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public double getLeftVal() {
        return this.leftVal;
    }
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() { return this.rightVal;}
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return this.opCode;
    }
    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return this.result;
    }

    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
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

    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.execute();
    }
}
