package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class Controller {

    @Autowired
    private StudentService studentService;

    @PostMapping("")
    public boolean saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("")
    public List<Student> allStudents() {
        return studentService.getStudents();
    }

    @DeleteMapping("{student_id}")
    public boolean deleteStudent(@PathVariable("student_id") int studentId, Student student) {
        student.setStudentId(studentId);
        return studentService.deleteStudent(student);
    }

    @GetMapping("{student_id}")
    public List<Student> getStudentById(@PathVariable("student_id") int student_id, Student student) {
        student.setStudentId(student_id);
        return studentService.getStudentById(student);
    }

    @PutMapping("{student_id}")
    public boolean updateStudent(@RequestBody Student student, @PathVariable("student_id") int studentId) {
        student.setStudentId(studentId);
        return studentService.updateStudent(student);
    }
}
