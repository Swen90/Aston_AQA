package org.example7;

public class Main {
    public static void main(String[] args) {
        Circle circle = new CircleImpl(5, "Red", "White");
        Rectangle rectangle = new RectangleImpl(4, 6, "Blue", "Yellow");
        Triangle triangle = new TriangleImpl(3, 4, 5, "Green", "Gray");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    private static void printShapeInfo(Shape shape) {
        double perimeter = 0;
        double area = 0;

        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            perimeter = c.getPerimeter();
            area = c.getArea();
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            perimeter = r.getPerimeter();
            area = r.getArea();
        } else if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            perimeter = t.getPerimeter();
            area = t.getArea();
        }

        System.out.println("Фигура: " + shape.getClass().getSimpleName());
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площадь: " + area);
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println();
    }
}
