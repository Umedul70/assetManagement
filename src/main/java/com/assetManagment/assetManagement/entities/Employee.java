package com.assetManagment.assetManagement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Create Entity for Employee
 */
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String designation;

    /**
     * empty constructor
     */
    public Employee() {
    }

    /**
     * Constructor with parameter
     * @param id Integer value
     * @param name String value
     * @param designation String value
     */
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    /**
     * Getter to get designation of Employee
     * @return desiganation of Employee
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Setter to set designation of Employee
     * @param designation
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * Getter to get name of Employee
     * @return name of employee
     */
    public String getName() {
        return name;
    }

    /**
     * Setter to set name of Employee
     * @param name String value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter to get id of Employee
     * @return Id of Employee
     */
    public int getId() {
        return id;
    }

    /**
     * Setter to set id of Employee
     * @param id Integer value
     */
    public void setId(int id) {
        this.id = id;
    }
}
