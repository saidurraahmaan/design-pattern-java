package com.s4r.visitor.solution;

public interface Modem {
    void Connect();

    void Disconnect();

    void Accept(ModemVisitor modemVisitor);
}
