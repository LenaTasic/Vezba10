package com.company;

public class Rectangle extends Shape {

    int a, b;

    @Override
    public void calculateArea() {
        System.out.println("Rectangle Area: " + (a*a));

    }

}
