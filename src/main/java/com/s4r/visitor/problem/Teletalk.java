package com.s4r.visitor.problem;

public class Teletalk implements Modem {
    @Override
    public void Connect() {
        System.out.println("Teletalk Modem Successfully connected");
    }

    @Override
    public void Disconnect() {
        System.out.println("Teletalk Modem Successfully disconnected");
    }

    @Override
    public void ConfigureForUnix() {
        System.out.println("Configure Teletalk Modem For Unix Operating System");
    }
}
