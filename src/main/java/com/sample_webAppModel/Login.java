package com.sample_webAppModel;

public class Login {
    private String oUserId;
    private String oPass;

    public Login(String aUserId, String aPass) {
        oUserId = aUserId;
        oPass = aPass;
    }
    public String getUserId() { return oUserId; }
    public String getPass() { return oPass; }
}
