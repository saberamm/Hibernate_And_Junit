package base.repository.impl;

import base.entity.BaseEntity;
import base.repository.BaseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.io.Serializable;
import java.util.List;

public abstract class BaseRepositoryImpl<E extends BaseEntity<ID>, ID extends Serializable> implements BaseRepository<E, ID> {

    protected final EntityManager entityManager;

    public BaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract Class<E> getEntityClass();

    @Override
    public E save(E e) {
        entityManager.persist(e);
        return e;
    }

    @Override
    public E update(E e) {
        return entityManager.merge(e);
    }

    @Override
    public void delete(E e) {

        entityManager.remove(e);
    }

    @Override
    public E findById(ID id) {
        return entityManager.find(getEntityClass(), id);
    }

    @Override
    public List<E> findAll() {
        return entityManager.createQuery("from " + getEntityClass().getSimpleName(), getEntityClass()).getResultList();
    }

    @Override
    public boolean isContainById(ID id) {
        TypedQuery<Long> query = entityManager.createQuery("select count(e) from " + getEntityClass().getSimpleName() + " e where e.id = :pk", Long.class);
        Long countId = query.setParameter("pk", id).getSingleResult();
        return countId == 1L;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
