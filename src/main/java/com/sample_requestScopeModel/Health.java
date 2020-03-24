package com.sample_requestScopeModel;

import java.io.Serializable;

public class Health implements Serializable {
    private double oHeight, oWeight, oBmi;
    private String oBodyType;

    public Health() {}

    public double getHeight() { return oHeight; }
    public double getWeight() { return oWeight; }
    public double getBmi() { return oBmi; }
    public String getBodyType() { return oBodyType; }

    public void setHeight(double aHeight) { oHeight = aHeight; }
    public void setWeight(double aWeight) { oWeight = aWeight; }
    public void setBmi(double aBmi) { oBmi = aBmi; }
    public void setBodyType(String aBodyType) { oBodyType = aBodyType; }
}
