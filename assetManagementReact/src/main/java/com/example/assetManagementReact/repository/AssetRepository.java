package com.example.assetManagementReact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assetManagementReact.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {
	
}
