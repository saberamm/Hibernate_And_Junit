package service;

import base.service.BaseService;
import entity.Teacher;

public interface TeacherService extends BaseService<Teacher, Long> {
    Teacher signUp (String firstname, String lastname);
}
