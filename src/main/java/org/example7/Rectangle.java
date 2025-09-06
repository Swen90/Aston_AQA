package org.example7;

public interface Rectangle extends Shape {

    double getWidth();
    double getHeight();

    default double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    default double getArea() {
        return getWidth() * getHeight();
    }
}

