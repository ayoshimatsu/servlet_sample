package com.sample_webAppDao;

import com.sample_webAppModel.Account;
import com.sample_webAppModel.Login;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

public class AccountDAO {

    public Account findByLogin(Login aLogin) {
        Account account = null;
        Connection connection = null;
        try {
            Context context = new InitialContext();
            DataSource ds = (DataSource)context.lookup("java:comp/env/testSample");
            connection = ds.getConnection();
            System.out.println("con: " + connection);

            String sql = "SELECT USER_ID, PASS, MAIL, NAME, AGE FROM account WHERE USER_ID = ? AND PASS = ?";
            PreparedStatement pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, aLogin.getUserId());
            pStmt.setString(2, aLogin.getPass());
            ResultSet rs = pStmt.executeQuery();

            if (rs.next()) {
                String userId = rs.getString("USER_ID");
                String pass = rs.getString("PASS");
                String mail = rs.getString("MAIL");
                String name = rs.getString("NAME");
                int age = rs.getInt("AGE");
                account = new Account(userId, pass, mail, name, age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } catch (NamingException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if(connection != null) { connection.close(); }
            } catch (Exception e) {}
        }
        return account;
    }
}
