package com.sample_sessionScopeModel;

import java.io.Serializable;

public class User implements Serializable {
    private String oId;
    private String oName;
    private String oPass;

    public User() {}

    public User(String aId, String aName, String aPass) {
        oId = aId;
        oName = aName;
        oPass = aPass;
    }

    public String getId() { return oId; }
    public String getName() { return oName; }
    public String getPass() { return oPass; }
}
