package com.web.jobs.core;

import com.web.jobs.persistence.dto.EmployeeDTO;
import com.web.jobs.persistence.dto.JobDTO;
import com.web.jobs.persistence.dto.PersonDTO;
import com.web.jobs.persistence.dto.RatingDTO;
import com.web.jobs.persistence.session.HibernateTransaction;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {
        Session session = HibernateTransaction.getSessionFactory().openSession();

        session.beginTransaction();

        PersonDTO person = new PersonDTO( "name", "surname" , "username", "address", "phone","account");
        JobDTO jobDTO =  new JobDTO("jobTitle", "Description", "Category", 12345.3);
        RatingDTO ratingDTO = new RatingDTO(1235.3, "message");
        EmployeeDTO employee = new EmployeeDTO(person , jobDTO, Collections.singletonList(ratingDTO));

        session.save(employee);
        session.getTransaction().commit();

        session.close();
    }

}
