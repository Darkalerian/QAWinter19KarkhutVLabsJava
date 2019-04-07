package com.company.controller;

import com.company.model.Circle;
import com.company.model.Rectangle;
import com.company.model.Shape;
import com.company.model.Triangle;

class AreaSumCalculator {


    static double calcAreaForAllTypes(Shape[] array) {
        double result = 0;
        if (array == null) {
            return 0.0;
        }

        for (Shape index : array) {
            if (index == null) {
                continue;
            }
            result += index.calcArea();
        }
        return result;
    }

    static double calcAreaByTypeTriangle(Shape[] shapes) {
        double sum = 0.0;
        if (shapes == null) {
            return 0.0;
        }
        for (Shape s : shapes) {
            if (s == null) {
                continue;
            }
            if (s instanceof Triangle) {
                sum += s.calcArea();
            }
        }
        return sum;
    }

    static double calcAreaByTypeCircle(Shape[] shapes) {
        double sum = 0.0;
        if (shapes == null) {
            return 0.0;
        }
        for (Shape s : shapes) {
            if (s == null) {
                continue;
            }
            if (s instanceof Circle) {
                sum += s.calcArea();
            }
        }
        return sum;
    }

    static double calcAreaByTypeRectangle(Shape[] shapes) {
        double sum = 0.0;
        if (shapes == null) {
            return 0.0;
        }
        for (Shape s : shapes) {
            if (s == null) {
                continue;
            }
            if (s instanceof Rectangle) {
                sum += s.calcArea();
            }
        }
        return sum;
    }

}
