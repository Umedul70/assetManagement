package com.assetManagment.assetManagement.dao;

import com.assetManagment.assetManagement.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This is an Interface that extends JpaRepository To connect with the database
 */
public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
