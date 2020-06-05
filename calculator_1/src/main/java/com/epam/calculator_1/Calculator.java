package com.epam.calculator_1;

public class Calculator {

    public int add(int num1,int num2) {
        return num1+num2;
    }

    public int multiply(int num1,int num2) {
        return num1*num2;
    }

    public int subtract(int num1,int num2) {
        return num1-num2;
    }

    public float divide(int num1,int num2) throws ArithmeticException {
        return num1/num2;
    }
}