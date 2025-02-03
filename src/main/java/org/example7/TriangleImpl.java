package org.example7;

public class TriangleImpl implements Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public TriangleImpl(double sideA, double sideB, double sideC,
                        String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getSideA() {
        return sideA;
    }

    @Override
    public double getSideB() {
        return sideB;
    }

    @Override
    public double getSideC() {
        return sideC;
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
