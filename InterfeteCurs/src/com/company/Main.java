package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Rectangle rectangle = new Rectangle();
    rectangle.setWidth(10);
    rectangle.setHeight(4);
    rectangle.calculateArea();
    rectangle.calculatePerimeter();

    Sqare square = new Sqare();
    square.setWidth(12);
    square.calculateArea();
    square.calculatePerimeter();

    Circle circle = new Circle();
    circle.setRadius(10);
    circle.calculateArea();
    circle.calculatePerimeter();

    Triangle triangle =  new Triangle();
    triangle.setH(3);
    triangle.setLatura1(3);
    triangle.setLatura1(4);
    triangle.setLatura3(5);
    triangle.calculateArea();
    triangle.calculatePerimeter();
    
    }
}
