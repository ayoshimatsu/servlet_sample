package com.sample_applicationScopeModel;

import java.io.Serializable;

public class SiteEV implements Serializable {
    private int oLike;
    private int oDislike;

    public SiteEV() {}
    public SiteEV(int aLike, int aDislike) {
        oLike = aLike;
        oDislike = aDislike;
    }

    public int getLike() { return oLike; }
    public int getDislike() { return oDislike; }
    public void setLike(int aLike) { oLike = aLike; }
    public void setDislike(int aDislike) { oDislike = aDislike; }

}
