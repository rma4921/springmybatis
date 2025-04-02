package com.estsoft.springmybatis.controller;

import com.estsoft.springmybatis.model.Students;
import com.estsoft.springmybatis.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Students> getStudentList(@RequestParam("id") Long id) {
        return studentService.selectStudents(id);
    }

    @GetMapping("/students/count")
    public int countStudents() {
        int result = studentService.countAll();
        System.out.println("result: " + result);
        return result;
    }

    @PostMapping("/insert")
    public void insertStudent(@RequestBody Students students) {
        studentService.insertStudent(students);
    }

}
