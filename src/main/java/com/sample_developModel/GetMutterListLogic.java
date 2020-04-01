package com.sample_developModel;

import com.sample_developDao.MutterDAO;

import java.util.List;

public class GetMutterListLogic {
    public List<Mutter> execute() {
        MutterDAO dao = new MutterDAO();
        List<Mutter> mutterList = dao.findAll();
        return mutterList;
    }
}
