package com.assetManagment.assetManagement.services;

import com.assetManagment.assetManagement.entities.Employee;

import java.util.List;

/**
 * An Interface to declare Method of Employee Service
 */
public interface EmployeeService {
    /**
     * This Method is used to get the list of all employees
     * @return list of all employees
     */
    public List<Employee> getEmployees();

    /**
     * This Method is used to add an Employee
     * @param employee take employee as a parameter
     * @return Employee added or not
     */
    public String addEmployee(Employee employee);
}
