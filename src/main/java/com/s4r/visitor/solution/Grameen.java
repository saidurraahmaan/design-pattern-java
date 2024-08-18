package com.s4r.visitor.solution;

public class Grameen implements Modem {
    @Override
    public void Connect() {

    }

    @Override
    public void Disconnect() {

    }

    @Override
    public void Accept(ModemVisitor modemVisitor) {
        modemVisitor.Visit(this);
    }
}
