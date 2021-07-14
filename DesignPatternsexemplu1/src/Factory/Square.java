package Factory;

public class Square implements Shape{

    private String color;
    @Override
    public void draw() {
        System.out.println("Draw a Square.");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
