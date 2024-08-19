package rikkei.academy;

public class Main3 {
    public static void main(String[] args) {
        Shape3 rectangle = new Rectangle2("Red", 4, 5);
        Shape3 circle = new Circle2("Blue", 3);

        rectangle.display();
        System.out.println("Area: " + rectangle.getArea());

        circle.display();
        System.out.println("Area: " + circle.getArea());
    }
}
