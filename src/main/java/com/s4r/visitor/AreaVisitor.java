package com.s4r.visitor;

public class AreaVisitor implements Visitor {

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of Rectangle: " + area);
    }
}
