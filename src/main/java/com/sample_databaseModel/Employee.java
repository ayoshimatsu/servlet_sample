package com.sample_databaseModel;

public class Employee {
    private String oId;
    private String oName;
    private int oAge;

    public Employee(String aId, String aName, int aAge) {
        oId = aId;
        oName = aName;
        oAge = aAge;
    }

    public String getId() { return oId; }
    public String getName() { return oName; }
    public int getAge() { return oAge; }
}
