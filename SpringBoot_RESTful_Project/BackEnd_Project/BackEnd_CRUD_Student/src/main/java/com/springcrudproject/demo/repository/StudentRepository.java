package com.springcrudproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcrudproject.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
