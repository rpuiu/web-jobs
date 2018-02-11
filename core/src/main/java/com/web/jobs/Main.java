package com.web.jobs;

import com.web.jobs.model.*;
import org.hibernate.Session;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Session session = com.web.jobs.session.Session.getSessionFactory().openSession();

        session.beginTransaction();

        Person person = new Person( "name", "surname" , "username", "address", "phone","account");
        Job job  =  new Job("jobTitle", "Description", "Category", 12345.3);
        Rating rating = new Rating(1235.3, "message");
        Employee employee = new Employee(person , job, Arrays.asList(rating));

        session.save(employee);
        session.getTransaction().commit();

        session.close();
    }

}
