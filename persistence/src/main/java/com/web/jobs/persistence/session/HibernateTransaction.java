package com.web.jobs.persistence.session;

import com.web.jobs.persistence.entity.DbEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class HibernateTransaction implements PersistenceEntity {

    private static HibernateTransaction INSTANCE = null;

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        final ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    private HibernateTransaction() {
        // Default constructor
    }

    public static HibernateTransaction getHibernateTransaction() {
        if (INSTANCE == null) {
            return new HibernateTransaction();
        } else {
            return INSTANCE;
        }
    }

    private SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public void insert(DbEntity dbEntity) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(dbEntity);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(DbEntity dbEntity) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(dbEntity);
        session.getTransaction().commit();
        session.close();
    }

    public Object findById(Class clazz, Long id) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Object object =  session.get(clazz, id);
        session.close();

        return object;
    }
    
    public List findAll(Class clazz) {
        // Open a session
        Session session = getSessionFactory().openSession();
        // Create CriteriaBuilder
        CriteriaBuilder builder = session.getCriteriaBuilder();
        // Create CriteriaQuery
        CriteriaQuery criteria = builder.createQuery(clazz);
        // Specify criteria root
        criteria.from(clazz);
        // Execute query
        List result = session.createQuery(criteria).getResultList();
        // Close the session
        session.close();

        return result;
    }
}
