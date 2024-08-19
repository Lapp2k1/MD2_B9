package rikkei.academy;

public class Rectangle2 extends Shape3 {
    private double width;
    private double height;

    public Rectangle2(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
