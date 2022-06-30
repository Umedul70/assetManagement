package com.assetManagment.assetManagement.services;

import com.assetManagment.assetManagement.entities.AssignedAsset;

import java.util.List;

/**
 * An Interface to declare Method of Assign Service
 */
public interface AssignService {
    /**
     * This Method is used to assign an asset to the employee
     * @param employeeName Take employee name
     * @param assetName Take asset name
     * @return Asset assigned To employee or not
     */
    public String assignAsset(String employeeName, String assetName);

    /**
     * This Method is used to recover an Asset from the employee
     * @param employeeName take employee name
     * @param assetName take asset name
     * @return Asset recover or not
     */
    public String recoverAsset(String employeeName, String assetName);

    /**
     * This Method is used to get the list of assigned assets
     * @return A list of Assigned Asset
     */
    public List<AssignedAsset> getAssignedAsset();
}
