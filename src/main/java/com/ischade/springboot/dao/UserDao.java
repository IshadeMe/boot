package com.ischade.springboot.dao;

import com.ischade.springboot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDao implements Dao<User, Integer> {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAll() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void add(User entity) {
        em.persist(entity);
    }

    @Override
    public User getById(Integer id) {
        return em.find(User.class, id);
    }

    @Override
    public void deleteById(Integer id) {
        em.remove(em.find(User.class, id));
    }

    @Override
    public void update(User entity) {
        em.merge(entity);
    }
}
