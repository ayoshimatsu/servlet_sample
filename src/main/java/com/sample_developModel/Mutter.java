package com.sample_developModel;

import java.io.Serializable;

public class Mutter implements Serializable {
    private int oId;
    private String oUserName;
    private String oText;

    public Mutter() {}
    public Mutter(String aUserName, String aText) {
        oUserName = aUserName;
        oText = aText;
    }

    //For database
    public Mutter(int aId, String aUserName, String aText) {
        oId = aId;
        oUserName = aUserName;
        oText = aText;
    }

    public int getId() {return oId; }
    public String getUserName() { return oUserName; }
    public String getText() { return oText; }
}
