package com.company;

public class Triangle extends Shape {

    public Triangle() {

    }

    public Triangle(String nume, int latura1, int latura2, int latura3) {
        super.name = nume;
        super.a = latura1;
        super.b = latura2;
        super.c = latura3;
        super.type = ShapeType.TRIANGLE;
    }

    @Override
    public double computeArea() {
        return Math.sqrt(SP() * (SP() - a) * (SP() - b) * (SP() - c));
    }

    @Override
    public double computePerimeter() {
        return a + b + c;
    }

    public double SP() {
        return computePerimeter() / 2;
    }
}
