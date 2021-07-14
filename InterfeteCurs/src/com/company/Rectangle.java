package com.company;

public class Rectangle extends Shape implements ShapeInterface{

    private int width;
    private int height;

    @Override
    public void getName() {
        System.out.println("Ne aflam in clasa Rectangle");
    }

    @Override
    public void calculateArea() {
        int area = width * height;
        System.out.println("Rectangle area: " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 2 * width + 2 * height;
        System.out.println("Rectangle perimeter: " + perimeter);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
