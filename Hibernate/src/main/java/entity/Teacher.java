package entity;

import entity.enums.TeacherRate;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "teacher_table")
public class Teacher extends Person{
    long teacherId;
    String degree;
    long salary;
    TeacherRate teacherRate;

    public Teacher(long teacherId, String degree, long salary, TeacherRate teacherRate) {
        this.teacherId = teacherId;
        this.degree = degree;
        this.salary = salary;
        this.teacherRate = teacherRate;
    }

    public Teacher(String firstName, String lastName, String username, String password, LocalDate birthDate, long teacherId, String degree, long salary, TeacherRate teacherRate) {
        super(firstName, lastName, username, password, birthDate);
        this.teacherId = teacherId;
        this.degree = degree;
        this.salary = salary;
        this.teacherRate = teacherRate;
    }

    public Teacher(String firstName, String lastName, long teacherId, String degree, long salary, TeacherRate teacherRate) {
        super(firstName, lastName);
        this.teacherId = teacherId;
        this.degree = degree;
        this.salary = salary;
        this.teacherRate = teacherRate;
    }

    public Teacher() {

    }

    public Teacher(String firstName, String lastName, String username, String password, LocalDate birthDate) {
        super(firstName, lastName, username, password, birthDate);
    }

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public TeacherRate getTeacherRate() {
        return teacherRate;
    }

    public void setTeacherRate(TeacherRate teacherRate) {
        this.teacherRate = teacherRate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", degree='" + degree + '\'' +
                ", salary=" + salary +
                ", teacherRate=" + teacherRate +
                '}';
    }
}
