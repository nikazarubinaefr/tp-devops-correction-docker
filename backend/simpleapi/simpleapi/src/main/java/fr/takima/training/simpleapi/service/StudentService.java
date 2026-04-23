package fr.takima.training.simpleapi.service;

import fr.takima.training.simpleapi.entity.Student;
import fr.takima.training.simpleapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentsByDepartmentName(String departmentName) {
        return studentRepository.findByDepartmentName(departmentName);
    }
}
