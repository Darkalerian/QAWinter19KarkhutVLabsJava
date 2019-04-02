package com.company.model;

public class Circle extends Shape{

    private double radius;
    private static final double DEFAULT_RADIUS = 10.0;

    public Circle() {
        this(DEFAULT_RADIUS);
    }

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else this.radius = DEFAULT_RADIUS;

    }

    public Circle (String color, double radius){
        super(color);
        if (radius > 0) {
            this.radius = radius;
        } else this.radius = DEFAULT_RADIUS;
    }


    @Override
    public String toString() {
        return "ClassName = " + getClass().getSimpleName() + " Color: "+this.getColor() + " Radius = " + radius + ": " +
                "Area = " + calcArea()  + "; \n";
    }

    public double calcArea(){

        return  radius * radius * Math.PI;
    }
}
