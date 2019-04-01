package com.company.model;

public class Rectangle extends Shape {


    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "ClassName = " + getClass().getSimpleName() + ": "  + "Width = " + width + ": " +
               "Height = " + height + ": " + "Area = " +  calcArea()  + "; \n";
    }

    public double calcArea(){

        return  width * height;
    }
}
