package Factory;

public class Rectangle implements Shape{

    private String color;
    @Override
    public void draw() {
        System.out.println("Draw a rectangle.");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
