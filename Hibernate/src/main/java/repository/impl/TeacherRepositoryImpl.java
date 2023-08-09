package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import entity.Teacher;
import jakarta.persistence.EntityManager;
import repository.TeacherRepository;

public class TeacherRepositoryImpl extends BaseRepositoryImpl<Teacher, Long> implements TeacherRepository {
    public TeacherRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Teacher> getEntityClass() {
        return Teacher.class;
    }

    @Override
    public Teacher findTeacherByUsername(String username) {
        return getEntityManager().createQuery("from " + getEntityClass().getSimpleName() +" where username= :uname", getEntityClass())
                .setParameter("uname", username).getSingleResult();
    }
}
