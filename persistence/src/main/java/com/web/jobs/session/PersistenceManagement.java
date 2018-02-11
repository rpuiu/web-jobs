package com.web.jobs.session;

import com.web.jobs.dao.EntityModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class PersistenceManagement implements PersistenceDao {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        final ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void insert(EntityModel entityModel) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(entityModel);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(EntityModel entityModel) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(entityModel);
        session.getTransaction().commit();
        session.close();
    }

    public Object findById(Class clazz, Integer id) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Object object =  session.get(clazz, id);
        session.close();

        return object;
    }
}
