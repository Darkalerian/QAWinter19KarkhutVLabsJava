package com.company.model;

public class Shape {

    private String color;

    Shape(){}

    @Override
    public String toString() {
        return "ClassName =  " + getClass().getSimpleName();
    }

    public double calcArea (){

        return 0.0;
    }
}
