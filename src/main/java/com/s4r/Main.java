package com.s4r;

import com.s4r.visitor.TestVisitor;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Starting builder pattern......................");
//        TestBuilder.implementBuilder();
//        System.out.println("Ending builder pattern......................");

        System.out.println("Starting visitor pattern......................");
        TestVisitor.implementVisitor();
        System.out.println("Ending visitor pattern......................");
    }
}