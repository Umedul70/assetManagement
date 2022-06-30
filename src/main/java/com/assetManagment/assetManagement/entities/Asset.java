package com.assetManagment.assetManagement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Create an entity of Asset
 */
@Entity
public class Asset {
    @Id
    private int id;
    private String name;
    private String purchaseDate;
    private String conditionNote;
    private String category;
    private String assignmentStatus;
    private Boolean assigned;
    private Boolean recovered;

    /**
     * Empty Constructor
     */
    public Asset() {
    }

    /**
     * Constructor
     * @param id Integer value
     * @param name String value
     * @param purchaseDate String value
     * @param conditionNote String value
     * @param category String value
     * @param assignmentStatus String value
     * @param assigned boolean value
     * @param recovered boolean value
     */
    public Asset(int id, String name, String purchaseDate, String conditionNote, String category, String assignmentStatus, Boolean assigned, Boolean recovered) {
        this.id = id;
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.conditionNote = conditionNote;
        this.category = category;
        this.assignmentStatus = assignmentStatus;
        this.assigned = assigned;
        this.recovered = recovered;
    }

    /**
     * Getter for get Asset Id
     * @return id of asset
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for set Asset Id
     * @param id Integer value
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for get Asset name
     * @return name of asset
     */
    public String getName() {
        return name;
    }

    /**
     * Setter to Set the asset name
     * @param name String value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for get Asset Id
     * @return id of asset
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Setter for set Asset Purchase Date
     * @param purchaseDate String value
     */
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * Getter for get Asset Condition Note
     * @return Condition Note of asset
     */
    public String getConditionNote() {
        return conditionNote;
    }


    /**
     * Setter to set Condition Note
     * @param conditionNote String value
     */
    public void setConditionNote(String conditionNote) {
        this.conditionNote = conditionNote;
    }

    /**
     * Getter to get asset category
     * @return Category of asset
     */
    public String getCategory() {
        return category;
    }

    /**
     * Setter to set Category of asset
     * @param category String value
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Getter to get Assignment status of Asset
     * @return assignment status of Asset
     */
    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    /**
     * Setter tp set Assignment status of Asset
     * @param assignmentStatus String value
     */
    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * Getter to get Asset is assigned or not
     * @return boolen value
     */
    public Boolean getAssigned() {
        return assigned;
    }

    /**
     * Setter to set Asset is assigned or not
     * @param assigned take boolean
     */
    public void setAssigned(Boolean assigned) {
        this.assigned = assigned;
    }

    /**
     * Get to get Asset is recovered or not
     * @return boolean value
     */
    public Boolean getRecovered() {
        return recovered;
    }

    /**
     * Setter to set Asset is recovered or not
     * @param recovered take boolean
     */
    public void setRecovered(Boolean recovered) {
        this.recovered = recovered;
    }
}
