package com.s4r.visitor;

public class Circle implements ShapeVisitor {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
