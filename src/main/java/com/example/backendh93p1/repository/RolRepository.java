package com.example.backendh93p1.repository;

import com.example.backendh93p1.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RolEntity,Integer> {
}
