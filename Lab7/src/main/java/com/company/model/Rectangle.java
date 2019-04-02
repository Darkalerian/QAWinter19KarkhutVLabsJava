package com.company.model;

public class Rectangle extends Shape {


    private double width;
    private double height;
    private static final double DEFAULT_SIZE = 10.0;

    public Rectangle() {
        this (DEFAULT_SIZE, DEFAULT_SIZE);
    }

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0){
            this.width = DEFAULT_SIZE;
            this.height =DEFAULT_SIZE;
        } else {
            this.width = width;
            this.height = height;}
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        if (width <= 0 || height <= 0){
            this.width = DEFAULT_SIZE;
            this.height =DEFAULT_SIZE;
        } else {
            this.width = width;
            this.height = height;}
    }

    @Override
    public String toString() {
        return "ClassName = " + getClass().getSimpleName() + " Color: "+this.getColor()  + " Width = " + width + ": " +
               "Height = " + height + ": " + "Area = " +  calcArea()  + "; \n";
    }

    public double calcArea(){

        return  width * height;
    }
}
