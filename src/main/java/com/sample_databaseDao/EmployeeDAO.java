package com.sample_databaseDao;

import com.sample_databaseModel.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    static final String URL = "jdbc:mysql://localhost/testSample";
    static final String USERNAME = "?";
    static final String PASSWORD = "?";

    public List<Employee> findAll() {
        List<Employee> empList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "SELECT id, name, age FROM employee";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            ResultSet rs = pStmt.executeQuery();

            while (rs.next()) {
                String id = rs.getString("ID");
                String name = rs.getString("NAME");
                int age = rs.getInt("AGE");
                Employee employee = new Employee(id, name, age);
                empList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return empList;
    }
}