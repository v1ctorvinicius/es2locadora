package org.es2locadora.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

public class GenericDAOAdapter<T, ID extends Serializable> implements GenericDAO<T, ID> {

    private final EntityManager manager;
    private final Class<T> entityClass;

    public GenericDAOAdapter(EntityManager em, Class<T> entityClass) {
        this.manager = em;
        this.entityClass = entityClass;
    }

    @Override
    public List<T> findAll() {
        return manager.createQuery("from " + entityClass.getSimpleName(), entityClass).getResultList();
    }

    @Override
    public T findById(ID id) {
        return manager.find(entityClass, id);
    }

    @Override
    public void save(T entity) {
        manager.persist(entity);
    }

    @Override
    public void update(T entity) {
        manager.merge(entity);
    }

    @Override
    public void delete(T entity) {
        manager.remove(entity);
    }

}
