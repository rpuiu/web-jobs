package com.web.jobs;

import com.web.jobs.model.Test;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        Session session = com.web.jobs.session.Session.getSessionFactory().openSession();

        session.beginTransaction();
        Test test = new Test("test");
        session.save(test);
        session.getTransaction().commit();

        session.close();
    }

}
