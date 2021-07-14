package com.company;

public class Circle extends Shape{


    public Circle (String nume, int raza){
        super.name = nume;
        super.a = raza;
        super.type = ShapeType.CIRCLE;
    }
    @Override
    public double computeArea() {
        return (Math.PI * a) * (Math.PI * a);
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * a;
    }
}
