package com.sample_developDao;

import com.sample_developModel.Mutter;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MutterDAO {

    public List<Mutter> findAll() {
        List<Mutter> mutterList = new ArrayList<>();
        Connection connection = null;

        try {
            Context context = new InitialContext();
            DataSource ds = (DataSource)context.lookup("java:comp/env/testSample");
            connection = ds.getConnection();
            String sql = "SELECT id, name, text FROM mutter ORDER BY id DESC";
            PreparedStatement pStmt = connection.prepareStatement(sql);
            ResultSet rs = pStmt.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                String userName = rs.getString("name");
                String text = rs.getString("text");
                Mutter mutter = new Mutter(id, userName, text);
                mutterList.add(mutter);
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
        return mutterList;
    }

    public boolean create(Mutter aMutter) {
        Connection connection = null;

        try {
            Context context = new InitialContext();
            DataSource ds = (DataSource)context.lookup("java:comp/env/testSample");
            connection = ds.getConnection();
            String sql = "INSERT INTO mutter(name, text) VALUES(?, ?)";
            PreparedStatement pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, aMutter.getUserName());
            pStmt.setString(2, aMutter.getText());

            int result = pStmt.executeUpdate();
            if (result != 1) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (NamingException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if(connection != null) { connection.close(); }
            } catch (Exception e) {}
        }
        return true;
    }
}
