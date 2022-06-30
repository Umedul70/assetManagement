package com.assetManagment.assetManagement.services;

import com.assetManagment.assetManagement.dao.CategoryRepo;
import com.assetManagment.assetManagement.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * A class to implement methods of Category Service
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepo categoryRepo;

    /**
     * This Method is used to get list of all categories
     * @return A list of Category
     */
    @Override
    public List<Category> getCategories() {
        return categoryRepo.findAll();
    }


    /**
     * This Method is used to add Category
     * @param category Take Category as a parameter
     * @return Category is added or not
     */
    @Override
    public String addCategory(Category category){
        categoryRepo.save(category);
        return "Sucessfully Add Category "+category.getName();
    }


    /**
     * This Method is used to update Category
     * @param category Take Category as a parameter
     * @return Category Updated or not
     */
    @Override
    public String updateCategory(Category category) {
        categoryRepo.save(category);
        return "Sucessfully Update Category "+category.getName();
    }
}
