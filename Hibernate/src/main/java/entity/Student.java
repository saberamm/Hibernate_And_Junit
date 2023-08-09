package entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "student_table")
public class Student extends Person {
    @NotNull(message = "studentId cannot be null")
    long studentId;
    @NotNull(message = "fieldOfStudy cannot be null")
    String fieldOfStudy;
    @NotNull(message = "enteringYear cannot be null")
    LocalDate enteringYear;

    public Student(long studentId, String fieldOfStudy, LocalDate enteringYear) {
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.enteringYear = enteringYear;
    }

    public Student(String firstName, String lastName, String username, String password, LocalDate birthDate, long studentId, String fieldOfStudy, LocalDate enteringYear) {
        super(firstName, lastName, username, password, birthDate);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.enteringYear = enteringYear;
    }

    public Student(String firstName, String lastName, long studentId, String fieldOfStudy, LocalDate enteringYear) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.enteringYear = enteringYear;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, String username, String password, LocalDate birthDate) {
        super(firstName, lastName, username, password, birthDate);
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public LocalDate getEnteringYear() {
        return enteringYear;
    }

    public void setEnteringYear(LocalDate enteringYear) {
        this.enteringYear = enteringYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", enteringYear=" + enteringYear +
                '}';
    }
}
