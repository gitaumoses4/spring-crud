package dao;

import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImp implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean saveStudent(Student student) {
        try {
            sessionFactory.getCurrentSession().save(student);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<Student> getStudents() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Student> query = currentSession.createQuery("from Student", Student.class);
        return query.getResultList();
    }

    @Override
    public boolean deleteStudent(Student student) {
        try {
            sessionFactory.getCurrentSession().delete(student);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public List<Student> getStudentById(Student student) {
        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("from Student where studentId=:studentId", Student.class);
        query.setParameter("studentId", student.getStudentId());

        return query.getResultList();
    }

    @Override
    public boolean updateStudent(Student student) {
        try {
            sessionFactory.getCurrentSession().update(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
