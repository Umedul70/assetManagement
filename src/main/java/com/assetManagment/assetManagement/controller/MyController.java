package com.assetManagment.assetManagement.controller;

import com.assetManagment.assetManagement.entities.Asset;
import com.assetManagment.assetManagement.entities.AssignedAsset;
import com.assetManagment.assetManagement.entities.Category;
import com.assetManagment.assetManagement.entities.Employee;
import com.assetManagment.assetManagement.services.AssetService;
import com.assetManagment.assetManagement.services.AssignService;
import com.assetManagment.assetManagement.services.CategoryService;
import com.assetManagment.assetManagement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    /**
     * Crete An Object of Employee Service
     */
    @Autowired
    EmployeeService employeeService;

    /**
     * Create An Object of Category Service
     */
    @Autowired
    private CategoryService categoryService;

    /**
     * Create an object of Asset Service
     */
    @Autowired
    private AssetService assetService;

    /**
     * Create an object of Assign Service
     */
    @Autowired
    public AssignService assignService;

    /**
     * This Method is used to get list of all categories
     * @return A list of Category
     */
    @GetMapping("/category")
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }

    /**
     * This Method is used to add Category
     * @param category Take Category as a parameter
     * @return Category is added or not
     */
    @PostMapping("/category")
    public String addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    /**
     * This Method is used to update Category
     * @param category Take Category as a parameter
     * @return Category Updated or not
     */
    @PutMapping("/category")
    public String updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }

    /**
     * This Method is used to get all assets
     * @return A list of all assets
     */
    @GetMapping("/asset")
    public List<Asset> getAssets(){
        return assetService.getAssets();
    }

    /**
     * This Method is used to add an Asset
     * @param asset Take Asset as a parameter
     * @return Asset added or not
     */
    @PostMapping("/asset")
    public String addAsset(@RequestBody Asset asset){
        return assetService.addAsset(asset);
    }

    /**
     * This Method is used to update Asset
     * @param asset Take Asset as a parameter
     * @return Asset Updated or not
     */
    @PutMapping("/asset")
    public String updateAsset(@RequestBody Asset asset){
        return assetService.updateAsset(asset);
    }

    /**
     * This Method is used to find An Asset by its name
     * @param assetName Take Asset name as a parameter
     * @return Find asset and return
     */
    @GetMapping("/asset/{assetName}")
    public Asset findAsset(@PathVariable String assetName){
        return assetService.findAsset(assetName);
    }

    /**
     * This Method is used to delete an Asset
     * @param assetName Take Asset name as a parameter
     * @return Asset delete or not
     */
    @DeleteMapping("/asset/{assetName}")
    public String deleteAsset(@PathVariable String assetName){
        return assetService.deleteAsset(assetName);
    }

    /**
     * This Method is used to get the list of assigned assets
     * @return A list of Assigned Asset
     */
    @GetMapping("/assignedAsset")
    public List<AssignedAsset> getAssignedAsset(){
        return assignService.getAssignedAsset();
    }

    /**
     * This Method is used to assign an asset to the employee
     * @param employeeName Take employee name
     * @param assetName Take asset name
     * @return Asset assigned To employee or not
     */
    @GetMapping("/assign/{employeeName}/{assetName}")
    public String assignAsset(@PathVariable String employeeName,@PathVariable String assetName){
        return assignService.assignAsset(employeeName,assetName);
    }

    /**
     * This Method is used to recover an Asset from the employee
     * @param employeeName take employee name
     * @param assetName take asset name
     * @return Asset recover or not
     */
    @GetMapping("/recover/{employeeName}/{assetName}")
    public String recoverAsset(@PathVariable String employeeName,@PathVariable String assetName){
        return assignService.recoverAsset(employeeName,assetName);
    }

    /**
     * This Method is used to get the list of all employees
     * @return list of all employees
     */
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    /**
     * This Method is used to add an Employee
     * @param employee take employee as a parameter
     * @return Employee added or not
     */
    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
}
