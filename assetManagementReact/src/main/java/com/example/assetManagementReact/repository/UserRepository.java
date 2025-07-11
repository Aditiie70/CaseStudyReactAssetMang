package com.example.assetManagementReact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.assetManagementReact.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
