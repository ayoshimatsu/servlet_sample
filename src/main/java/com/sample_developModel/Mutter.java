package com.sample_developModel;

import java.io.Serializable;

public class Mutter implements Serializable {
    private String oUserName;
    private String oText;

    public Mutter() {}
    public Mutter(String aUserName, String aText) {
        oUserName = aUserName;
        oText = aText;
    }

    public String getUserName() { return oUserName; }
    public String getText() { return oText; }
}
