package com.company;

public class Calculator {

    private int width;
    private int length;

    public void setWidth(int calculatorWidth) {
        width = calculatorWidth;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int calculatorLength) {
        length = calculatorLength;
    }

    public int getLength() {
        return length;
    }

    public int calculateArea(int width, int length) {
        int area = width * length;
        return area;
    }

}
