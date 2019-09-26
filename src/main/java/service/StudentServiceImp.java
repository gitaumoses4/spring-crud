package service;

import dao.StudentDAO;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDAO dao;

    @Override
    public boolean saveStudent(Student student) {
        return dao.saveStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return dao.getStudents();
    }

    @Override
    public boolean deleteStudent(Student student) {
        return dao.deleteStudent(student);
    }

    @Override
    public List<Student> getStudentById(Student student) {
        return dao.getStudentById(student);
    }

    @Override
    public boolean updateStudent(Student student) {
        return dao.updateStudent(student);
    }
}
