package com.assetManagment.assetManagement.services;

import com.assetManagment.assetManagement.dao.AssetRepo;
import com.assetManagment.assetManagement.entities.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * A class to implement methods of Asset Service
 */
@Service
public class AssetserviceImpl implements AssetService{

    @Autowired
    private AssetRepo assetRepo;

    /**
     * This Method is used to get all assets
     * @return A list of all assets
     */
    @Override
    public List<Asset> getAssets() {
        return assetRepo.findAll();
    }

    /**
     * This Method is used to add an Asset
     * @param asset Take Asset as a parameter
     * @return Asset added or not
     */
    @Override
    public String addAsset(Asset asset) {
        assetRepo.save(asset);
        return asset.getName()+"Added sucessfully";
    }

    /**
     * This Method is used to update Asset
     * @param asset Take Asset as a parameter
     * @return Asset Updated or not
     */
    @Override
    public String updateAsset(Asset asset) {
        assetRepo.save(asset);
        return asset.getName()+"Updated Sucessfully";
    }

    /**
     * This Method is used to find An Asset by its name
     * @param assetName Take Asset name as a parameter
     * @return Find asset and return
     */
    @Override
    public Asset findAsset(String assetName) {
        List<Asset> list = assetRepo.findAll();
        Asset a = null;
        for (Asset asset : list) {
            if (Objects.equals(asset.getName(), assetName)) {
                a = asset;
                break;
            }
        }
        return a;
    }

    /**
     * This Method is used to delete an Asset
     * @param assetName Take Asset name as a parameter
     * @return Asset delete or not
     */
    @Override
    public String deleteAsset(String assetName){
        Asset asset = findAsset(assetName);
        if (asset.getAssigned()==Boolean.FALSE){
            assetRepo.delete(asset);
            return "Asset Delete Sucessfully";
        }
        return "Asset Cannot Delete";
    }
}
