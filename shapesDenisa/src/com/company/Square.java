package com.company;

public class Square extends Shape{

    public Square (String nume, int latura){
        super.name = nume;
        super.a = latura;
        super.type = ShapeType.SQUARE;
    }
    @Override
    public double computeArea() {
        return a * a;
    }

    @Override
    public double computePerimeter() {
        return 4 * a;
    }
}
