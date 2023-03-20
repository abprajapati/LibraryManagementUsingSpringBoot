package com.example.LibraryManagementSys.services;

import com.example.LibraryManagementSys.models.Student;
import com.example.LibraryManagementSys.repositories.StudentRepository;
import com.example.LibraryManagementSys.request.StudentCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void create(StudentCreateRequest studentCreateRequest){
        Student student = studentCreateRequest.to();
        studentRepository.save(student);
    }

    public Student findStudentByStudentId(int sId){
        return studentRepository
                .findById(sId).orElse(null);
    }

}
