package Factory;

public class MainFactory {

    public static void main(String[] args){

        //gactory design pattern
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape(ShapeType.CIRCLE);
        circle.draw();
        Shape square = factory.createShape(ShapeType.SQUARE);
        square.draw();

// abstract factory
ShapeAnstractFactory abstract
    }
}
