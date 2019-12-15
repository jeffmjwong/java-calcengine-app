package com.pluralsight.calcengine;

public class CalculateBase {
    private double leftVal;
    private double rightVal;
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
    public double getResult() {
        return this.result;
    }

    public CalculateBase() {}

    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
}
