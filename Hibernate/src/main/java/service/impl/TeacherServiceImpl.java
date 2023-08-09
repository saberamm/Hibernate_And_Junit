package service.impl;

import base.service.impl.BaseServiceImpl;
import entity.Teacher;
import repository.TeacherRepository;
import service.TeacherService;
import util.ApplicationContext;

public class TeacherServiceImpl extends BaseServiceImpl<Teacher, Long, TeacherRepository> implements TeacherService {
    public TeacherServiceImpl(TeacherRepository repository) {
        super(repository);
    }

    @Override
    public Teacher signUp(String firstname, String lastname) {
        Teacher teacher = new Teacher(firstname, lastname);
        return ApplicationContext.getTeacherService().save(teacher);
    }
}
