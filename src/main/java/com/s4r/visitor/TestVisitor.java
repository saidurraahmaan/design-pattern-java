package com.s4r.visitor;

public class TestVisitor {
    public static void implementVisitor() {
        ShapeVisitor circle = new Circle(5);
        ShapeVisitor rectangle = new Rectangle(4, 6);

        Visitor areaVisitor = new AreaVisitor();
        Visitor perimeterVisitor = new PerimeterVisitor();

        // Calculate and print areas
        circle.accept(areaVisitor);
        rectangle.accept(areaVisitor);

        // Calculate and print perimeters
        circle.accept(perimeterVisitor);
        rectangle.accept(perimeterVisitor);
    }
}
