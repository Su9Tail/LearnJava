package com.cdtxz.learn;

/**
 * Created by Kals on 2016/2/23.
 */
public class Calculator {
    private double firstNumber;
    private char operator;
    private double secondNumber;
    private double result;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void calculate() {
        switch (operator) {
            case '+':
                setResult(firstNumber + secondNumber);
                break;
            case '-':
                setResult(firstNumber - secondNumber);
                break;
            case '*':
                setResult(firstNumber * secondNumber);
                break;
            case '/':
                setResult(firstNumber / secondNumber);
                break;
            default:
                break;
        }
    }
}
