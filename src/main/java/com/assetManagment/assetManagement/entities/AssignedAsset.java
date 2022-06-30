package com.assetManagment.assetManagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Crete entity for Assigned Asset
 */
@Entity
public class AssignedAsset {
    @Id
    @GeneratedValue
    private int id;
    private int assetId;
    private String assetName;
    private int userId;
    private String userName;

    /**
     * empty constructor
     */
    public AssignedAsset() {
    }

    /**
     * Constructor with parameters
     * @param id integer value
     * @param assetId integer value
     * @param assetName String value
     * @param userId integer value
     * @param userName String value
     */
    public AssignedAsset(int id, int assetId, String assetName, int userId, String userName) {
        this.id = id;
        this.assetId = assetId;
        this.assetName = assetName;
        this.userId = userId;
        this.userName = userName;
    }

    /**
     * Getter to get id of Assigned asset
     * @return id of assigned asset
     */
    public int getId() {
        return id;
    }

    /**
     * Setter to set id of assigned asset
     * @param id integer value
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter to get asset id
     * @return asset id
     */
    public int getAssetId() {
        return assetId;
    }

    /**
     * Setter to set asset id
     * @param assetId integer vlaue
     */
    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    /**
     * Getter to get Asset name
     * @return asset name
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * Setter to set Asset name
     * @param assetName String value
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * Getter to get Employee id
     * @return Employee id
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Setter to set Employee id
     * @param userId integer value
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Getter to get Employee name
     * @return Employee name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter to set Employee name
     * @param userName String value
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
