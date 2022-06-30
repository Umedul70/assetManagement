package com.assetManagment.assetManagement.services;

import com.assetManagment.assetManagement.dao.AssetRepo;
import com.assetManagment.assetManagement.dao.AssignRepo;
import com.assetManagment.assetManagement.dao.EmployeeRepo;
import com.assetManagment.assetManagement.entities.Asset;
import com.assetManagment.assetManagement.entities.AssignedAsset;
import com.assetManagment.assetManagement.entities.Employee;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Objects;

/**
 * A class to implement methods of Assign Service
 */
@Service
public class AssignServiceImpl implements AssignService{

    @Autowired
    AssetService assetService;
    @Autowired
    private AssetRepo assetRepo;
    @Autowired
    private AssignRepo assignRepo;
    @Autowired
    private EmployeeRepo employeeRepo;

    /**
     * This Method is used to assign an asset to the employee
     * @param employeeName Take employee name
     * @param assetName Take asset name
     * @return Asset assigned To employee or not
     */
    @Override
    public String assignAsset(String employeeName, String assetName){
        Asset asset = assetService.findAsset(assetName);
        List<Employee> employees = employeeRepo.findAll();
        AssignedAsset a = new AssignedAsset();
        for (Employee employee:employees){
            if (Objects.equals(employee.getName(), employeeName) && Objects.equals(asset.getAssignmentStatus(),"Available")){
                asset.setAssigned(true);
                asset.setRecovered(false);
                asset.setAssignmentStatus("Unavailable");
                assetRepo.save(asset);
                a.setAssetId(asset.getId());
                a.setAssetName(asset.getName());
                a.setUserId(employee.getId());
                a.setUserName(employeeName);
                assignRepo.save(a);
                return "Assign Sucessfully";
            }
        }

        return "Can't Assign";
    }

    /**
     * This Method is used to recover an Asset from the employee
     * @param employeeName take employee name
     * @param assetName take asset name
     * @return Asset recover or not
     */
    @Override
    public String recoverAsset(String employeeName, String assetName) {
        List<AssignedAsset> assignedAssets = assignRepo.findAll();
        Asset asset=null;
        for (AssignedAsset assignedAsset:assignedAssets){
            if (Objects.equals(assignedAsset.getAssetName(), assetName) && Objects.equals(assignedAsset.getUserName(), employeeName)){
                asset = assetService.findAsset(assetName);
                asset.setAssigned(false);
                asset.setRecovered(true);
                asset.setAssignmentStatus("Available");
                assetRepo.save(asset);
                assignRepo.save(assignedAsset);
                return "Recovered Sucessfully";
            }
        }
        return "Cannot Recover";
    }

    /**
     * This Method is used to get the list of assigned assets
     * @return A list of Assigned Asset
     */
    @Override
    public List<AssignedAsset> getAssignedAsset() {
        return assignRepo.findAll();
    }
}
