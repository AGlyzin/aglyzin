package ru.job4j.calculator;

public class Calculator {
    private  double result;

    public void add(double first, double second) {
        this.result = first +  second;
    }

    public double getResult() {
        return this.result;
    }

    public void subtract(double first, double second) {
        this.result = first -  second;
    }

    public double getResult1() {
        return this.result;
    }

    public void div(double first, double second) {
        this.result = first / second;
    }

    public double getResult2() {
        return this.result;
    }

    public void multiple(double first, double second) {
        this.result = first *  second;
    }

    public double getResult3() {
        return this.result;
    }
}