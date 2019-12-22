package com.pluralsight.calcengine;

public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';

    MathCommand command;
    double leftVal;
    double rightVal;
    double result;

    public void process(String statement) {
        String[] parts = statement.split(" ");
        String commandString = parts[0];
        this.leftVal = Double.parseDouble(parts[1]);
        this.rightVal = Double.parseDouble(parts[2]);

        setCommandFromString(commandString);

        CalculateBase calculator = null;
        switch (command) {
            case Add:
                calculator = new Adder(leftVal, rightVal);
                break;
            case Subtract:
                calculator = new Subtracter(leftVal, rightVal);
                break;
            case Multiply:
                calculator = new Multiplier(leftVal, rightVal);
                break;
            case Divide:
                calculator = new Divider(leftVal, rightVal);
                break;
        }

        calculator.calculate();
        this.result = calculator.getResult();
    }

    private void setCommandFromString(String commandString) {
        if (commandString.equalsIgnoreCase(MathCommand.Add.toString())) {
            this.command = MathCommand.Add;
        } else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString())) {
            this.command = MathCommand.Subtract;
        } else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString())) {
            this.command = MathCommand.Multiply;
        } else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString())) {
            this.command = MathCommand.Divide;
        }
    }

    @Override
    public String toString() {
        char symbol = ' ';

        switch(this.command) {
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(this.leftVal);
        sb.append(" ");
        sb.append(symbol);
        sb.append(" ");
        sb.append(this.rightVal);
        sb.append(" + ");
        sb.append(this.result);

        return sb.toString();
    }
}
