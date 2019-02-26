package com.javalab.karkhut;

class TriangleHandler {
    int choice;
    TriangleDrawer myDrawer;

     TriangleHandler(int choice) {
        this.choice = choice;
        this.myDrawer = new TriangleDrawer();
    }

    void drawChoosenTriangle(){
        switch (choice){
            case 1:
                myDrawer.drawTriangle();
                myDrawer.drawTriangle2();
                break;
            case 2:
                myDrawer.drawTriangle3();
                break;
            case 3:
                myDrawer.drawTriangle4();
                break;
            case 4:
                myDrawer.drawTriangle4();
                myDrawer.drawTriangle3();
                break;
            case 5:
                myDrawer.drawTriangle5();
                myDrawer.drawTriangle5();
                default:
                    System.out.println(" Choose number from 1 to 5! ");

        }
    }
}
