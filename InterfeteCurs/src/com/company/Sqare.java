package com.company;

public class Sqare extends Shape implements ShapeInterface{

    private int width;

    @Override
    public void getName() {
        System.out.println("Ne aflam in clasa Sqare");
    }

    @Override
    public void calculateArea() {
        int area = width * width;
        System.out.println("Square area: " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 4 * width;
        System.out.println("Square perimeter: " + perimeter);
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width>0)
        this.width = width;
    }
}
