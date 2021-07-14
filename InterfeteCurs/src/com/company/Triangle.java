package com.company;

public class Triangle extends Shape implements ShapeInterface{


    private int latura1;
    private int latura2;
    private int latura3;
    private int h;

    @Override
    public void getName() {
        System.out.println("Ne aflam in clasa Triangle");
    }
    public int getLatura1() {
        return latura1;
    }

    @Override
    public void calculateArea() {
        int area = h * latura2 / 2;
        System.out.println("Triangle area: " + area);
    }

    @Override
    public void calculatePerimeter() {
    int perimeter = latura1 + latura2 + latura3;
        System.out.println("Triangle perimeter: " + perimeter);
    }

    public void setLatura1(int latura1) {
        this.latura1 = latura1;
    }

    public int getLatura2() {
        return latura2;
    }

    public void setLatura2(int latura2) {
        this.latura2 = latura2;
    }

    public int getLatura3() {
        return latura3;
    }

    public void setLatura3(int latura3) {
        this.latura3 = latura3;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

}
