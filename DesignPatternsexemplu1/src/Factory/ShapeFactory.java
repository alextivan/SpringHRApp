package Factory;

public class ShapeFactory {

    public Shape createShape(ShapeType shapeType){
        switch (shapeType){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Rectangle();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }


    }


}
