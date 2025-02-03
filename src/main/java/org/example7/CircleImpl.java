package org.example7;

public class CircleImpl implements Circle {
    private double radius;
    private String fillColor;
    private String borderColor;

    public CircleImpl(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
