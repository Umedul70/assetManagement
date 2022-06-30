package com.assetManagment.assetManagement.dao;

import com.assetManagment.assetManagement.entities.AssignedAsset;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This is an Interface that extends JpaRepository To connect with the database
 */
public interface AssignRepo extends JpaRepository<AssignedAsset,Integer> {
}
