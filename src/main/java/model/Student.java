package model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String studentName;

    private String studentEmail;

    private String studentBranch;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
