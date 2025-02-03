package org.example7;

public interface Circle extends Shape {

    double getRadius();

    default double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    default double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
