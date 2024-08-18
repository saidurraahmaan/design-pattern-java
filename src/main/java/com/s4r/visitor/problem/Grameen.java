package com.s4r.visitor.problem;


public class Grameen implements Modem {
    @Override
    public void Connect() {
        System.out.println("Grameen Modem Successfully connected");
    }

    @Override
    public void Disconnect() {
        System.out.println("Grameen Modem Successfully disconnected");
    }

    @Override
    public void ConfigureForUnix() {

    }

}
