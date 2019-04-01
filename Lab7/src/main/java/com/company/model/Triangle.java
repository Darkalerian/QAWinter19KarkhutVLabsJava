package com.company.model;

public class Triangle extends Shape {

    double a;
    double b;
    double c;


    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "ClassName =  " + getClass().getSimpleName() + ": "  +
                "Side a = " + a + ": " + "Side b = " + b + ": " +
                "Side c = " + c + ": " + "Area = " + calcArea()  + "; \n";
    }

    public double calcArea(){
        double halfPerimeter = (a + b + c)/2;
        return Math.sqrt( halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
