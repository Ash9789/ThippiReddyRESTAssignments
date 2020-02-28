package com.bharath.springdatarest.repository;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdatarest.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
