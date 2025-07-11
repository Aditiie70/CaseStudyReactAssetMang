package com.example.assetManagementReact.entity;

import jakarta.persistence.*;

@Entity
public class AssetRequest {

    @Id
    @GeneratedValue
    private Long id;

    private String assetNo;
    private String userEmail;
    private String status = "Pending";

    public AssetRequest() {}

    public AssetRequest(Long id, String assetNo, String userEmail, String status) {
        this.id = id;
        this.assetNo = assetNo;
        this.userEmail = userEmail;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAssetNo() { return assetNo; }
    public void setAssetNo(String assetNo) { this.assetNo = assetNo; }

    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
