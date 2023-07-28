package com.mongo.springboot.mongospringboot.controller;

import com.mongo.springboot.mongospringboot.entity.Student;
import com.mongo.springboot.mongospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/getByName/{name}")
    public List<Student> getStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }

    @GetMapping("/getByNameAndEmail")
    public Student getStudentByNameAndEmail(@RequestParam String name, @RequestParam String email){
        return studentService.getStudentByNameAndEmail(name, email);
    }

    @GetMapping("/getByNameOrEmail")
    public List<Student> getStudentByNameOrEmail(@RequestParam String name, @RequestParam String email){
        return studentService.getStudentByNameOrEmail(name, email);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getAllByPagination")
    public List<Student> getAllByPagination(@RequestParam int pageNo, @RequestParam int pageSize){
        return studentService.getAllByPagination(pageNo, pageSize);
    }

    @GetMapping("/getAllWithSorting")
    public List<Student> getAllWithSorting(){
        return studentService.getAllWithSorting();
    }

    @GetMapping("/getByDeptName")
    public List<Student> getStudentByDepartmentName(@RequestParam String deptName){
        return studentService.getStudentByDepartmentName(deptName);
    }

    @GetMapping("/getBySubjectName")
    public List<Student> getBySubjectName(@RequestParam String subName){
        return studentService.getBySubjectName(subName);
    }

    @GetMapping("/getByLikeQuery")
    public List<Student> getByLikeQuery(@RequestParam String emailLike){
        return studentService.getByLikeQuery(emailLike);
    }

    @GetMapping("/startsWithName")
    public List<Student> startsWithName(@RequestParam String name){
        return studentService.startsWithName(name);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id){
        return studentService.deleteStudent(id);
    }
}
