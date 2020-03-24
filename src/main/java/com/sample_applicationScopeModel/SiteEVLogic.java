package com.sample_applicationScopeModel;

public class SiteEVLogic {
    public void like(SiteEV aSite) {
        int count = aSite.getLike();
        aSite.setLike(count + 1);
    }
    public void dislike(SiteEV aSite) {
        int count = aSite.getDislike();
        aSite.setDislike(count + 1);
    }
}
