package com.javalab.karkhut;

//This class builds complex figures from single modules
class CustomDrawer {
    //upPosition is true when your triangle is upward
    private boolean upPosition;

    void myCustomDrawer(int i) {
        switch (i) {
            case 1:
                i = 1;
                this.upPosition = true;
                this.drawWholeFigure(i);
                break;
            case 2:
                i = 10;
                this.upPosition = false;
                this.drawWholeFigure(i);
                break;
            case 3:
                i = 10;
                this.upPosition = false;
                this.drawWholeFigureWithSpace(i);
                break;
            case 4:
                i = 1;
                this.upPosition = true;
                this.drawWholeFigureWithSpace(i);
                break;
            case 5:
                this.drawPyramid();
                break;
            default:
                System.out.println("Invalid value");
        }
    }

    private void drawWholeFigure(int i) {
        if (upPosition) {
            while (i < 10) {
                TemplateDrawer.printStars(i);
                System.out.println();
                i++;
            }
        } else while (i > 0) {
            TemplateDrawer.printStars(i);
            System.out.println();
            i--;
        }
    }

    private void drawWholeFigureWithSpace(int i) {
        if (upPosition) {
            while (i < 10) {
                TemplateDrawer.printSpaces(i);
                TemplateDrawer.printStars(i);
                System.out.println();
                i++;
            }
        } else while (i > 0) {
            TemplateDrawer.printSpaces(i);
            TemplateDrawer.printStars(i);
            System.out.println();
            i--;
        }
    }

    private void drawPyramid() {
        int i = 10;
        while (i > 0) {
            int j = 0;
            int f = 0;
            while (j < i) {
                System.out.print("  ");
                j++;
            }
            while ((f - 1) < 2 * (10 - i)) {
                System.out.print("* ");
                f++;
            }
            System.out.println();
            i--;
        }


    }
}
