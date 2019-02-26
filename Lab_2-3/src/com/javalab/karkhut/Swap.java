package com.javalab.karkhut;

class Swap {
    private int a;
    private int b;

    Swap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void swapTwoVariable() {
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("Now your a = " + a + " and  b = " + b);
    }
}
