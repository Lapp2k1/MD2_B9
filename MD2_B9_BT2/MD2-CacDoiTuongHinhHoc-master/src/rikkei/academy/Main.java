package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Shape2[] shapes = new Shape2[4];
        shapes[0] = new Circle2(3.5);
        shapes[1] = new Rectangle2(2.0, 4.0);
        shapes[2] = new Square(5.0);
        shapes[3] = new Square(2.5, "blue", true);

        for (Shape2 shape : shapes) {
            System.out.println("Area: " + getArea(shape));
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            System.out.println();
        }
    }

    public static double getArea(Shape2 shape) {
        if (shape instanceof Circle2) {
            return ((Circle2) shape).getArea();
        } else if (shape instanceof Rectangle2) {
            return ((Rectangle2) shape).getArea();
        }
        return 0;
    }
}
