package service;

import model.Student;

import java.util.List;

public interface StudentService {
    boolean saveStudent(Student student);

    List<Student> getStudents();

    boolean deleteStudent(Student student);

    List<Student> getStudentById(Student student);

    boolean updateStudent(Student student);
}
