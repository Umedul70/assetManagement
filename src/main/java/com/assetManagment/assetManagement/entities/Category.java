package com.assetManagment.assetManagement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Create Entity for Category
 * */
@Entity
public class Category {
    @Id
    private int id;
    private String name;
    private String description;


    /**
     * empty constructor
     */
    public Category() {
    }

    /**
     * Constructor with parameters
     * @param id Integer value
     * @param name String value
     * @param description String value
     */
    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Getter to get id of category
     * @return id of category
     */
    public int getId() {
        return id;
    }

    /**
     * Setter to set id of Category
     * @param id Integer value
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter to get name of Category
     * @return name of Category
     */
    public String getName() {
        return name;
    }

    /**
     * Setter to set name of Category
     * @param name String value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter to get description of Category
     * @return description of Category
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter to set description of Category
     * @param description String Value
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
