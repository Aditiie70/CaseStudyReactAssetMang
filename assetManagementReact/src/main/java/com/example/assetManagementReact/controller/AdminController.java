package com.example.assetManagementReact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.assetManagementReact.entity.Asset;
import com.example.assetManagementReact.entity.AssetRequest;
import com.example.assetManagementReact.entity.ServiceRequest;
import com.example.assetManagementReact.service.AssetRequestService;
import com.example.assetManagementReact.service.AssetService;
import com.example.assetManagementReact.service.ServiceRequestService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:3000/")
public class AdminController {

    @Autowired
    private AssetService assetService;

    @Autowired
    private AssetRequestService assetRequestService;

    @Autowired
    private ServiceRequestService serviceRequestService;

    // ✅ Add a new asset
    @PostMapping("/assets")
    public ResponseEntity<Asset> addAsset(@RequestBody Asset asset) {
        return ResponseEntity.ok(assetService.addAsset(asset));
    }

    // ✅ Delete asset by ID
    @DeleteMapping("/assets/{id}")
    public ResponseEntity<Void> deleteAsset(@PathVariable Long id) {
        assetService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // ✅ Get all asset requests
    @GetMapping("/assetRequests")
    public ResponseEntity<List<AssetRequest>> getAllAssetRequests() {
        return ResponseEntity.ok(assetRequestService.getAll());
    }

    // ✅ Get all service requests
    @GetMapping("/serviceRequests")
    public ResponseEntity<List<ServiceRequest>> getAllServiceRequests() {
        return ResponseEntity.ok(serviceRequestService.getAll());
    }

    // ✅ Update asset request status
    @PutMapping("/assetRequests/{id}")
    public ResponseEntity<AssetRequest> updateAssetRequestStatus(@PathVariable Long id, @RequestBody AssetRequest request) {
        AssetRequest updated = assetRequestService.updateStatus(id, request.getStatus());
        return ResponseEntity.ok(updated);
    }

    // ✅ Update service request status
    @PutMapping("/serviceRequests/{id}")
    public ResponseEntity<ServiceRequest> updateServiceRequestStatus(@PathVariable Long id, @RequestBody ServiceRequest request) {
        ServiceRequest updated = serviceRequestService.updateStatus(id, request.getStatus());
        return ResponseEntity.ok(updated);
    }
}
