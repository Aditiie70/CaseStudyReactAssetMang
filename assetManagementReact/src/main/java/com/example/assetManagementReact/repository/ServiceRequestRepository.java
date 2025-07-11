package com.example.assetManagementReact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assetManagementReact.entity.ServiceRequest;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {
	
}

