package com.mongo.springboot.mongospringboot.service;

import com.mongo.springboot.mongospringboot.entity.Student;
import com.mongo.springboot.mongospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(String id){
        return studentRepository.findById(id).get();
    }

    public List<Student> getStudentByName(String name){
        return studentRepository.findByName(name);
    }

    public List<Student> getStudentByDepartmentName(String deptName){
        return studentRepository.findByDepartmentDepartmentName(deptName);
    }

    public List<Student> getBySubjectName(String subName){
        return studentRepository.findBySubjectsSubjectName(subName);
    }

    public List<Student> getByLikeQuery(String emailLike){
        return studentRepository.findByEmailIsLike(emailLike);
    }

    public List<Student> startsWithName(String name){
        return studentRepository.findByNameStartsWith(name);
    }

    public Student getStudentByNameAndEmail(String name, String email){
        return studentRepository.findByNameAndEmail(name, email);
    }

    public List<Student> getStudentByNameOrEmail(String name, String email){
        return studentRepository.findByNameOrEmail(name, email);
    }

    public List<Student> getAllByPagination(int pageNo, int pageSize){
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return studentRepository.findAll(pageable).getContent();
    }

    public List<Student> getAllWithSorting(){
        Sort sort = Sort.by(Sort.Direction.ASC, "name"); // can also give multiple properties, name, email etc
        return studentRepository.findAll(sort);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public String deleteStudent(String id){
        studentRepository.deleteById(id);
        return "Successfully deleted student";
    }
}
