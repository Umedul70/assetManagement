package com.assetManagment.assetManagement.dao;

import com.assetManagment.assetManagement.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This is an Interface that extends JpaRepository To connect with the database
 */
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
