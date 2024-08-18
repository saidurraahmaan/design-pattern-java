package com.s4r.visitor.problem;

public class Zoom implements Modem {
    @Override
    public void Connect() {
        System.out.println("Zoom Modem Successfully connected");
    }

    @Override
    public void Disconnect() {
        System.out.println("Zoom Modem Successfully disconnected");
    }

    @Override
    public void ConfigureForUnix() {
        System.out.println("Configure Zoom Modem For Unix Operating System");
    }
}