package com.example.assetManagementReact.entity;

import jakarta.persistence.*;

@Entity
public class Asset {

    @Id
    @GeneratedValue
    private Long id;

    private String assetName;
    private String assetCategory;
    private String assetNo;
    private String assetModel;

    public Asset() {}

    public Asset(Long id, String assetName, String assetCategory, String assetNo, String assetModel) {
        this.id = id;
        this.assetName = assetName;
        this.assetCategory = assetCategory;
        this.assetNo = assetNo;
        this.assetModel = assetModel;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAssetName() { return assetName; }
    public void setAssetName(String assetName) { this.assetName = assetName; }

    public String getAssetCategory() { return assetCategory; }
    public void setAssetCategory(String assetCategory) { this.assetCategory = assetCategory; }

    public String getAssetNo() { return assetNo; }
    public void setAssetNo(String assetNo) { this.assetNo = assetNo; }

    public String getAssetModel() { return assetModel; }
    public void setAssetModel(String assetModel) { this.assetModel = assetModel; }
}
