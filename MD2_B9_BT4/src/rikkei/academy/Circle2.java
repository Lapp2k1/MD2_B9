
package rikkei.academy;

public class Circle2 extends Shape3 {
    private double radius;

    public Circle2(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Radius: " + radius);
    }
}
