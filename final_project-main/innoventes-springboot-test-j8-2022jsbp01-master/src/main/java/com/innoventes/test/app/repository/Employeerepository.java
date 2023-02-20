package com.innoventes.test.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innoventes.test.app.entity.EmployeeEntity;
@Repository
public interface Employeerepository extends JpaRepository<EmployeeEntity, Integer>{

}
