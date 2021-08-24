package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
