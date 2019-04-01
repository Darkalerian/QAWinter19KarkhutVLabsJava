package com.company.model;

public class Circle extends Shape{

    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;

    }


    @Override
    public String toString() {
        return "ClassName = " + getClass().getSimpleName() + ": " + "Radius = " + radius + ": " +
                "Area = " + calcArea()  + "; \n";
    }

    public double calcArea(){

        return  radius * radius * Math.PI;
    }
}
