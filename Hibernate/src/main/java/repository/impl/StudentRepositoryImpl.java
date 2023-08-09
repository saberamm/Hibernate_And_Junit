package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import entity.Student;
import jakarta.persistence.EntityManager;
import repository.StudentRepository;

public class StudentRepositoryImpl extends BaseRepositoryImpl<Student, Long> implements StudentRepository {
    public StudentRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Student> getEntityClass() {
        return Student.class;
    }

    @Override
    public Student findStudentByUsername(String username) {
        return getEntityManager().createQuery("from " + getEntityClass().getSimpleName() +" where username= :uname", getEntityClass())
                .setParameter("uname", username).getSingleResult();
    }
}
