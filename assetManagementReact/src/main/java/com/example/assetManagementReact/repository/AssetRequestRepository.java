package com.example.assetManagementReact.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.assetManagementReact.entity.AssetRequest;

public interface AssetRequestRepository extends JpaRepository<AssetRequest, Long> {}
