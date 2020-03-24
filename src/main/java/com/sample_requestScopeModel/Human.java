package com.sample_requestScopeModel;

import java.io.Serializable;

public class Human implements Serializable {
    private String oName;
    private int oAge;

    public Human() {}

    public Human(String aName, int aAge) {
        oName = aName;
        oAge = aAge;
    }

    public String getName() { return oName; }
    public int getAge() { return oAge; }
    public void setName(String aName) { oName = aName; }
    public void setAge(int aAge) { oAge = aAge; }

}
