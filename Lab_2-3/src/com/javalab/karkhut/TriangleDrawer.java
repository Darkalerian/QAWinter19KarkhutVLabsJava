package com.javalab.karkhut;

class TriangleDrawer {
    void drawTriangle() {

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void drawTriangle2() {

        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void drawTriangle3() {

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 10; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void drawTriangle4() {

        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 10; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    void drawTriangle5() {

        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 10; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = 9; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
