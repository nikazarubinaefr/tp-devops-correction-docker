package fr.takima.training.simpleapi.controller;

import fr.takima.training.simpleapi.entity.Student;
import fr.takima.training.simpleapi.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final StudentService studentService;

    // Le constructeur (une seule fois !)
    public DepartmentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{departmentName}/students")
    public ResponseEntity<List<Student>> getStudentsByDepartment(@PathVariable String departmentName) {
        List<Student> students = studentService.getStudentsByDepartmentName(departmentName);
        return ResponseEntity.ok(students);
    }

} 