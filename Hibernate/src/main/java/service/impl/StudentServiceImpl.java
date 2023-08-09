package service.impl;

import base.service.impl.BaseServiceImpl;
import entity.Student;
import repository.StudentRepository;
import service.StudentService;
import util.ApplicationContext;

public class StudentServiceImpl extends BaseServiceImpl<Student, Long, StudentRepository> implements StudentService {
    public StudentServiceImpl(StudentRepository repository) {
        super(repository);
    }

    @Override
    public Student signUp(String firstname, String lastname) {
        Student student = new Student(firstname, lastname);
        return ApplicationContext.getStudentService().save(student);
    }
}
