package com.sample_webAppModel;

import com.sample_webAppDao.AccountDAO;

public class LoginLogic {
    public boolean execute(Login aLogin) {
        AccountDAO dao = new AccountDAO();
        Account account = dao.findByLogin(aLogin);
        return account != null;
    }
}
