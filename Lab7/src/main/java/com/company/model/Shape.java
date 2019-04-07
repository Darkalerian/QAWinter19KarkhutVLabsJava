package com.company.model;

import com.company.view.Drawable;

public abstract class Shape implements Drawable {

    private String color;
    private static final String DEFAULT_COLOR = "Red";

    Shape() {
        this(DEFAULT_COLOR);
    }

    Shape(String color) {
        if (color != null) {
            this.color = color;
        } else this.color = DEFAULT_COLOR;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ClassName =  " + getClass().getSimpleName() + " Color: " + this.color;
    }

    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.println(this + " area " + this.calcArea());
    }
}
