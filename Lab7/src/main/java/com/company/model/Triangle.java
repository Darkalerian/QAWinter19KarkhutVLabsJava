package com.company.model;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private static final double DEFAULT_SIZE = 10.0;


    public Triangle() {
        this(DEFAULT_SIZE,DEFAULT_SIZE,DEFAULT_SIZE);
    }

    public Triangle(double a, double b, double c) {
        if (a<=0 || b <= 0 || c <=0){
            this.a = DEFAULT_SIZE;
            this.b = DEFAULT_SIZE;
            this.c = DEFAULT_SIZE;
        } else {this.a = a;
                this.b = b;
                this.c = c;}


    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        if (a<=0 || b <= 0 || c <=0){
            this.a = DEFAULT_SIZE;
            this.b = DEFAULT_SIZE;
            this.c = DEFAULT_SIZE;
        } else {this.a = a;
            this.b = b;
            this.c = c;}


    }

    @Override
    public String toString() {
        return "ClassName =  " + getClass().getSimpleName() + " Color: "+this.getColor()  +
                " Side a = " + a + ": " + "Side b = " + b + ": " +
                "Side c = " + c + ": " + "Area = " + calcArea()  + "; \n";
    }

    public double calcArea(){
        double halfPerimeter = (a + b + c)/2;
        return Math.sqrt( halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
