package com.example.assetManagementReact.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.assetManagementReact.entity.ServiceRequest;
import com.example.assetManagementReact.repository.ServiceRequestRepository;

@Service
public class ServiceRequestService {

    @Autowired
    private ServiceRequestRepository repo;

    public ServiceRequest save(ServiceRequest request) {
        return repo.save(request);
    }

    public List<ServiceRequest> getAll() {
        return repo.findAll();
    }

    public ServiceRequest updateStatus(Long id, String newStatus) {
        ServiceRequest req = repo.findById(id).orElseThrow();
        req.setStatus(newStatus);
        return repo.save(req);
    }

}
