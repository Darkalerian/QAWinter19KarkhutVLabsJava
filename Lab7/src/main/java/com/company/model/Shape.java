package com.company.model;

public class Shape {

    private String color;
    private static final String DEFAULT_COLOR = "Red";

    Shape(){
            this(DEFAULT_COLOR);
    }

    Shape(String color) {
        if (color!=null) {
            this.color = color;}
            else this.color = DEFAULT_COLOR;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ClassName =  " + getClass().getSimpleName() + " Color: "+this.color;
    }

    public double calcArea (){

        return 0.0;
    }
}
