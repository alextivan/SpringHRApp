package Factory;

public class Circle implements Shape{
private String color;
    @Override
    public void draw() {
        System.out.println("Draw a circle.");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
