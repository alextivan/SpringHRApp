package com.company;

public class Circle extends Shape implements ShapeInterface{

    private int radius;

    @Override
    public void getName() {
        System.out.println("Ne aflam in clasa Circle");
        //System.out.println(circle.);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void calculateArea() {
        double area = radius * radius * Math.PI;
        System.out.println("Circle area: " + area);
    }

    @Override
    public void calculatePerimeter() {
    double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter is: " + perimeter);
    }

    public void setRadius(int radius) {
        if(radius>0)
        this.radius = radius;
    }
}
