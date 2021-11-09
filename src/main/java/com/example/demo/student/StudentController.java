package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/a1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

//    @GetMapping
//    public Optional<Student> getStudent(Student student){
//        return studentService.getStudent(student);
//    }

    @GetMapping(path = "{studentEmail}")
    public Optional<Student> getStudentByEmail(@PathVariable("studentEmail") String studentEmail){
        return studentService.getStudentByEmail(studentEmail);
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }


    @DeleteMapping(path ="{studentId}")
    public void deleteStudent(@PathVariable ("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String parentName){
        studentService.updateStudent(studentId, name, parentName , email);
    }
}
