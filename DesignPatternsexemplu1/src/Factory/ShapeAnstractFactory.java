package Factory;

public class ShapeAnstractFactory {

    ShapeFactory shapeFactory = new ShapeFactory();
    ColorFactory colorFactory = new ColorFactory();

    public Shape createShape(ShapeType, String color){
            Shape shape = shapeFactory.createShape()
        Shape shape = shapeFactory.createShape()


    }
}
