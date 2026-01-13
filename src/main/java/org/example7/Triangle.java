package org.example7;

public interface Triangle extends Shape {
    double getSideA();
    double getSideB();
    double getSideC();

    default double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    default double getArea() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }
}

