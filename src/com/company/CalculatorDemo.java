package com.company;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator rectangleArea = new Calculator();

        int recArea = rectangleArea.calculateArea(3,7);

        System.out.println(recArea);

    }
}
