package com.assetManagment.assetManagement.services;

import com.assetManagment.assetManagement.dao.EmployeeRepo;
import com.assetManagment.assetManagement.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * A class to implement methods of Category Service
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;


    /**
     * This Method is used to get the list of all employees
     * @return list of all employees
     */
    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    /**
     * This Method is used to add an Employee
     * @param employee take employee as a parameter
     * @return Employee added or not
     */
    @Override
    public String addEmployee(Employee employee){
        employeeRepo.save(employee);
        return "Employee added Sucessfully";
    }
}
