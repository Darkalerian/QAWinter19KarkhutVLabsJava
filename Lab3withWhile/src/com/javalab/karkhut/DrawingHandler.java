package com.javalab.karkhut;

//This class constructs sets of figures from modules
class DrawingHandler {
    private CustomDrawer myDrawer = new CustomDrawer();
    //This method prints default figures from Task 3
    void drawFromTemplate(int c){
        switch (c){
            case 1 :    myDrawer.myCustomDrawer(1);
                        myDrawer.myCustomDrawer(2);
                        break;
            case 2 :    myDrawer.myCustomDrawer(3);
                        break;
            case 3 :    myDrawer.myCustomDrawer(4);
                        break;
            case 4 :    myDrawer.myCustomDrawer(4);
                        myDrawer.myCustomDrawer(3);
                        break;
            case 5 :    myDrawer.myCustomDrawer(5);
                        myDrawer.myCustomDrawer(5);
                        break;
            default:
                    System.out.println("Invalid value");

        }
    }
//This methods can print custom figure from particular blocks
    //possible numbers of blocks 1-5
    //custom figure can contain 1 or 2 blocks

    void drawCustomFigure(int a){
        myDrawer.myCustomDrawer(a);
    }
    void drawCustomFigure(int a, int b){
        myDrawer.myCustomDrawer(a);
        myDrawer.myCustomDrawer(b);
    }

}
