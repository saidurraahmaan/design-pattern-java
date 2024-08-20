package com.s4r.visitor;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
