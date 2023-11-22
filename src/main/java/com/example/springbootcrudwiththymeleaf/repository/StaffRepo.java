package com.example.springbootcrudwiththymeleaf.repository;

import com.example.springbootcrudwiththymeleaf.Entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff, Integer> {
}
