package com.javalab.karkhut;

public class Main {

    public static void main(String[] args) {
	DrawingHandler myHandler = new DrawingHandler();

	//Put number of task into next statement(valid numbers from 1 to 5) to print figures from Task3 1-5
	myHandler.drawFromTemplate(5);

    //Put number of custom triangle(valid numbers from 1 to 5)into arguments to print custom figures (valid values:
        // single argument drawCustomFigure(1)
        // double argument drawCustomFigure(1,1)

	myHandler.drawCustomFigure(1,1);

    }
}
