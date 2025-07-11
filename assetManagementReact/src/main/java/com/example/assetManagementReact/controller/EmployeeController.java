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
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000/")
public class EmployeeController {

    @Autowired
    private AssetService assetService;

    @Autowired
    private AssetRequestService assetRequestService;

    @Autowired
    private ServiceRequestService serviceRequestService;

    // ✅ Get all assets (for dashboard display)
    @GetMapping("/assets")
    public ResponseEntity<List<Asset>> getAssets() {
        return ResponseEntity.ok(assetService.getAll());
    }

    // ✅ Employee requests an asset
    @PostMapping("/asset/request")
    public ResponseEntity<AssetRequest> requestAsset(@RequestBody AssetRequest request) {
        return ResponseEntity.ok(assetRequestService.save(request));
    }

    // ✅ Employee raises a service request
    @PostMapping("/asset/service")
    public ResponseEntity<ServiceRequest> raiseService(@RequestBody ServiceRequest sr) {
        return ResponseEntity.ok(serviceRequestService.save(sr));
    }
}
