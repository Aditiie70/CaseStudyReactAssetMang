package com.example.assetManagementReact.entity;

import jakarta.persistence.*;

@Entity
public class ServiceRequest {

    @Id
    @GeneratedValue
    private Long id;

    private String assetNo;
    private String description;
    private String issueType;
    private String userEmail;
    private String status = "Pending";

    public ServiceRequest() {}

    public ServiceRequest(Long id, String assetNo, String description, String issueType, String userEmail, String status) {
        this.id = id;
        this.assetNo = assetNo;
        this.description = description;
        this.issueType = issueType;
        this.userEmail = userEmail;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAssetNo() { return assetNo; }
    public void setAssetNo(String assetNo) { this.assetNo = assetNo; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getIssueType() { return issueType; }
    public void setIssueType(String issueType) { this.issueType = issueType; }

    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
