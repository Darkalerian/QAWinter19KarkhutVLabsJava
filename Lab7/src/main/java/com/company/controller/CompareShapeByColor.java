package com.company.controller;

import com.company.model.Shape;

import java.util.Comparator;

public class CompareShapeByColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null || o2 == null || ((Shape) o1).getColor() == null ||
                ((Shape) o2).getColor() == null) {
            return 0;
        }
        if (((Shape) o1).getColor().equalsIgnoreCase(((Shape) o2).getColor())) {
            return 0;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(((Shape) o1).getColor(), ((Shape) o2).getColor());
    }


}
