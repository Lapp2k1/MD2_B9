package rikkei.academy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(2.0, 4.0);
        shapes[2] = new Square(5.0);

        Random random = new Random();
        for (Shape shape : shapes) {
            System.out.println("Before resize: " + shape + " | Area: " + getArea(shape));
            double percent = 1 + random.nextInt(100);
            if (shape instanceof Resizable) {
                ((Resizable) shape).resize(percent);
            }
            System.out.println("After resize by " + percent + "%: " + shape + " | Area: " + getArea(shape));
            System.out.println();
        }
    }

    public static double getArea(Shape shape) {
        if (shape instanceof Circle) {
            return ((Circle) shape).getArea();
        } else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getArea();
        }
        return 0;
    }
}
