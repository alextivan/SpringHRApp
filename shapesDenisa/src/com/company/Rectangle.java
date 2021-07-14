package com.company;

public class Rectangle extends Shape {


    public Rectangle(String name, int a, int b) throws OutOfRangeException{
        super(name, a, b);
        //   super.name = name;
        //   super.a = a;
        //   super.b = b;
        //   super.c = c;

        super.type = ShapeType.RECTANGLE;
    }

    @Override
    public double computeArea() {
        return a * b;
    }

    @Override
    public double computePerimeter() {
        return 2*a+2*b;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", and has length " + a +
                ", and width " + b + ".";
    }
}
