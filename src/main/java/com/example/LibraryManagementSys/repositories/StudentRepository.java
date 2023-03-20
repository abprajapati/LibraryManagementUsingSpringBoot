package com.example.LibraryManagementSys.repositories;

import com.example.LibraryManagementSys.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository  -- Not mandatory because SimpleJPARepository class has a repository annotation
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
