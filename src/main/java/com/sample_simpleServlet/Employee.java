package com.sample_simpleServlet;

public class Employee {
    private String oId;
    private String oName;

    public Employee(String aId, String aName) {
        oId = aId;
        oName = aName;
    }

    public String getId() {
        return oId;
    }

    public String getName() {
        return oName;
    }
}
