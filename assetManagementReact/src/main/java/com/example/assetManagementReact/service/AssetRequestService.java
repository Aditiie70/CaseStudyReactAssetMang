package com.example.assetManagementReact.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.assetManagementReact.entity.AssetRequest;
import com.example.assetManagementReact.repository.AssetRequestRepository;

@Service
public class AssetRequestService {

    @Autowired
    private AssetRequestRepository repo;

    public AssetRequest save(AssetRequest request) {
        return repo.save(request);
    }

    public List<AssetRequest> getAll() {
        return repo.findAll();
    }

    public AssetRequest updateStatus(Long id, String newStatus) {
        AssetRequest req = repo.findById(id).orElseThrow();
        req.setStatus(newStatus);
        return repo.save(req);
    }

}
