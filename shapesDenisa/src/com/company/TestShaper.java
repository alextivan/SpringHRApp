package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestShaper {
    public static void main(String[] args) {

        try {
            Rectangle rectangle1 = new Rectangle("rectangle1", 13, 12);
            Rectangle rectangle2 = new Rectangle("rectangle2", -4, 12);

            Triangle triangle1 = new Triangle("triunghi1", 3, 4, 5);
            Triangle triangle2 = new Triangle("triunghi2", 8, 10, 12);

            Circle circle = new Circle("cerc1", 5);

            Square square = new Square("patrat1", 3);

            List<Shape> shapesArreyList = new ArrayList<>();
            List<Shape> shapesLinkedList = new LinkedList<>();

            shapesArreyList.add(rectangle1);
            shapesArreyList.add(rectangle2);
            shapesArreyList.add(triangle1);
            shapesArreyList.add(triangle2);
            shapesArreyList.add(circle);
            shapesArreyList.add(square);

           // shapesArreyList.remove(2);

            for (Shape shape : shapesArreyList) {
                System.out.println(shape.toString() + " Perimeter: " +
                        shape.computePerimeter() + " Area: " + shape.computeArea());
            }


            System.out.println(rectangle1);

            System.out.println("Perimetrul este: " + rectangle1.computePerimeter());
            System.out.println("Aria este: " + rectangle1.computeArea());


        } catch (OutOfRangeException myException) {
            System.out.println(myException);
        } finally {
            System.out.println("I am finally here!");
        }

    }
}