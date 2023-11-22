package com.example.springbootcrudwiththymeleaf.Service;

import java.util.List;
import com.example.springbootcrudwiththymeleaf.Entity.Staff;
public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}

