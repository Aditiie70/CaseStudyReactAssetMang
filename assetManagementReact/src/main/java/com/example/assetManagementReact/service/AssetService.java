package com.example.assetManagementReact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assetManagementReact.entity.Asset;
import com.example.assetManagementReact.repository.AssetRepository;

@Service
public class AssetService {

    @Autowired
    private AssetRepository repo;

    public Asset addAsset(Asset asset) {
        return repo.save(asset);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Asset> getAll() {
        return repo.findAll();
    }
}
