package com.sample_developModel;

import com.sample_developDao.MutterDAO;

public class PostMutterLogic {
    public void execute(Mutter mutter) {
        MutterDAO dao = new MutterDAO();
        dao.create(mutter);
    }
}
