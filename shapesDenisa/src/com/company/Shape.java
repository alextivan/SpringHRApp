package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public abstract class Shape implements IShapeOperations{

    protected String name;
    protected ShapeType type;
    protected int a;
    protected int b;
    protected int c;

    public Shape(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape(){

       // System.out.println("Parents constructor");
    }

    public Shape(String name, int a, int b) throws OutOfRangeException{
        if(a<0 || b<0 ){
            throw new OutOfRangeException();
        }
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public Shape(String name, int a) {
      // if(a<0 || b<0 ){
      //     throw new OutOfRangeException();
      // }
        this.name = name;
        this.a = a;
    }

    public Shape (String name, ShapeType shapeType, int a, int b, int c) throws OutOfRangeException {
        this(a, b, c);

        if(a<0 || b<0 || c<0){
            throw new OutOfRangeException();
        }

        this.name = name;
        this.type = shapeType;
    }

public ShapeType getType() {
        return this.type;
}
public void setType(ShapeType customType){
        this.type = customType;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString(){
        return "Shape " + name  + " is of type: " + type;
    }


}
