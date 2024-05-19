package com.s4r.builder;

public class TestBuilder {
    public static void implementBuilder() {
        var employee = new Employee.EmployeeBuilder("Saidur", "DSi");
        System.out.println(employee.build().toString());
    }
}
