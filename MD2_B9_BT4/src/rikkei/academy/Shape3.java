package rikkei.academy;

public abstract class Shape3 {
    private String color;

    public Shape3(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Color: " + color);
    }

    public abstract double getArea();
}
