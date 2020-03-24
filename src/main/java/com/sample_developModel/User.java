package com.sample_developModel;

import java.io.Serializable;

public class User implements Serializable {
    private String oName;
    private String oPass;

    public User() {}

    public User(String aName, String aPass) {
        oName = aName;
        oPass = aPass;
    }

    public String getName() { return oName; }
    public String getPass() { return oPass; }
}
