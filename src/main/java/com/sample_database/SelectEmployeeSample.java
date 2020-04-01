package com.sample_database;

import com.sample_databaseDao.EmployeeDAO;
import com.sample_databaseModel.Employee;

import java.util.List;

public class SelectEmployeeSample {
    public static void main(String[] args) {
        EmployeeDAO empDAO = new EmployeeDAO();
        List<Employee> empList = empDAO.findAll();

        for (Employee emp : empList) {
            System.out.println("ID:" + emp.getId());
            System.out.println("Name:" + emp.getName());
            System.out.println("Age:" + emp.getAge() + "\n");
        }
    }
}
