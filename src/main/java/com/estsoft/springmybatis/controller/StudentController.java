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

    // 요청 방식: GET /students
    // 혹은 GET /students?id=1
    @GetMapping("/students")
    public List<Students> getStudentList(@RequestParam(required = false) Long id) {
        return studentService.selectStudents(id);
    }

    @GetMapping("/students/count")
    public int countStudents() {
        int result = studentService.countAll();
        System.out.println("result: " + result);
        return result;
    }

    // 작성해본 코드
    @PostMapping("/insert")
    public void insertStudent(@RequestBody Students students) {
        studentService.insertStudent(students);
    }

    // 실습 코드
    @PostMapping("/students")
    public int saveStudent(@RequestBody Students students) {
        int saveCount = studentService.saveStudent(students);
        return saveCount;
    }

    // PUT /students/{id}
    @PutMapping("/students/{id}") // @PathVariable pass 상에 변수를 두어 가져올 수 있음.
    public int updateStudent(@PathVariable Integer id,
                             @RequestBody Students students) {
        students.setId(id);
        return studentService.updateStudent(students);
    }

    // DELETE /students/{id}
    @DeleteMapping("/students/{id}")
    public int deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}
