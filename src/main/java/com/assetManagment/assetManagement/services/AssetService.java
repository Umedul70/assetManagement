package com.assetManagment.assetManagement.services;

import com.assetManagment.assetManagement.entities.Asset;
import com.assetManagment.assetManagement.entities.Category;

import java.util.List;

/**
 * An Interface to declare Method of Asset Service
 */
public interface AssetService {
    /**
     * This method is used to get list of all assets
     * @return list of assets
     */
    public List<Asset> getAssets();

    /**
     * This method is used to add an asset
     * @param asset Asset type parameter
     * @return Asset added or not
     */
    public String addAsset(Asset asset);

    /**
     * This method is used to update an asset
     * @param asset Asset type parameter
     * @return asset updated or not
     */
    public String updateAsset(Asset asset);

    /**
     * This method is used to find an asset by name
     * @param assetName String value
     * @return Asset
     */
    public Asset findAsset(String assetName);

    /**
     * This method is used to delete an asset
     * @param assetName String value
     * @return asset deleted or not
     */
    public String deleteAsset(String assetName);
}
