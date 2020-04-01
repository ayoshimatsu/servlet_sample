package com.sample_webAppModel;

public class Account {
    private String oUserId;
    private String oPass;
    private String oMail;
    private String oName;
    private int oAge;

    public Account(String aUserId, String aPass, String aMail, String aName, int aAge) {
        oUserId = aUserId;
        oPass = aPass;
        oMail = aMail;
        oName = aName;
        oAge = aAge;
    }

    public String getUserId() { return oUserId; }
    public String getPass() { return oPass; }
    public String getMail() { return oMail; }
    public String getName() { return oName; }
    public int getAge() { return oAge; }
}
