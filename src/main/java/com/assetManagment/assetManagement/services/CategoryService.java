package com.assetManagment.assetManagement.services;

import com.assetManagment.assetManagement.entities.Category;

import java.util.List;

/**
 * An Interface to declare Method of Assign Service
 */
public interface CategoryService {

    /**
     * This Method is used to get list of all categories
     * @return A list of Category
     */
    public List<Category> getCategories();

    /**
     * This Method is used to add Category
     * @param category Take Category as a parameter
     * @return Category is added or not
     */
    public String addCategory(Category category);

    /**
     * This Method is used to update Category
     * @param category Take Category as a parameter
     * @return Category Updated or not
     */
    public String updateCategory(Category category);
}
