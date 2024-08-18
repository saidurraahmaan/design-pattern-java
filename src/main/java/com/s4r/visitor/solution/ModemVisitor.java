package com.s4r.visitor.solution;

public interface ModemVisitor {
    void Visit(Grameen grammenModem);

    void Visit(Teletalk teleTalkModem);

    void Visit(Zoom zoomModem);
}
